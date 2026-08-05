package example;

// Environment code for project sala

import jason.asSyntax.*;
import jason.environment.*;
import java.util.logging.*;

public class Env extends Environment {

    private Logger logger = Logger.getLogger("sala." + Env.class.getName());

    /** Chamado antes da execução do MAS com os argumentos informados no .mas2j */
    @Override
    public void init(String[] args) {
        super.init(args);
        
        // Verifica o argumento "sexta" vindo do arquivo .mas2j
        if (args.length > 0 && args[0].equals("sexta")) {
            logger.info("Hoje é sexta-feira!");
        }

        // Adiciona a percepção de que é "dia" para todos os agentes.
        // Usamos createLiteral para evitar erros de parser (ParseException).
        addPercept(ASSyntax.createLiteral("dia"));
    }

    @Override
    public boolean executeAction(String agName, Structure action) {
        // Exibe no console qual agente está tentando agir no mundo
        logger.info(agName + " está executando a ação: " + action);
        
        // Mantém os agentes atualizados sobre mudanças no ambiente
        informAgsEnvironmentChanged();
        
        return true; // Retorna sucesso para a ação
    }

    @Override
    public void stop() {
        super.stop();
    }
}