package aula13_abstratas_interfaces.Veiculos;

public class Carro extends Veiculo{

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar(){
        System.out.println("O aula03_orientacao_objetos.Carro está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("O aula03_orientacao_objetos.Carro está freando...");
    }
    @Override
    public String toString() {
        return "=== Detalhes do aula03_orientacao_objetos.Carro ===\n" +
                "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Ano: " + getAno() + "\n";
    }
}
