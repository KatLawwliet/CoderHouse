package Pruebas;

import java.util.Scanner;

public class Prueba {   //Clase principal
    public static void main(String[] args) {    //Metodo principal
        int response;   //Variable para guardar la respuesta del usuario
        new Scanner(System.in); //Crea un nuevo Scanner
        do  {   //Ciclo do-while
            System.out.println("Selecciona el numero de la opcion deseada");    //Imprime un mensaje al usuario
            System.out.println("1. Movies");    //Imprime un mensaje al usuario
            System.out.println("2. Series");    //Imprime un mensaje al usuario
            System.out.println("3. Exit");  //Imprime un mensaje al usuario

            Scanner sc = new Scanner(System.in);    //Crea un nuevo Scanner
            response =Integer.parseInt(sc.nextLine());  //Obtiene la respuesta del usuario
            switch (response) { //Switch
                case 0: //Case 0
                    System.out.println("Movies");   //Imprime un mensaje al usuario
                    break;  //Break
                case 1: //Case 1
                    System.out.println("Series");   //Imprime un mensaje al usuario
                    break;  //Break
                case 2: //Case 2
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
                    break;
            }
        }   while (response != 0);
        System.out.println("Se termino el propgrama");
    }
}
