package com.example.telefonia;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class TelefoniaController {

    @FXML
    private TextField campoNumero;

    @FXML
    private TextArea areaResultado;

    @FXML
    private Label labelStatus;

    private HashMap<String, String> dadosTelefonia = new HashMap<>();

    @FXML
    public void buscarSessao() {
        String numero = campoNumero.getText();

        if (numero.isEmpty()) {
            areaResultado.setText("Campo vazio. Digite um número de celular!");
            return;
        }

        String dados = dadosTelefonia.get(numero);

        if (dados != null) {
            areaResultado.setText("Dados do numero: " + numero + ":\n\n" + dados);
            labelStatus.setText("Status: Dados encontrados!");
        } else {
            areaResultado.setText("Nenhum dado encontrado para o número: " + numero);
            labelStatus.setText("Status: Os dados não foram encontrados!");
        }
    }

    @FXML
    public void carregarDados() {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("telephony_sessions.txt"));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";", 2);
                if (partes.length == 2) {
                    String numero = partes[0];
                    String dados = partes[1];
                    dadosTelefonia.put(numero, dados);
                }
            }
            leitor.close();

            areaResultado.setText("Dados carregados com sucesso!\n");
            labelStatus.setText("Status: Dados carregados ");

        } catch (Exception e) {
            areaResultado.setText("Erro ao carregar dados: " + e.getMessage());
            labelStatus.setText("Status: Erro ao carregar dados");
        }
    }
}