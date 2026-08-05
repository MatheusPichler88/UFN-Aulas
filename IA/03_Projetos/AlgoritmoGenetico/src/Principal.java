public class Principal {
    public static void main(String[] args) {
        int tamanhoPopulacao = 50;
        int geracoes = 1000;
        double taxaMutacao = 0.05;

        //Cria a populacao inicial
        Populacao populacao = new Populacao(tamanhoPopulacao);

        //Evolução
        for (int g = 0; g < geracoes; g++) {
            populacao.novaGeracao(taxaMutacao);
            Individuo melhorDaGeracao = populacao.getMelhorIndividuo();
            System.out.println("Geração " + g + " | Melhor Aptidão: " + melhorDaGeracao.Aptidao());
        }
    }
}
