package aula15.pkg;

public class AgendaPrincipal {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda("","");
        try {
            agenda.adicionarContato();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());}
        }
    }

