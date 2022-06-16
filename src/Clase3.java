import java.util.ArrayList;  //Libreria para crear listas
import java.util.Iterator;   //Libreria para iterar sobre listas
import java.util.List;      //Libreria para crear listas

public class Clase3 {
    public static void main(String[] args) {
        List<String> listaColores = new ArrayList<>();  //Crea una lista de tipo String
        listaColores.add("Celeste");    //Agrega un elemento a la lista
        listaColores.add("Blanco");    //Agrega un elemento a la lista
        listaColores.add("Verde");     //Agrega un elemento a la lista
        listaColores.add("Marron");    //Agrega un elemento a la lista

        Iterator<String> iterator = listaColores.iterator();    //Crea un iterador para recorrer la lista

        //Imprime la cantidad de elementos de la lista
        System.out.println("Cantidad de elementos para iterar: " + listaColores.size());
        //Imprime el primer elemento de la lista
        //Recorre la lista
        while (iterator.hasNext()) {    //Mientras haya elementos para iterar
            String color = iterator.next();   //Obtiene el elemento actual de la lista
            System.out.println("Color: " + color);  //Imprime el elemento actual
            iterator.remove();  //Elimina el elemento actual de la lista
        }
        System.out.println("Cantidad de elementos final: " + listaColores.size());//Imprime la cantidad de elementos de la lista
    }

}


