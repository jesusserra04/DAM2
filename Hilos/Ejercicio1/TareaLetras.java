package Hilos.Ejercicio1;

public class TareaLetras implements Runnable {
    @Override
    public void run() {
        try {
            for (char letra = 'A'; letra <= 'J'; letra++) {
                System.out.println("Letra: " + letra);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }
    }
}
