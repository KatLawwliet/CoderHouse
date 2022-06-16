
    public class SumaArreglo {
        public static void main(String[] args)
        {
            int [] arreglo = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
            int total = 0;

            for (int i : arreglo) {
                total += i;
            }
            System.out.printf("El total de los elementos del arreglo es: %d%n", total);

        }   //Fin del main
}
