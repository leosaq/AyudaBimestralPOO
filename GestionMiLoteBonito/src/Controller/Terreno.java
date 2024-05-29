package Controller;
public class Terreno {

    public double alto;
    public double ancho;
    public double valorMC;
    public double area;
    public double costoFinal;
    public String msjCompra;

    public Terreno(double alto, double ancho, double valorMC) {
        this.alto = alto;
        this.ancho = ancho;
        this.valorMC = valorMC;
        this.msjCompra=null;
    }

    public void calcularArea() {
        this.area = this.alto * this.ancho;
    }

    public void calcularCostoFinal() {
         this.costoFinal =area * valorMC;
         if (area > 300) {
            this.costoFinal *=0.8;
            this.msjCompra="Felicidades 20% de descuento";
        }else if(area >= 200){
            this.costoFinal*=0.9;
            this.msjCompra="Felicidades 10% de descuento";
                    
        }
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", valorMC=" + valorMC + ", area=" + area + ", costoFinal=" + costoFinal + ", msjCompra=" + msjCompra + '}';
    }

    
}
