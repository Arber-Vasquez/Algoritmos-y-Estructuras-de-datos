package Semana02;
// Esto es de memoria
import java.util.ArrayList;

public class ejer06 {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        runtime.gc();
        long antes1 = runtime.totalMemory() - runtime.freeMemory();

        int[] arreglo = new int[1000000];

        long despues1 = runtime.totalMemory() - runtime.freeMemory();

        runtime.gc();
        long antes2 = runtime.totalMemory() - runtime.freeMemory();

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            lista.add(i);
        }

        long despues2 = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Arreglo: " + (despues1 - antes1) + " bytes");
        System.out.println("ArrayList: " + (despues2 - antes2) + " bytes");
    }
}
