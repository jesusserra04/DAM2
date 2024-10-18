package Hilos.Ejercicio3;

public class CarreraHilos{
    public static void main(String[] args) {
        
        Carrera1 c1 = new Carrera1("A");
        Carrera1 c2 = new Carrera1("B");
        Carrera1 c3 = new Carrera1("C");

        c1.start();
        c2.start();
        c3.start();

    }
    
}
