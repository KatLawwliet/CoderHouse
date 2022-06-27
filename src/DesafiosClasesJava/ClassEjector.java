package DesafiosClasesJava;

import DesafiosClasesJava.Consign;

public class ClassEjector {
    public static void main(String[] args) {    // Metodo main

        Consign name = new Consign();      // Instancia de la clase DesafiosClasesJava.Consign

        Consign name2 = new Consign();    // Instancia de la clase DesafiosClasesJava.Consign

        System.out.println(name.name("Julio",  5));     // Imprime el String y el int
        System.out.println();                                                       // Salto de linea
        System.out.println(name2.name(45, "Javier"));   // Imprime el int y el String


    }
}
