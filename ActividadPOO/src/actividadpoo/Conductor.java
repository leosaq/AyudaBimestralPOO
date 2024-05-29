/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoo;

/**
 *
 * @author leand
 */
public class Conductor {
    String nombre;
    String licencia;
    private int anoNacimiento;
    
    public void validarEdad(int anio) {
        int edad;
        edad=2024-anio;
        
        if (edad >16) {
            System.out.println("Si cumple la edad necesaria");
        }else{
            System.out.println("Es menor de edad y esta infringiendo una ley");
        }
    }
    
    public void validarLicencia(String carro,String tipo){
        if (carro.equals("taxi") && tipo.equals("E")) {
            System.out.println("Cumple con los requisitos");
        }else if(carro.equals("vehiculo") && tipo.equals("B")){
            System.out.println("Cumple con los requisitos");
        }else if (carro.equals("moto") && tipo.equals("A")){
            System.out.println("Cumple con los requisitos");
        }else{
            System.out.println("No cumple con los requisitos...");
        }
    }
    
}
