
public class TestPersonas {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Liz", 17, 100);
        Persona p2 = new Persona("Nicole", 20, 100);
        p1.reCalcularSueldo();
        p2.reCalcularSueldo();

        
        System.out.println(p1);

        System.out.println(p2);
    }
}

class Persona {

    public String nombre;
    private int edad;
    protected double sueldo;

    public Persona(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;

    }

    @Override
    public String toString() {
        return String.format("Personas: %s\nEdad: %s\nSueldo: %.2f", nombre, edad, sueldo);
    }

    public void reCalcularSueldo() {
        this.sueldo = (this.edad >= 18) ? this.sueldo * 1.1 : sueldo * 1.05;
        // IF TERNARIO
    }
}
