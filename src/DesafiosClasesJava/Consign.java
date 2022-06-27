package DesafiosClasesJava;

public class Consign {   // Clase DesafiosClasesJava.Consign
    public String name(String reciboNombres, int reciboNumeros) {   // Primer metodo:recibe un String y un int
        return reciboNombres + ": es el nombre que recibi \n" + reciboNumeros + ": es el numero que recibi";
            // Retorna el String y el int
    }

    public String name(int reciboNumeros, String recibeNombres) {  //Segundo metodo recibe un int y un String
        return reciboNumeros + ": es el numero que recibi \n" + recibeNombres + ": es el nombre que recibi";
            // Retorna el int y el String
    }
}