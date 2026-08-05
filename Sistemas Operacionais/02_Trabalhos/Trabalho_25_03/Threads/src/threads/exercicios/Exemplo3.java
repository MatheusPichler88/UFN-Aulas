package threads.exercicios;

class Contador {
    int valor = 0;
}

class Incrementador extends Thread {
    private Contador contador;

    public Incrementador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.valor++;
        }
    }
}

public class Exemplo3 {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Incrementador t1 = new Incrementador(contador);
        Incrementador t2 = new Incrementador(contador);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final do contador: " + contador.valor);
    }
}

//Race Condition acontece quando duas ou mais threads acessam e modificam o mesmo recurso ao mesmo tempo, causando resultados imprevisíveis.