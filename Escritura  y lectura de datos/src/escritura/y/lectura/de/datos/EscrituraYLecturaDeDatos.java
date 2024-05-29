
package escritura.y.lectura.de.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class EscrituraYLecturaDeDatos {

    public static void main(String[] args) throws FileNotFoundException {
        // FLUJO DE SALIDA
        System.out.println("Hola mundo");   
        Formatter s = new Formatter("test.txt");
        s.format("%s", "Steven fallo");
        s.close();
        
        //FLUJO DE ENTRADA
        Scanner e= new Scanner(System.in);
        String saludo = e.nextLine();
        System.out.println("Ingreso es: "+saludo);
        Scanner s1 = new Scanner(new File("test.txt"));
        String valor = s1.nextLine();
        System.out.println("El valor leido es: "+valor);
        
    }
    
}
