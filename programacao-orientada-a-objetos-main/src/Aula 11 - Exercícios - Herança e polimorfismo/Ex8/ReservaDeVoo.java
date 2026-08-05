package Aula_9.Ex8;

public class ReservaDeVoo extends Reserva {
    private String tipoClasse;
    public ReservaDeVoo(String nomeCliente) {
        super(nomeCliente);
    }
    public void adicionar(String tipoClasse) {
        this.tipoClasse = tipoClasse;
        System.out.println("Reserva de voo adicionada para " + nomeCliente + " na classe " + tipoClasse);
    }
    @Override
    public void cancelar() {
        if ("executiva".equalsIgnoreCase(tipoClasse)) {
            System.out.println("Cancelamento de reserva de voo executiva para " + nomeCliente + ". Sem taxa de cancelamento.");
        } else if ("economica".equalsIgnoreCase(tipoClasse)) {
            System.out.println("Cancelamento de reserva de voo econômica para " + nomeCliente + ". Taxa de cancelamento aplicada.");
        } else {
            System.out.println("Cancelamento de reserva de voo para " + nomeCliente);
        }
    }
}