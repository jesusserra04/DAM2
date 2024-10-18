package GestionDeProcesos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessesEx5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ProcessBuilder pb;
        Process ps;
        String file;
        boolean bucle = true;
        while (bucle) {
            System.out.println("Introduce nombres de fichero | 0-Salir");
            file = s.nextLine();

            if(file.equals("0")){
                bucle = false;
            }else{
                
            }
            
        }
       

        

    }
}
