package aula16.serializacao.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        // Criando um objeto para serializar
        Pessoa p = new Pessoa("Matheus", 22);

        // Convertendo o objeto em um JSONObject
        JSONObject json = new JSONObject();
        json.put("Nome", p.getNome());
        json.put("Idade", p.getIdade());
        String jsonString = json.toJSONString();

        gravaArquivo(jsonString);
        try {
            lerArquivo();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void gravaArquivo(String jsonString) {
        try (FileWriter fileWriter = new FileWriter("pessoa.json")) {
            fileWriter.write(jsonString);
            System.out.println("Arquivo pessoa.json salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo() throws ParseException {
        // Lendo o arquivo e desserializando o JSON para objeto
        try (FileReader fileReader = new FileReader("pessoa.json")) {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

            // Criando um objeto Pessoa a partir do JSON
            String nome = (String) jsonObject.get("Nome");
            long idade = (long) jsonObject.get("Idade");
            Pessoa deserializedPerson = new Pessoa(nome, (int) idade);

            System.out.println("Objeto desserializado: " + deserializedPerson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
