%repetição
	
	% 1) 3 etapas/situações: inicializacao da variavel de controle
	% 2) teste de parada/continuar
	% 3) transformacao da variavel de controle

	% for (int i=0; i<= 7; i++)

escrever(N) :-
    N == 0,
    !.

escrever(N) :-
    writeln(N),
    Proximo is N - 1,
    escrever(Proximo).

progenitor(joao,zeno).
progenitor(zeno,jura).
progenitor(jura,alex).
progenitor(alex,dante).

ascendente(A,D):-
    progenitor(A,D).

ascendente(A,D):-
    progenitor(A,I),
    ascendente(I,D).

estrada(a,b).
estrada(b,c).
estrada(b,f).
estrada(c,d).
estrada(d,e).
estrada(f,e).

caminho(De, Para):-
    estrada(De, Para).

caminho(De, Para) :-
    estrada(De, I),
    caminho(I, Para).
