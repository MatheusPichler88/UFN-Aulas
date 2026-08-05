// Função para enviar o arquivo ao back-end
async function fazerUpload() {
 const fileInput = document.getElementById('pdfInput');
 const statusText = document.getElementById('statusMensagem');
 if (fileInput.files.length === 0) {
 statusText.innerText = "Por favor, selecione um arquivo PDF primeiro.";
 return;
 }
 // Usando FormData para enviar via multipart/form-data
 const formData = new FormData();
 formData.append('pdfDocument', fileInput.files[0]);
 statusText.innerText = "Realizando upload e processamento... (Aguarde)";
 try {
 const response = await fetch('/api/upload', {
 method: 'POST',
 body: formData
 });
 const data = await response.json();
 if (response.ok) {
 statusText.innerText = `Sucesso! Extraído: R$ ${data.valorExtraido
|| 'Não encontrado'}`;
 carregarDocumentos(); // Atualiza a tabela imediatamente
 fileInput.value = ""; // Limpa o input
 } else {
 statusText.innerText = `Erro: ${data.error}`;
 }
 } catch (error) {
    onsole.error("Erro na requisição:", error);
 statusText.innerText = "Erro ao conectar com o servidor.";
 }
}
// Função para buscar os dados do MySQL (via Back-end) e preencher a tabela HTML
async function carregarDocumentos() {
 try {
 const response = await fetch('/api/documentos');
 const documentos = await response.json();

 const tbody = document.getElementById('tabelaDocumentos');
 tbody.innerHTML = ''; // Limpa a tabela
 documentos.forEach(doc => {
 const tr = document.createElement('tr');

 // Formatar a data
 const dataFormatada = new Date(doc.data_upload).toLocaleString('ptPT');

 // Lidar com valores nulos caso a Regex não encontre nada
 const valorFormatado = doc.valor_extraido !== null ?
doc.valor_extraido : 'Não identificado';
 tr.innerHTML = `
 <td>${doc.id}</td>
 <td>${doc.nome_arquivo}</td>
 <td>${valorFormatado}</td>
 <td>${dataFormatada}</td>
 `;
 tbody.appendChild(tr);
 });
 } catch (error) {
 console.error("Erro ao carregar documentos:", error);
 }
}
// Carregar a lista inicial assim que a página abrir
window.onload = carregarDocumentos;

