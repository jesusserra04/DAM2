//import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        ///Scanner sc = new Scanner(System.in);

        Coche c1 = new Coche("BMW", "M3", 2008, 5);

        Moto m1 = new Moto("Honda", "CBR", 2022, false);

        Vehiculo v1 = new Coche("Mercedes", "AMG", 2009, 5);

        System.out.println("Datos de coche");
        c1.mostrarDatos();

        System.out.println("Datos de moto");
        m1.mostrarDatos();

        v1.mostracionDatos();



    }
    
}