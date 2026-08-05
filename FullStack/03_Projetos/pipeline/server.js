const express = require('express');
const multer = require('multer');
const mysql = require('mysql2/promise');
const cors = require('cors');
const fs = require('fs');
const path = require('path');
// Importação da nova biblioteca resiliente a falhas estruturais
const PdfTextReader = require('pdf-text-reader');

const app = express();
app.use(cors());
app.use(express.json());

// Servir a pasta public como arquivos estáticos para o front-end
app.use(express.static(path.join(__dirname, 'public')));

// 1. GARANTIR QUE A PASTA UPLOADS EXISTE (Evita erro ENOENT)
const dirUploads = path.join(__dirname, 'uploads');
if (!fs.existsSync(dirUploads)){
  fs.mkdirSync(dirUploads);
}

// 2. CONFIGURAÇÃO DA BASE DE DADOS MYSQL COM POOL
const pool = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: '1234', // Inserir a chave de acesso ao MySQL
  database: 'pdf_pipeline',
  waitForConnections: true,
  connectionLimit: 10,
  queueLimit: 0
});

// 3. CONFIGURAÇÃO DO MULTER PARA UPLOAD DE ARQUIVOS
const storage = multer.diskStorage({
  destination: (req, file, cb) => {
    cb(null, 'uploads/');
  },
  filename: (req, file, cb) => {
    cb(null, Date.now() + '-' + file.originalname);
  }
});
const upload = multer({ storage: storage });

// 4. ROTA DE UPLOAD E PROCESSAMENTO DE PDF
app.post('/api/upload', upload.single('pdfDocument'), async (req, res) => {
  let filePath = null; 
  try {
    if (!req.file) {
      return res.status(400).json({ error: 'Nenhum arquivo enviado.' });
    }
    filePath = req.file.path;
    const fileName = req.file.originalname;

    // A nova biblioteca lê diretamente do caminho do arquivo física no disco, 
    // dispensando a necessidade de ler o Buffer com fs.promises.readFile.
    const extractedText = await PdfTextReader.readText(filePath);

    // Expressão Regular (Regex) ancorada para buscar o Valor Total
    const regexValor = /Valor\s+Total.*?.R\$\s*([0-9]{1,3}(?:\.[0-9]{3})*,[0-9]{2})/i;
    const match = extractedText.match(regexValor);

    let valorFinal = null;
    if (match && match[1]) {
      // Limpeza e formatação do número para o MySQL (trocar vírgula por ponto)
      valorFinal = parseFloat(match[1].replace(/\./g, '').replace(',', '.'));
    }

    // Inserção na Base de Dados usando o Pool
    const [result] = await pool.execute(
      'INSERT INTO documentos (nome_arquivo, valor_extraido) VALUES(?, ?)',
      [fileName, valorFinal]
    );

    res.json({
      message: 'arquivo processado com sucesso!',
      nomeArquivo: fileName,
      valorExtraido: valorFinal
    });

  } catch (error) {
    console.error("Erro durante o fluxo:", error);
    res.status(500).json({ error: 'Erro ao processar o arquivo PDF.' });
  } finally {
    // 5. LIMPEZA ASSÍNCRONA E SEGURA DO DISCO
    if (filePath) {
      try {
        await fs.promises.unlink(filePath);
      } catch (unlinkError) {
        console.error("Alerta Crítico: Falha ao limpar o disco:", unlinkError);
      }
    }
  }
});

// 6. ROTA PARA LISTAR OS DOCUMENTOS PROCESSADOS
app.get('/api/documentos', async (req, res) => {
  try {
    const [rows] = await pool.execute('SELECT * FROM documentos ORDER BY id DESC');
    res.json(rows);
  } catch (error) {
    console.error("Erro ao buscar no banco:", error);
    res.status(500).json({ error: 'Erro ao procurar documentos na base de dados.' });
  }
});

// 7. INICIAR O SERVIDOR
const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Servidor a correr em http://localhost:${PORT}`);
});