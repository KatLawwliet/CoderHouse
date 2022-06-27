package Desafios;
import java.util.*;     // Importa la clase List


public class ListarPersonas_Apellido {  // Clase principal
    public static void main(String[] args) {        // Metodo principal

        Persona persona1 = new Persona();      // Crea una nueva persona
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();

        persona1.setNombre("Juan");    // Asigna el nombre a la persona
        persona2.setNombre("Pedro");
        persona3.setNombre("Maria");
        persona4.setNombre("Julian");
        persona5.setNombre("Jorge");

        persona1.setApellido("Perez");  // Asigna el apellido a la persona
        persona2.setApellido("Gonzalez");
        persona3.setApellido("Lopez");
        persona4.setApellido("Gomez");
        persona5.setApellido("Rodriguez");

        List<Persona> personas = new ArrayList<>();  // Crea una lista de personas

        personas.add(persona1);   // Agrega la persona a la lista
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        personas.sort(Comparator.comparing(Persona::getNombre) );    // Ordena por nombre
        System.out.println("Lista ordenada por nombre: ");
        personas.forEach(per -> System.out.println(per.getNombre() ) ); // Imprime la lista ordenada por nombre
        System.out.println();


        personas.sort(Comparator.comparing(Persona::getApellido) );    // Ordena por apellido
        System.out.println("Lista ordenada por apellido: ");
        personas.forEach(per -> System.out.println(per.getApellido() ) ); // Imprime la lista ordenada por apellido
        System.out.println();


        personas.sort(Comparator.comparing(Persona::getApellido).reversed() ); // Ordena por apellido inverso
        System.out.println("Lista ordenada por apellido inverso: ");
        personas.forEach(per -> System.out.println( per.getApellido() ) ); // Imprime la lista ordenada por apellido inverso
        System.out.println();






    }

}
