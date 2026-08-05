package aula05_tratamento_excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraExcecoes {

   public double soma(double n1, double n2){
       return n1+n2;
   }
   public double subtracao(double n1, double n2){
       return n1 - n2;
   }
   public double multiplicacao(double n1, double n2){
       return n1*n2;
   }
   public double divisao(double n1, double n2) {
       double r = 0;
       try {
           r = n1 / n2;
       } catch (ArithmeticException e) {
           System.out.println("Não é possivel realizar uma divisão por zero!");
       }
       return r;
   }
    public double[] obterNumeros() {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[2];
        try {
            System.out.println("Digite o primeiro numero: ");
            numeros[0] = sc.nextDouble();
            System.out.println("Digite o segundo numero: ");
            numeros[1] = sc.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Digite apenas numeros!");
        }

        return numeros;
   }
}