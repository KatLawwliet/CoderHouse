public class InicArreglo {
    public static void main(String[] args) {
        final int LONGITUD_ARREGLO = 10;    //Declara la constante LONGITUD_ARREGLO y la inicializa con 10
        int[] arreglo = new int[LONGITUD_ARREGLO]; //Declara la variable arreglo y la inicializa con un objeto arreglo

        for (int contador = 0; contador < arreglo.length; contador++) {   //Recorre el arreglo y asigna un valor aleatorio a cada elemento
            arreglo[contador] = 2 + 2 * contador;   //Asigna un valor aleatorio a cada elemento del arreglo
        }

        //Imprime la cabecera de la tabla de valores  de la lista de elementos
        System.out.printf("%s%8s%n", "Indice", "Valor");

        for (int contador = 0; contador < arreglo.length; contador++) {  //Recorre el arreglo y imprime el valor de cada elemento
            //Recorre el arreglo y imprime el valor de cada elemento
            System.out.printf("%5d%8d%n", contador, arreglo[contador]);//Imprime el valor del elemento actual del arreglo
        }

    }
}
