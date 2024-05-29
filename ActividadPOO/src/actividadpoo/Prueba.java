/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpoo;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Vehiculo vehiculo = new Vehiculo("Rojo", 80, 4,2);
        //vehiculo.establecerLlantas(6);
        //vehiculo.llantas();

        //System.out.println("Ingrese numero de llantas: ");
        //int num = entrada.nextInt();
        //vehiculo.tipoVehiculo(num);
        
        Conductor conductor = new Conductor();
        System.out.println("Ingrese su año de nacimiento: ");
        int anio = entrada.nextInt();
        conductor.validarEdad(anio);
        entrada.nextLine();
        System.out.println("Ingrese el tipo de vehiculo que conduce: ");
        String vehiculo = entrada.nextLine();
        System.out.println("Ingrese su tipo de licencia: ");
        String tipo = entrada.nextLine();
        conductor.validarLicencia(vehiculo,tipo);
        
    }

}
