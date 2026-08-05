package pesquisaordenacao;
public class TesteString {
    public static void main(String[] args) {

        //Algoritmos geneticos
        //cromossomo - estado - objeto -> conjunto de genes
        //pai - 00000000001111111111
        //mãe - 99999999997777777777
        
        
        String parte1Pai = "0000000000";
        String parte2Pai = "1111111111";
        String parte1Mae = "9999999999";
        String parte2Mae = "77777777777";
        
        StringBuilder pai = new StringBuilder("");
        StringBuilder mae = new StringBuilder("");
        StringBuilder filho1 = new StringBuilder("");
        StringBuilder filho2 = new StringBuilder("");
        
        //Filho 1
        filho1.insert(0, parte1Pai);
        filho1.insert(10, parte1Mae);
        System.out.println(filho1);
        
        //Filho 2
        filho2.insert(0, parte1Mae);
        filho2.insert(10, parte2Pai);
        
        System.out.println(filho2);

        
        
    }
}
