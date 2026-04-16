package Semana02;
//Esto es de tiempo
public class ejer03 {
    public static void main(String[] args) {

        int[] arreglo = new int[1000000];

        long inicio1 = System.nanoTime();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }

        long fin1 = System.nanoTime();

        long inicio2 = System.nanoTime();

        for (int i = 0; i < arreglo.length; i++) {
            int x = arreglo[i];
        }

        long fin2 = System.nanoTime();

        System.out.println("Tiempo llenado: " + (fin1 - inicio1) + " ns");
        System.out.println("Tiempo recorrido: " + (fin2 - inicio2) + " ns");
    }
}
