const express = require('express');
const cors = require('cors'); // Agrupar os imports no topo
const routes = require('./routes');

const app = express();

// 1. Configurações e Middlewares globais
app.use(cors());
app.use(express.json());

// 2. Definição das Rotas (Sempre após os middlewares de parser)
app.use(routes);

// 3. Inicialização do servidor
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Servidor rodando em http://localhost:${PORT}`);
});