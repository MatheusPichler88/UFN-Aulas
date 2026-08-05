package Aula_9.Ex5;

public class Principal {
        public static void main(String[] args) {
            Produto produto = new Produto();
            Cliente cliente = new Cliente(15);
            double precoBase = 200.0;
            double precoFinalSemDesconto = produto.calcularPrecoFinal(precoBase);
            System.out.println("Preço final sem desconto: " + precoFinalSemDesconto);
            double precoFinalComDesconto = produto.calcularPrecoFinal(precoBase, cliente);
            System.out.println("Preço final com desconto: " + precoFinalComDesconto);
        }
}
