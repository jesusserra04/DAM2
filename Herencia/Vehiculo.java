public class Vehiculo {
    private String marca;
    private String modelo;
    private int anyo;

    public Vehiculo(String marca, String modelo, int anyo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
    }

    public void mostracionDatos(){
        System.out.println("El vehiculio tiene estas caracteristicas: " + marca +" "+ modelo +" "+ anyo );

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyo() {
        return anyo;
    }
    

    
}
