package Hilos.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        
        for(int i = 0; i<=10; i++){
            Numero n = new Numero(i);
            Thread t = new Thread(n);
            t.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
}
