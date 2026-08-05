time(inter).
idade(19).
disciplina(ia,sexta).
disciplina(ed,quarta).


!start.


+!start : true 
    <- 
        .print("hello world.").


+dia(Dia) : disciplina(Disciplina, D)
    <-
        .print("Oba... tenho aula de IA...Alice... qual é o laboratorio?");
        .send(alice, askOne, laboratorio(Disciplina, Laboratorio), MsgId).
