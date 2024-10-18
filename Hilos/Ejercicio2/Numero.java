package Hilos.Ejercicio2;

public class Numero extends Thread {
    int num;

    public Numero(int num){
        this.num=num;
    }
    
    @Override
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println(num+ " x "+ i + " = " + num*i);
        }
    }
    
}
