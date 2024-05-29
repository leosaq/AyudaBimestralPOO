package fiscalia_del_estado;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso {

    Scanner entrada;

    public Caso() {
        this.entrada = new Scanner(System.in);

    }

    public int menu() {

        System.out.println("Mostrar CASO      [1]");
        System.out.println("Mostrar IMPLICADO [2]");
        System.out.println("Salir              [0]");
        System.out.println("");
        return entrada.nextInt();
    }

    public void ingresoCaso(String nombre, int fecha, String estado, String detalle) {
        String datos = String.format("Nombre Caso: " + nombre + "-----" + "Fecha de inicio: " + fecha + "-----" + "Estado Caso: " + estado + "-----" + "Detalles: " + detalle + "\n");
        ArrayList<String> casos = new ArrayList<String>();
        casos.add(datos);
        System.out.println(casos);
    }

    public void ingresoImplicado(String nombre, int edad, String ocupa, String implica) {
        String datos = String.format("Nombre: " + nombre + "-----" + "Edad: " + edad + "-----" + "Ocupacion: " + ocupa + "-----" + "Implicacion: " + implica + "\n");
        ArrayList<String> casos = new ArrayList<String>();
        casos.add(datos);
        System.out.println(casos);
    }
}
