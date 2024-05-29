
public class PagoHoras {

    public static void main(String[] args) {

        /* Persona p1 = new Persona("Liz", 17, 100,35);
        Persona p2 = new Persona("Nicole", 20, 100,58);
        p1.reCalcularSueldo();
        p2.reCalcularSueldo();
        System.out.println(p1);
        System.out.println(p2);
         */
        
        Persona p1 = new Persona(2010,42,2);
        Persona p2 = new Persona(2000,100,1);
        p1.calcularEdad();
        p2.calcularEdad();
        p1.reCalcularSueldo();    
        p2.reCalcularSueldo();
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Persona {


    private int anioNac;
    protected double sueldo;
    private int horas;
    private double costoHora ;
    private int edad;

    public Persona( int anioNac, int horas, int costHora) {
        
        this.anioNac = anioNac;
        this.horas=horas;
        this.costoHora=costHora;
    }
    
    public void calcularEdad(){
        this.edad=2024-anioNac;
    }

    public void reCalcularSueldo() {
        this.sueldo = (this.horas > 40) ? (this.costoHora*2)*this.horas: this.horas*this.costoHora;
        // IF TERNARIO
    }
    
    /*public void calcularHorasExtra() {
        this.sueldo = () ? ((this.costoHora * 2) * this.horas)*1.1 : (this.horas * this.costoHora)*1.05;
    }
    
   /* public void reCalcularSueldo() {
        this.sueldo = (this.anioNac >= 18) ? this.sueldo * 1.1 : this.sueldo * 1.05;
        // IF TERNARIO
    }
*/
    @Override
    public String toString() {
        return String.format("Edad: %s\nSueldo: %.2f\n", edad,sueldo);
    }

    

}
