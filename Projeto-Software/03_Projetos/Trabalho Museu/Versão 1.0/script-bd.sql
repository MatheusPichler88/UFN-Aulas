CREATE DATABASE db_museu;
USE db_museu;

-- 1. CAMADA DE SEGURANÇA E AUDITORIA
-- Tabela: usuario
CREATE TABLE usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    nome VARCHAR(100),
    perfil ENUM('ADMINISTRADOR', 'FUNCIONARIO', 'VISITANTE') DEFAULT 'VISITANTE',
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    ativo BOOLEAN DEFAULT TRUE
);

-- Tabela: log_sistema
CREATE TABLE log_sistema (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT,
    acao VARCHAR(100) NOT NULL,          
    detalhes TEXT,                       
    data_acao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE SET NULL
);

-- 2. CAMADA DE CLASSIFICAÇÃO (ESTRUTURA DO ACERVO)
-- Tabela: categoria
CREATE TABLE categoria (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE,
    codigo_classificacao VARCHAR(20),     -- Código de indexação física na biblioteca
    descricao TEXT,
    categoria_pai_id BIGINT,              -- Permite aninhar subcategorias
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ativo BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (categoria_pai_id) REFERENCES categoria(id) ON DELETE SET NULL
);

-- 3. CAMADA DOS ITENS DO ACERVO
-- Tabela: livro
CREATE TABLE livro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo_patrimonio VARCHAR(50) UNIQUE, 
    titulo VARCHAR(200) NOT NULL,
    subtitulo VARCHAR(255),
    autor VARCHAR(255),          
    organizador VARCHAR(255),    
    isbn VARCHAR(20),
    editora VARCHAR(100),
    cidade VARCHAR(100),         
    edicao VARCHAR(50),
    ano_publicacao INT,
    quantidade INT DEFAULT 1,
    referencia TEXT     
    ativo BOOLEAN DEFAULT TRUE
);

-- Tabela: revista
CREATE TABLE revista (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo_patrimonio VARCHAR(50) UNIQUE,
    titulo VARCHAR(200) NOT NULL,
    subtitulo VARCHAR(255),          
    issn VARCHAR(20),
    editora VARCHAR(100),
    cidade VARCHAR(100),              
    ano_publicacao INT,
    mes_publicacao VARCHAR(20),      
    volume VARCHAR(50),             
    numero_edicao INT,             
    quantidade INT DEFAULT 1, 
    referencia TEXT  
    ativo BOOLEAN DEFAULT TRUE
);

-- Tabela: acervo_historico
CREATE TABLE acervo_historico (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo_patrimonio VARCHAR(50) UNIQUE, 
    nome_item VARCHAR(150) NOT NULL,       
    tipo_item VARCHAR(50) NOT NULL,      
    descricao TEXT NOT NULL,              
    ano_item INT,                         
    estado_conservacao ENUM('EXCELENTE', 'BOM', 'REGULAR', 'RUIM', 'EM_RESTAURO') DEFAULT 'BOM',
    localizacao_fisica VARCHAR(150),     
    caminho_item VARCHAR(500)   
    ativo BOOLEAN DEFAULT TRUE
);

-- 4. RELACIONAMENTOS (TABELAS DE LIGAÇÃO MUITOS-PARA-MUITOS)
CREATE TABLE livro_categoria (
    livro_id BIGINT NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY (livro_id, categoria_id),
    FOREIGN KEY (livro_id) REFERENCES livro(id) ON DELETE CASCADE,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id) ON DELETE CASCADE
);

CREATE TABLE revista_categoria (
    text_id BIGINT, 
    revista_id BIGINT NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY (revista_id, categoria_id),
    FOREIGN KEY (revista_id) REFERENCES revista(id) ON DELETE CASCADE,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id) ON DELETE CASCADE
);

CREATE TABLE acervo_categoria (
    acervo_id BIGINT NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY (acervo_id, categoria_id),
    FOREIGN KEY (acervo_id) REFERENCES acervo_historico(id) ON DELETE CASCADE,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id) ON DELETE CASCADE
);
