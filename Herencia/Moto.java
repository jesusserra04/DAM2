public class Moto extends Vehiculo{
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anyo, boolean tieneSidecar) {
        super(marca, modelo, anyo);
        this.tieneSidecar = tieneSidecar;
    }
    public void mostrarDatos(){
        System.out.println("El vehiculio tiene estas caracteristicas: " + getMarca() +" "+ getModelo() +" "+ getAnyo() + " la moto tiene sidecar "+tieneSidecar);

}
    
        
        
       
    
    
}
