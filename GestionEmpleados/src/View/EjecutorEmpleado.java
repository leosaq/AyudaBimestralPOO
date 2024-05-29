package View;

import Controller.Empleado;
import Model.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class EjecutorEmpleado {

    public static void main(String[] args) {
        ArrayList<Empleado> listEmp = new ArrayList<Empleado>(Arrays.asList(
                new Empleado("Anthony", 1000, 23),
                new Empleado("Marco", 1500, 21),
                new Empleado("Suany", 2000, 24)));
        ArrayList<Empleado> listEmp2 = new ArrayList<Empleado>();
        try {
            FileOutputStream pathArchivoSalida = new FileOutputStream("DataEmpleados.dat");
            FileInputStream pathArchivoEntrada = new FileInputStream("DataEmpleados.dat");
            EscrituraEmpleados escrituraEmp = new EscrituraEmpleados(listEmp, pathArchivoSalida);
            escrituraEmp.escribirEmpArchivo();
            
            LecturaEmpleados lecturaEmp = new LecturaEmpleados(pathArchivoEntrada);
            listEmp2= lecturaEmp.lecturaEmepladosArchivo();
            for(Empleado emp : listEmp2){
                System.out.println(emp);
            }
                
        } catch (Exception e) {
        }

    }
}
