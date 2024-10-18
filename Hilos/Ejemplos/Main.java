package Hilos.Ejemplos;

    class HiloConNombre extends Thread {
    public HiloConNombre(String name) {
        this.setName(name);  // Asigna el nombre al hilo
    }

    @Override
    public void run() {
        System.out.println("El hilo en ejecución es: " + this.getName()); // Recupera el nombre del hilo
        
        System.out.println("El hilo en ejecución es: " + this.getId()); // Recupera el nombre del hilo

    }
}

public class Main {
    public static void main(String[] args) {
        HiloConNombre hilo1 = new HiloConNombre("Hilo A");
        HiloConNombre hilo2 = new HiloConNombre("Hilo B");

        hilo1.start(); // Lanza el hilo con el nombre "Hilo A"
        hilo2.start(); // Lanza el hilo con el nombre "Hilo B"
    }
}
