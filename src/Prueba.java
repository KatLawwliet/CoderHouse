import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int response;
        new Scanner(System.in);
        do  {
            System.out.println("Selecciona el numero de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Exit");

            Scanner sc = new Scanner(System.in);
            response =Integer.parseInt(sc.nextLine());
            switch (response) {
                case 0:
                    System.out.println("Movies");
                    break;
                case 1:
                    System.out.println("Series");
                    break;
                case 2:
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
