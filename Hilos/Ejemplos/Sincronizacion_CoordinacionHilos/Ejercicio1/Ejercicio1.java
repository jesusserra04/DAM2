package Hilos.Ejemplos.Sincronizacion_CoordinacionHilos.Ejercicio1;

class MiHilo extends Thread {
    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(nombre + " - Tabla del " + i);
            try {
                Thread.sleep(1000);
                for(int j = 0; j<10; j++){
                    System.out.println(j + " x " + i +" = "+ (j*i));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " ha terminado.");
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");
        MiHilo hilo3 = new MiHilo("Hilo 3");

        hilo1.start();
        try {
            hilo1.join();
            System.out.println("El hilo 1 ha terminado. Ahora el hilo principal sigue con hilo 2.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    
        hilo2.start();
        try {
            hilo2.join();
            System.out.println("El hilo 2 ha terminado. Ahora el hilo principal sigue con hilo 3.");
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
        hilo3.start();
        try {
            hilo3.join();
            System.out.println("El hilo 3 ha terminado.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos los hilos han terminado, el hilo principal continúa.");
    }
}
