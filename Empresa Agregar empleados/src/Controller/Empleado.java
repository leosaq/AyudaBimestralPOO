package Controller;
public class Empleado {
    public String titulo;
    public int edad;
    public int experiencia;
    public int numEstrellas;

    public Empleado(String titulo, int edad, int experiencia) {
        this.titulo = titulo;
        this.edad = edad;
        this.experiencia = experiencia;
    }
    
    public void calcularNumEstrellas(String carrerasDemandadas[]){
        for (String carrera : carrerasDemandadas) 
        if (titulo.equals(carrera)) {
            numEstrellas = 1;
            break;
        }
        if(((edad >= 18 && edad <=30)) && (experiencia >= 6)){
            numEstrellas +=1;
        }
            
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "titulo=" + titulo + ", edad=" + edad + ", experiencia=" + experiencia + ", numEstrellas=" + numEstrellas + '}';
    }
    
}
