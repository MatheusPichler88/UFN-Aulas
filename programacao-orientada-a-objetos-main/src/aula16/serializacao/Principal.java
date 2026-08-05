package aula16.serializacao;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        Produtos produto = new Produtos("ABC123", "Exemplo de Produto", 9.99, "Campo temporário");

        //Serialização
        try {
            FileOutputStream arquivoSaida = new FileOutputStream("produto.ser");
            ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);

            objetoSaida.writeObject(produto);
            objetoSaida.close();
            arquivoSaida.close();

            System.out.println("Objeto serializado e salvo em produto.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Desserialização
        try {
            FileInputStream arquivoEntrada = new FileInputStream("produto.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(arquivoEntrada);

            Produtos produtoDesserializado = (Produtos) objetoEntrada.readObject();
            objetoEntrada.close();
            arquivoEntrada.close();

            System.out.println("Objeto desserializado: " + produtoDesserializado); //chama o método sobreescrito toString();
            System.out.println("Vai apresentar " + produtoDesserializado.getTemporario());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
