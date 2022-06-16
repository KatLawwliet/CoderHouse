import java.util.Scanner;   //Libreria para leer datos  desde el teclado

    public class NumeroFlotanteMorano {     // Clase principal  NumeroFlotanteMorano
        public static void main(String[] args) {    // Metodo principal main
            Scanner entrada = new Scanner(System.in);   //Crea un objeto Scanner    para leer datos desde el teclado
            System.out.println("Ingrese un numero flotante: "); //Pide al usuario que ingrese un numero flotante
            // y lo guarda en la variable numero
            float numero = entrada.nextFloat(); //Lee el número flotante ingresado por el usuario
            // y lo guarda en la variable numero

            //Imprime el numero flotante ingresado por el usuario   y lo guarda en la variable numero
            System.out.println("El numero flotante ingresado es: " + numero);

            int parteEntera = (int)numero;  //Se obtiene la parte entera del numero flotante
            // y lo guarda en la variable parteEntera
            double parteDecimal = numero - parteEntera; //Se obtiene la parte decimal del numero flotante
            // y lo guarda en la variable parteDecimal

            //Imprime la parte entera del numero flotante ingresado por el usuario  y lo guarda en la variable parteEntera
            System.out.printf("La parte entera del numero flotante es: %d%n" , parteEntera);
            //Imprime la parte decimal del numero flotante ingresado por el usuario y lo guarda en la variable parteDecimal
            System.out.printf("La parte decimal del numero flotante es: %.3f" , parteDecimal);


        }
}
