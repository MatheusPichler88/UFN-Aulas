% fato no predicado jogador(nome,idade)
jogador('Alexandre',45).
jogador('Luiz Friess',19).
jogador('Victor',19).
jogador('Maria',55).

% fato no predicado homem(nome)
homem('Alexandre').
homem('Luiz Friess').
homem('Victor').

% regra no predicado mulher(nome). :- significa se somente se
mulher(M) :- jogador(M,_),
             \+ homem(M).

% predicado joga(nome,tipo)
joga('Alexandre','RPG').
joga('Luiz Friess','FPS').
joga('Victor','FPS').
joga('Victor','MMO').
joga('Maria','MMO').
joga('Maria','RPG').

% fato no predicado jogo(nomeJogo, tipo, classificacaoEtaria)
jogo('The Witcher 3','RPG',18).
jogo('Bioshock','FPS',16).
jogo('WOW','MMO',0).

% regra no predicado recomendaRPG(nome,jogo)
recomendaRPG(Pessoa,Jogo) :-
    jogador(Pessoa, IdadeJogador),
    joga(Pessoa,'RPG'),
    jogo(Jogo,'RPG',IdadeCensura),
    IdadeJogador >= IdadeCensura.

% regra no predicado censura(nome,jogo)
censura(Pessoa,Jogo) :-
    jogador(Pessoa, IdadeJogador),
    joga(Pessoa,Tipo),
    jogo(Jogo,Tipo,IdadeIndicativa),
    IdadeJogador > IdadeIndicativa.
