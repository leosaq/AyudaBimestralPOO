package Model;

import Controller.Empleado;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class leerEmpleado {
    ObjectInputStream flujoEntradaEmp;  
    FileInputStream pathArch; 
    ArrayList<Empleado> listaEmpleados;

    public leerEmpleado(FileInputStream pathArch) {
        this.pathArch = pathArch;
    }
    
    public void lecturaEmpleadosArchivo(){
        listEmpleados = new ArrayList<Empleado>();
        try {
            flujoEntradaEmp= new ObjectInputStream(pathArch);
            while (true) {                
                
            }
        } catch (Exception e) {
        }
    }
    
}
