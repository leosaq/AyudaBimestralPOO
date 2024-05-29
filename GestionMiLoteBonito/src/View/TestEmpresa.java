package View;

import Controller.*;
import java.util.Scanner;

public class TestEmpresa {

    public static void main(String[] args) {
        Persona personasArray[] = {new Persona("Gerente", "JuanDiego"),
            new Persona("Cliente", "Suany")};
        Terreno terrenosArray[] = {new Terreno(10, 5, 2),
            new Terreno(20, 30, 2)};

        Empresa empresa1 = new Empresa("Mi Lote Bonito", personasArray, terrenosArray);
        for (Persona pers : personasArray) {
            System.out.println(pers);

        }
        for (Terreno terr : terrenosArray) {
            terr.calcularArea();
            terr.calcularCostoFinal();
            System.out.println(terr);
        }
    }

}
