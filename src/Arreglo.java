public class Arreglo {
    public static void main(String[] args) {
            // Declara la variable arreglo y la inicializa con un objeto arreglo
        int[] arreglo = {32,27,64,18,95,14,90,70,60,37}; //Crea un arreglo de 10 elementos

                //Imprime la cabecera de la tabla de valores  de la lista de elementos
                System.out.printf("%s%8s%n", "Indice", "Valor");

            //Imprime el valor de cada elemento del arreglo en la tabla de valores  de la lista de elementos
            for (int contador = 0; contador < arreglo.length; contador++){  //Recorre el arreglo y imprime el valor de cada elemento

                System.out.printf("%5d%8d%n", contador, arreglo[contador]);  //Imprime el valor del elemento actual del arreglo

        }

    }

}
