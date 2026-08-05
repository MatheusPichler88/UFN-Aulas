package aula02_lacos;
public class TabuadaMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int numero;

     
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (i+1) * (j+1);
            }
        }

        System.out.println("Matriz:");

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}