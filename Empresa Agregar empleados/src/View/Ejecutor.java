package View;

import Controller.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejecutor {

    public static void main(String[] args) {
        String carrerasDemandadas[]={"Computacion","Medicina","Marketing Digital"};
        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>(Arrays.asList(
                new Empleado("Computacion", 18, 2),
                new Empleado("Administracion Empresas", 50, 15),
                new Empleado("Medicina", 30, 7),
                new Empleado("Artes", 25, 4),
                new Empleado("Abogacia", 25, 6)));
 
        Empresa ricardoAS = new Empresa(listaEmpleado);
        ricardoAS.asignarEstrellas(carrerasDemandadas);
        
        System.out.println(ricardoAS);
    }
    
    
}
