package Controller;

import java.util.ArrayList;

public class Empresa {
    public ArrayList<Empleado>listaEmpleado;

    public Empresa(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
    
    public void asignarEstrellas(String carrerasDemandadas[]){
        for(Empleado emp : listaEmpleado){
            emp.calcularNumEstrellas(carrerasDemandadas);
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "listaEmpleado=" + listaEmpleado + '}';
    }
    
}
