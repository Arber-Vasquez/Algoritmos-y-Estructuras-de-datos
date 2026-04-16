package Semana02;

// ESto es de memoria
public class ejer05 {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long antes = runtime.totalMemory() - runtime.freeMemory();

        int[] arreglo = new int[1000000];

        long despues = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memoria usada: " + (despues - antes) + " bytes");
    }

}
