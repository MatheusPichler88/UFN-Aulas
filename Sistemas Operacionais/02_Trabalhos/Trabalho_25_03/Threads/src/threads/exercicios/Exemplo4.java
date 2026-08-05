package threads.exercicios;

class Download extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            System.out.println("Download: " + i + "%");

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Download concluido!");
    }
}

public class Exemplo4 {
    public static void main(String[] args) {
        Download d = new Download();
        d.start();
    }
}