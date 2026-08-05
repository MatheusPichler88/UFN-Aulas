package Aula_9.Ex8;

public class ReservaDeHotel extends Reserva {
    public ReservaDeHotel(String nomeCliente) {
        super(nomeCliente);
    }
    @Override
    public void cancelar() {
        System.out.println("Cancelamento de reserva de hotel para " + nomeCliente + ". Taxa de cancelamento aplicada.");
    }
}