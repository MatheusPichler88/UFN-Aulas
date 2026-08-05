package aula17.SistemaVeicular;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arquivos arquivo = new Arquivos("veiculos");
        List<Veiculo> veiculos = new ArrayList<>();


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar veiculos");
            System.out.println("2 - Alterar quilometragem");
            System.out.println("3 - Excluir veiculos");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Quilometragem: ");
                    double km = scanner.nextDouble();

                    Veiculo novoVeiculo = new Veiculo(placa, modelo, marca, ano, km);
                    veiculos.add(novoVeiculo);
                    arquivo.gravarVeiculos(veiculos);
                    System.out.println("Veículo cadastrado!");
                    break;

                case 2:
                    System.out.print("Placa do veículo para alterar a quilometragem: ");
                    String placaAlterar = scanner.nextLine();
                    for (Veiculo v : veiculos) {
                        if (v.getPlaca().equals(placaAlterar)) {
                            System.out.print("Nova quilometragem: ");
                            double novaKm = scanner.nextDouble();
                            v.setQuilometragem(novaKm);
                            arquivo.gravarVeiculos(veiculos);
                            System.out.println("Quilometragem atualizada!");
                            break;
                        }
                    }
                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("A opcao selecionada não é valida!");
            }
        }
    }
}