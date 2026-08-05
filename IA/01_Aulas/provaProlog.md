1) Ore requisitos crie fatos disciplina(nome) e pre_requisito(Anterior,Posterior). Escreva uma regra pode_cursar(Aluno,Disciplina) que verifica se o aluno ja completou os requisitos necessarios.


% Definição das disciplinas
disciplina("Algoritmos B").
disciplina("Estrutura de Dados").
disciplina("Inteligencia Artificial").

% Definição dos pré-requisitos
% Note que o nome deve ser exatamente igual ao definido acima
pre_requisito("Algoritmos B", "Estrutura de Dados").
pre_requisito("Estrutura de Dados", "Inteligencia Artificial").

% Fatos de alunos
ja_cursou("Freitas", "Algoritmos B").

% Regra para verificar o que o aluno pode cursar
% A lógica diz: Se o aluno já cursou o Pré-requisito, ele pode cursar a Disciplina.
pode_cursar(Aluno, Disciplina) :-
    ja_cursou(Aluno, Pre),
    pre_requisito(Pre, Disciplina).



2)Aprovaçao: com fatos nota(Aluno,Disciplina, Valor), crie a regra aprovado(Aluno,Disciplina) (nota>= 7.0) e reprovado(Aluno,Disciplina) (nota<7.0).

% Fatos de exemplo: nota(Aluno, Disciplina, Valor)
nota("Matheus", "Algoritmos B", 8.5).
nota("Gabriel", "Estrutura de Dados", 6.0).
nota("Artur", "Inteligencia Artificial", 7.0).

% Regra para Aprovado: nota maior ou igual a 7.0
aprovado(Aluno, Disciplina) :-
    nota(Aluno, Disciplina, Valor),
    Valor >= 7.0.

% Regra para Reprovado: nota menor que 7.0
reprovado(Aluno, Disciplina) :-
    nota(Aluno, Disciplina, Valor),
    Valor < 7.0.