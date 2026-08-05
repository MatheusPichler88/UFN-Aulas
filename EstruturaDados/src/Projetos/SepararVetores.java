/* Crie um programa em Java que:
   - Gere um vetor de 50 números inteiros aleatórios de 0 a 500.
   - Exiba o vetor gerado.
   - Separe os números pares e ímpares em dois vetores distintos.
   - Mostre os vetores de pares e ímpares separadamente.

 */
package Projetos;

import java.util.Random;

public class SepararVetores {
    public static void main(String[] args) {
        Random gerador = new Random();
        int [] vetor = new int[50];
        int [] VetorPar = new int[vetor.length];
        int [] VetorImpar = new int[vetor.length];
        int ContadorPares = 0;
        int ContadorImpares = 0;

        //Gerador de numeros aleatorios em um vetor
        for(int i =0; i<vetor.length; i++){
            vetor[i] = gerador.nextInt(500);
        }
        //Separa os valores no vetor par
        for(int j =0; j<vetor.length; j++){
            if(vetor[j]%2 == 0){
                VetorPar[ContadorPares++] = vetor[j];
            }
        //Separa os valores no vetor impar
            else{
                VetorImpar[ContadorImpares++] = vetor[j];
            }
            }
        System.out.println("Vetor Orignal:");
        for(int v : vetor){
            System.out.print(v+"\t ");
        }

        System.out.println("");
        System.out.println("Vetor Par:");
        for(int k=0; k<ContadorPares; k++){
            System.out.print(VetorPar[k]+"\t ");
        }
        System.out.println("");
        System.out.println("Vetor Impar:");
        for(int k=0; k<ContadorImpares; k++){
            System.out.print(VetorImpar[k]+"\t ");
        }
        System.out.println("");
        }

        }



