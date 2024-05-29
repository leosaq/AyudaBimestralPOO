package escritura.y.lectura.de.datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Formatter;
import java.util.Scanner;

public class semana7 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("Flujos de salida");
        //FLUJO DE SALIDA
        System.out.println("Hola Luis");//Flujo de salida del .java a consola 
        Formatter fst = new Formatter("Clase1.txt");
        fst.format("Saludo: %s", "Saluditos clase");//Flujo de salida del programa a un archivo
        fst.close();
        Saludo obj1 = new Saludo("Saludos OUT - Objt1");
        //Flujo de salida del .java a un archivo basado en bits

        ObjectOutputStream fsb = new ObjectOutputStream(new FileOutputStream("ArchivoSaludo.dat"));
        fsb.writeObject(obj1);
        fsb.close();

        System.out.println("Flujos de entrada");
        //FLUJOS DE ENTRADA
        System.out.println(new Scanner(System.in).nextLine());//Flujo de entrada de consola al programa
        System.out.println((new Scanner(new File("Clase1.txt")).nextLine()));//Flujo de entrada del archivo al programa /.java
        
        //Flujo de entrada desde el archivo al .java  BASADO EN BITS
        ObjectInputStream fsbl = new ObjectInputStream(new FileInputStream("ArchivoSaludo.dat"));
        Saludo obj2 = (Saludo) fsbl.readObject(); //Deserealizacion 
        System.out.println(obj2);
    }
}

class Saludo implements Serializable {

    public String saludos;

    public Saludo(String saludos) {
        this.saludos = saludos;
    }

    @Override
    public String toString() {
        return "Saludo{" + "saludos=" + saludos + '}';
    }

}
