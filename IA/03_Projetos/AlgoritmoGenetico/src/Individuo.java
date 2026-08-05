import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Individuo {

    private int [] rota;
    private int valorRegraA = 10; // Regra A: se um número maior vem antes de um menor: Soma +10
    private int valorRegraB = 20; // Regra B: se um número aparece mais de uma vez: Soma +20

    public Individuo(int[] rota) {
        this.rota = rota;
    }

    public int regraA(){
       return (int) IntStream.range(0, rota.length - 1)
                .filter(i -> rota[i] > rota[i+1]) //filtra os números, se for true passa pela peneira, false descarta
                .count() * valorRegraA;
    }

//    public int regraA(){
//        int contador = 0;
//        for(int i = 0; i < rota.length - 1; i++){
//            if(rota[i] > rota[i+1]){
//                contador+=1;
//            }
//        }
//        return contador * valorRegraA;
//    }

    public int regraB(){
        int duplicatas = rota.length - (int) Arrays.stream(rota)
                .distinct()
                .count();
        return duplicatas * valorRegraB;
    }
//    public int regraB(){
//        HashSet<Integer> hashSet = new HashSet<>(); // Utilizamos Hash pra evitar duplicatas
//        for(int i = 0; i < rota.length; i++) {
//            hashSet.add(rota[i]);
//        }
//        int duplicatas = rota.length - hashSet.size();
//        return duplicatas * valorRegraB; // Soma o valor da regra B para cada duplicata
//    }

    // Realiza o calculo de aptidao do individuo
    public int Aptidao(){
        return regraA() + regraB();
    }

    // Construtor que gera uma rota aleatoria
    public Individuo() {
        this.rota = new int[9];
        HashSet<Integer> hashTemp = new HashSet<>();
        Random gerador = new Random();

        for (int i = 0; i < rota.length; i++) {
            int numeroSorteado;
            do {
                // Sorteia de 0 a 8
                numeroSorteado = gerador.nextInt(9);
            } while (!hashTemp.add(numeroSorteado));

            rota[i] = numeroSorteado;
        }
    }

    public static Individuo crossover(Individuo paiA, Individuo paiB){
        Random gerador = new Random();
        int [] rotaFilho = new int[9];

        // Define o ponto de corte, usamos o valor de 1 a 7 para garantir que haja troca
        int pontoCorte = gerador.nextInt(7) + 1;

        // Copia a primeira metade da rota do pai A
        for(int i = 0; i < pontoCorte; i++){
            rotaFilho[i] = paiA.rota[i];
        }

        // Preenche o resto da rota com as cidades do pai B
        int posicaoFilho = pontoCorte;
        for (int cidadeB : paiB.getRota()) {
            if (!contemCidade(rotaFilho, posicaoFilho, cidadeB)) {
                if (posicaoFilho < 9) {
                    rotaFilho[posicaoFilho] = cidadeB;
                    posicaoFilho++;
                }
            }
        }
        return new Individuo(rotaFilho);
    }

    // Método para evitar duplicatas
    private static boolean contemCidade(int[] rota, int tamanhoAtual, int cidade) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (rota[i] == cidade) return true;
        }
        return false;
    }

    public void mutacao(double taxaMutacao) {
        Random rand = new Random();

        // Sorteia um numero
        if (rand.nextDouble() < taxaMutacao) {
            // Se ocorrer a mutação, escolhemos dois índices da rota
            int indice1 = rand.nextInt(9);
            int indice2 = rand.nextInt(9);

            // Troca as cidades de lugar
            int aux = rota[indice1];
            rota[indice1] = rota[indice2];
            rota[indice2] = aux;
        }
    }

    public int[] getRota() {
        return rota;
    }

    @Override
    public String toString() {
        return Arrays.toString(rota) + " | Aptidão: " + Aptidao();
    }


}




