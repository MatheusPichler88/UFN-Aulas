package aula13_abstratas_interfaces.Veiculos;

public class VeiculosMain {
    public static void main(String[] args) {
        //aula03_orientacao_objetos.Carro
        System.out.println("----------aula03_orientacao_objetos.Carro---------");
        Veiculo carro = new Carro("Fiat","Palio",2014);
        carro.acelerar();
        carro.frear();
        System.out.println(carro);

        //Moto
        System.out.println("----------Moto---------");
        Veiculo moto = new Moto("Honda","CG 160",2022);
        moto.acelerar();
        moto.frear();
        System.out.println(moto);
    }
}
