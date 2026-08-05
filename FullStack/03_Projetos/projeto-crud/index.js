const sequelize = require('./db');
const { DataTypes } = require('sequelize');

// Definir modelo
const Usuario = sequelize.define('Usuario', {
    nome: {
        type: DataTypes.STRING,
        allowNull: false
    },
    email: {
        type: DataTypes.STRING,
        allowNull: false
    }
});

// Sincronizar com o banco
sequelize.sync({ force: false }).then(() => {
    console.log('Banco sincronizado!');
});

// Funções CRUD

async function criarUsuario(nome, email) {
    const usuario = await Usuario.create({ nome, email });
    console.log('Usuario criado:', usuario.nome);
}

async function listarUsuarios() {
    const usuarios = await Usuario.findAll();
    console.log('Lista de usuarios:', usuarios);
}

async function atualizarUsuario(id, novosDados) {
    const usuario = await Usuario.findByPk(id);
    if (usuario) {
        await usuario.update(novosDados); 
        console.log('Usuario atualizado:', usuario.nome);
    }
}

async function excluirUsuario(id) {
    const usuario = await Usuario.findByPk(id);
    if (usuario) {
        await usuario.destroy();
        console.log('Usuario excluido');
    }
}

// Exemplos de uso
(async () => {
    await sequelize.sync(); 
    await criarUsuario('Matheus', 'matheus@ufn.edu.br');
    await listarUsuarios();
    await atualizarUsuario(1, { nome: 'Matheus Pichler' });
})();