package GestionDeProcesos;

public class ProcessesEx3 {
    public static void main(String[] args) {
    ProcessBuilder pb;
    Process p;
    try {
    pb = new ProcessBuilder("notepad");
    p = pb.start();
    while(p.isAlive()){
    System.out.println("Process state: active" );
    Thread.sleep(3000);
    }
   
    } catch (Exception e) {
    e.printStackTrace();
    }
    System.out.println("The process has ended.");
    }
   }