/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpoo;

/**
 *
 * @author leand
 */
public class Vehiculo {

    String color;
    int velocidad;
    int traccion;
    private int llantas;

    public Vehiculo(String color, int velocidad, int traccion, int llantas) {
        this.color = color;
        this.velocidad = velocidad;
        this.traccion = traccion;
        this.llantas = llantas;
        //System.out.println("El color del vehiculo es: " + color
        //    + " Va a una velocidad de " + velocidad + " kmh y su traccion es " + traccion);
    }

    public void subirVelocidad() {
        System.out.println("Subir velocidad");
    }

    public void bajarVelocidad() {
        System.out.println("Bajar velocidad");
    }

    public void cambiarMarcha() {
        System.out.println("Cambiar marcha" + velocidad);
    }

    public void tipoVehiculo(int n) {
        if (n == 2) {
            System.out.println("El vehiculo es una MOTO");
        } else {
            if (n > 2 && n < 5) {
                System.out.println("El vehiculo es una CAMIONETA");
            } else {
                System.out.println("El vehiculo es un CAMION");
            }
        }
    }

    public void llantas() {
        System.out.println("El numero de llantas es " + llantas);
    }

  //************************SET
    public void establecerColor(String col) {
        color = col;
    }

    public void establecerVelocidad(int vel) {
        velocidad = vel;
    }

    public void establecerTraccion(int tra) {
        traccion = tra;
    }

    public void establecerLlantas(int llan) {
        llantas = llan;
    }
//******************************GET
    public String obtenerColor() {
        return  color;
    }

    public int obtenerVelocidad() {
        return velocidad;
    }

    public int obtenerTraccion() {
        return traccion;
    }

    public int obtenerLlantas() {
        return llantas;
    }
}
