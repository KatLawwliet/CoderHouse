public class Foor {     // Clase principal
    public static void main(String[] args) {        // Metodo principal
        for (int i = 1; i < 10; i++) {  //Se ejecuta el bloque de instrucciones 10 veces
            System.out.println("El contador es: " + i); //Imprime el valor del contador en cada iteración

            if (i % 2 == 0) {  //Si el valor del contador es par
                    System.out.println("El numero es par"); //Imprime el mensaje
                } else {  //Si el valor del contador es impar
                    System.out.println("El numero es impar"); //Imprime el mensaje
                }   //Fin de if else


        }

    }

}
