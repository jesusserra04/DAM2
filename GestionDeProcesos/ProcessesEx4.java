package GestionDeProcesos;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class ProcessesEx4 {
    public static void main(String[] args) {
        ProcessBuilder pb;
        Process p;
        String path;
        Map<String, String> environment;

        try {
            pb = new ProcessBuilder("notepad");
            p = pb.start();
            System.out.print("Execution directory: ");
            File folder = pb.directory();

            if (folder != null)
                path = folder.getAbsolutePath();
            else
                System.out.println(System.getProperty("user.dir") + "\n");

            // Launching "dir" in a new working directory
            File path1 = new File("c:\\");
            pb = new ProcessBuilder("cmd", "/C", "dir");
            pb.directory(path1);
            p = pb.start();

            // Mostramos en salida estándar el resultado del "dir" anterior
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("SHOWING EXECUTION ENVIRONMENT\n");

            environment = pb.environment();
            for (Map.Entry<String, String> entry : environment.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
