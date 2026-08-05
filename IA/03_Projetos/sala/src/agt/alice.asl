// Crenças da Alice
laboratorio(ia, 101).
laboratorio(ed, 108).
laboratorio(redes, 316).

!start.

/* Planos */

+!start : true
    <- 
        .print("hello world.");
        .send(bob, tell, lanche(sanduiche));
        .wait(5000);
        .send(bob, untell, lanche(sanduiche)).

// Plano para interceptar a pergunta e processar antes de responder
// Corrigido: Agentem -> Agente, e ajuste na estrutura do askOne
+!kqml_received(Agente, askOne, laboratorio(Disciplina, X), MsgId)

    <- 
        : laboratorio(Disciplina, NumLab) // Busca na base de crenças o número do lab
        .print(Agente, " está me perguntando qual o laboratorio de ", Disciplina);

        // Responde ao agente que perguntou
        .send(Agente, tell, laboratorio(Disciplina, Laboratorio), MsgId).