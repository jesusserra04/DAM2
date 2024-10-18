package Hilos.Ejercicio3;

public class Carrera1 extends Thread {

    public Carrera1 (String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i<=1000; i++){
            System.out.println(getName() + " : " + i + " con el ID: "+ getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    } 
    
    
}
