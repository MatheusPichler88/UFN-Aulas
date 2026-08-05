1- Instalar o Docker
    - Abrir o docker
2 - Criar a pagina do projeto

3 - Dentro da pasta do projeto
        - abrir o terminal nela
        - dar um git clone https://github.com/MatheusPichler88/Projeto-Museu-Treze-De-Maio.git
        - vai criar a pasta do projeto do git
        - abre ela e cria um arquivo chamado .env com o seguinte conteudo:
            DB_HOST=localhost
            DB_PORT=3306
            DB_NAME=db_museu
            DB_USER=root
            DB_PASSWORD=senha_do_banco
        - salva o conteudo
4- Subir o projeto
    - ainda no terminal execute docker compose up
    vai subir o projeto e poderá acessar com http://localhost:8080

5- Acesso ao sistema

| Perfil        | Usuário | Senha  |
|---------------|---------|--------|
| Administrador | admin   | 123456 |
| Funcionário   | user    | 123456 |

6- Derrubar o conteiner e subir
    Parar - docker compose down
    Subir - docker compose up




