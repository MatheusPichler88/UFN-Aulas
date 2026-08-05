package aula17.SistemaVeicular;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
    private String nomeArquivo;


    public Arquivos(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void gravarVeiculos(List<Veiculo> veiculos){
        try {
            FileWriter arq = new FileWriter(nomeArquivo + ".txt");
            BufferedWriter escritor = new BufferedWriter(arq);

            for (Veiculo v : veiculos) {
                escritor.write(
                        v.getPlaca() + ";\n" +
                                v.getModelo() + ";\n" +
                                v.getMarca() + ";\n" +
                                v.getAnoFabricacao() + ";\n" +
                                v.getQuilometragem()
                );
                escritor.newLine();
            }
            escritor.close();
            arq.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}