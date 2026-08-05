package threads.exercicios;

class MinhaThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Exemplo1 {
    public static void main(String[] args) {
        MinhaThread t = new MinhaThread();
        t.start();
    }
}