package Model;

import Controller.Empleado;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LecturaEmpleados {

    public ArrayList<Empleado> listEmpleados;
    public ObjectInputStream flujoEntradaEmp;
    public FileInputStream pathArch;

    public LecturaEmpleados(FileInputStream pathArch) {
        this.pathArch = pathArch;
    }

    public ArrayList lecturaEmepladosArchivo() {
        int i = 0;
        try {
            flujoEntradaEmp = new ObjectInputStream(pathArch);
            while (true) {
                listEmpleados.add((Empleado) flujoEntradaEmp.readObject());
                System.out.println(listEmpleados.get(i));
                i++;
            }

        } catch (EOFException error) {
            return listEmpleados;
        } catch (Exception e) {
            
        }
        return listEmpleados;
    }
}
