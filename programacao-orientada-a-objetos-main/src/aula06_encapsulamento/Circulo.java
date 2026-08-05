package aula06_encapsulamento;

public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
