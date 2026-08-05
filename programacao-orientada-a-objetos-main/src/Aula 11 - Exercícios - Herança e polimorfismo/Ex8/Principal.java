package Aula_9.Ex8;

public class Principal {
    public static void main(String[] args) {
        Reserva[] reservas = new Reserva[3];
        reservas[0] = new ReservaDeHotel("Matheus");
        ReservaDeVoo voo1 = new ReservaDeVoo("Maria");
        voo1.adicionar("econômica");
        reservas[1] = voo1;
        ReservaDeVoo voo2 = new ReservaDeVoo("Gabriel");
        voo2.adicionar("executiva");
        reservas[2] = voo2;
        System.out.println("Cancelando reservas:");
        for (Reserva r : reservas) {
            r.cancelar();
        }
    }
}
