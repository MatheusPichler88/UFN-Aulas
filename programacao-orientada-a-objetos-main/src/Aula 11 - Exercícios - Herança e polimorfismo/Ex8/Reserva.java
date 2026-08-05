package Aula_9.Ex8;

public class Reserva {
    protected String nomeCliente;
    public Reserva(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void adicionar() {
        System.out.println("Reserva adicionada para " + nomeCliente);
    }
    public void cancelar() {
        System.out.println("Reserva cancelada para " + nomeCliente);
    }
}