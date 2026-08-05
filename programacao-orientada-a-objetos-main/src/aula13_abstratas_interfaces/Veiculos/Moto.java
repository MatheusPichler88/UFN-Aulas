package aula13_abstratas_interfaces.Veiculos;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("A Moto está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("A Moto está freando...");
    }
    @Override
    public String toString() {
        return "=== Detalhes da Moto ===\n" +
                "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Ano: " + getAno() + "\n";
    }
}
