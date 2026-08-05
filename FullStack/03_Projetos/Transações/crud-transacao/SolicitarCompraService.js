class SolicitarCompraService {
 constructor(conexao) {
 this.conexao = conexao;
 }
 async inserirSolicitacaoCompra(idUsuario) {
 const query = 'INSERT INTO SOLICITACAO_COMPRAS (ID_USUARIO) VALUES (?)';
 const [result] = await this.conexao.query(query, [idUsuario]);
 return result.insertId;
 }
async atualizarSolicitacaoCompra(idSolicitacao, idUsuario) {
 const query = 'UPDATE SOLICITACAO_COMPRAS SET ID_USUARIO = ? WHERE ID= ?';
 await this.conexao.query(query, [idUsuario, idSolicitacao]);
 }
 async excluirSolicitacaoCompra(idSolicitacao) {
 const query = 'DELETE FROM SOLICITACAO_COMPRAS WHERE ID = ?';
 await this.conexao.query(query, [idSolicitacao]);
 }
}