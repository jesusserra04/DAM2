package Hilos.Ejercicio1;

public class Main {
    
    public static void main(String[] args) {
        // Crear las instancias de las tareas
        TareaNumeros tareaNumeros = new TareaNumeros();
        TareaLetras tareaLetras = new TareaLetras();

        // Crear hilos con las tareas
        Thread hiloNumeros = new Thread(tareaNumeros);
        Thread hiloLetras = new Thread(tareaLetras);

        // Iniciar los hilos
        hiloNumeros.start();
        hiloLetras.start();
    }
}

