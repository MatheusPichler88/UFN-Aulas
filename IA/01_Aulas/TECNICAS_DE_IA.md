TECNICAS DE IA
    - Projetar e construir SISTEMAS DE COMPORTAMENTO INTELIGENTE
        - Base de conhecimento
            - representar conhecimento e raciocionar na base
        - Motores de raciocinio
            - metodos de busca
        - Aprendizado de maquina

    - BASE DE CONHECIMENTO
        - desafio é representar o conhecimento




        - PROLOG
            linguagem no contexto do PARADIGMA LÓGICO -> lógica de 1a ordem
                - dentro de uma sentença há parâmetros ou argumentos
                    - objeto:zeno, golfinho, mamífero
                    - literal: "Zeno", "Golfinho", "Mámifero"
                    - variável: palavra ou letra em maiusculo -> NAO TEM TIPO e NÃO TEM INSTANCIACAO
                - setenças ou assertivas ou predicados
                    - FATOS - verdades incontestaveis na base

                    progenitor(zeno,jurandir)
                    disciplina(alex,ia,cc,2026)
                    eh(golfinho,mamifero,aquatico)
                    eh(vaca,mamifero,terrestre)

                    jogos(counterStrike,fps,18)


                    - REGRAS - hipoteses ou consultas com uso de : - e variaveis


progenitor(evaldo,matheus)
progenitor(evaldo,joice)

progenitor(zeno,jurandir)
progenitor(zeno,abilio)


irmaos(A,B) :-
    progenitor(Pai,A),
    progenitor(Pai,B).
    A \= B.




?- irmaos(matheus,Q)


%A IA começa alucinar quando:
	%Induçao - nao importa tem que dar resposta 
	% Com base inveridicos