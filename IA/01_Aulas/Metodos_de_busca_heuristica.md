Método de busca heuristica
    - custos
        - real      : Subida de Encosta e o A*
        - estimado  : Guloso e o A*

Metodos e busca em geral
    - Gerar e Testar
        - Gerar um novo estado clonado
        - Testar
            - ehValido
            - visitado
            - ehMeta


    - Modelagem
        - Estados -> Estrutura de dados -> atributos/variaveis
        - Regras de transições -> ifs e validações
        - Estrutura de Visitados -> Listas ou HashMaps
        - Função meta ou objetivo

- Objetos tem endereço... ou referência
    Por exemplo,
        Aluno aTmp = a.clone();
        Aluno bTmp = b.clone();
        metodo(aTmp,bTmp);