import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Populacao {

    private List<Individuo> individuos = new ArrayList<>();


    // Criamos a primeira população
    public Populacao(int tamanhoPopulacao){
        for(int i = 0; i < tamanhoPopulacao; i++){
            individuos.add(new Individuo());
        }
    }

    public Individuo selecaoTorneio(){
      Random gerador = new Random();
      // Sorteia dois indices aleatorios
      int indice1 = gerador.nextInt(individuos.size());
      int indice2 = gerador.nextInt(individuos.size());
      // Pega os competidores da lista
      Individuo competidor1 = individuos.get(indice1);
      Individuo competidor2 = individuos.get(indice2);
      // Retorna o individuo de menor aptidao
      if(competidor1.Aptidao() < competidor2.Aptidao()){
          return competidor1;
      } else {
          return competidor2;
      }
    }

    public void novaGeracao(double taxaMutacao) {
        List<Individuo> novaPopulacao = new ArrayList<>();
        // Salva o melhor até agora
        Individuo melhorAteAgora = getMelhorIndividuo();
        // Criamos uma cópia da rota para não sofrer mutação por referência
        novaPopulacao.add(new Individuo(melhorAteAgora.getRota().clone()));

        IntStream.range(1, individuos.size()) // Nessa aqui usamos IntStream para repetir uma ação em um range
                .mapToObj(i -> {   // Usamos o mapToObj para transformar o resultado do método em um novo Individuo
                    Individuo paiA = selecaoTorneio();
                    Individuo paiB = selecaoTorneio();
                    Individuo filho = Individuo.crossover(paiA, paiB);
                    filho.mutacao(taxaMutacao);
                    return filho;
                })
                .forEach(novaPopulacao::add); //ForEach percorre a lista e utilizamos o método de referência para adicionar cada elemento na nova lista
        this.individuos = novaPopulacao;
    }
//        // Começamos o loop do 1
//        for (int i = 1; i < individuos.size(); i++) {
//            Individuo paiA = selecaoTorneio();
//            Individuo paiB = selecaoTorneio();
//            Individuo filho = Individuo.crossover(paiA, paiB);
//            filho.mutacao(taxaMutacao);
//            novaPopulacao.add(filho);
//        }
//        this.individuos = novaPopulacao;

    public Individuo getMelhorIndividuo(){
        return individuos.stream()
                .min(Comparator.comparingInt(Individuo::Aptidao))
                .orElse(null);
    }

//    public Individuo getMelhorIndividuo() {
//        // Começamos assumindo que o primeiro é o melhor
//        Individuo melhor = individuos.get(0);
//
//        for (Individuo i : individuos) {
//            // Se a aptidão do indivíduo atual for menor que a do melhor encontrado
//            if (i.Aptidao() < melhor.Aptidao()) {
//                melhor = i; // Temos um novo campeão!
//            }
//        }
//        return melhor;
//    }

}
