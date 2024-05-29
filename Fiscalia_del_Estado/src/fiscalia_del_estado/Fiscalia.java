package fiscalia_del_estado;

public class Fiscalia {

    public static void main(String[] args) {
        Caso obj = new Caso();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.ingresoCaso("Metastasis",20,"Iniciado","ninguno");
                    obj.ingresoCaso("Palacio",30,"Alerta","Ninguno");
                    obj.ingresoCaso("Narco",28,"Urgente","Ninguno");
                    break;
                case 2:
                    obj.ingresoImplicado("Jose Jose",29,"Profesor","victima");
                    obj.ingresoImplicado("Maria Sol",21,"Gerente","acusado");
                    obj.ingresoImplicado("Pablo Escobar",41,"Politico","testigo");
                    break;
                    
               
            }
        } while (opc != 0);
    }

}


