public class Coche extends Vehiculo {
    private int numPuertas;

   

    public Coche(String marca, String modelo, int anyo, int numPuertas) {
        super(marca, modelo, anyo);
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos(){
        super.mostracionDatos();
        System.out.print(" "+getNumPuertas());

    }

    public int getNumPuertas() {
        return numPuertas;
    }

 
}
