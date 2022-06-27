package Pruebas;

import Pruebas.Prueba1;

public class ClaseQueTieneMain {    // Clase que tiene main

    public static void main(String[] args) {    // Metodo main
        Prueba1 pruebita = new Prueba1();       // Instancia de la clase Pruebas.Prueba1

        Prueba1 pruebota = new Prueba1();    // Instancia de la clase Pruebas.Prueba1

        System.out.println(pruebita.nombre("Hola"));    // Imprime "Hola es lo que recibi"
        System.out.println(pruebita.nombre("Holssa"));    // Imprime "Hola es lo que recibi"
        System.out.println(pruebota.nombre());  // Imprime "puto el que lee"
        System.out.println(pruebota.nombre(3)); // Imprime "3 es el numero que recibi"
        System.out.println(pruebota.nombre(5));     // Imprime "5 es el numero que recibi"
    }
}
