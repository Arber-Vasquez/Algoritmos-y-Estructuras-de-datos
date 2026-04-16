package Semana02;
//Esto es de CPU
public class ejer08 {
    public static void main(String[] args) {

        long inicio1 = System.nanoTime();

        for (int i = 0; i < 100000000; i++) {
            int x = i;
        }

        long fin1 = System.nanoTime();

        long inicio2 = System.nanoTime();

        for (int i = 0; i < 100000000; i++) {
            if (i % 2 == 0) {
                int x = i;
            }
        }

        long fin2 = System.nanoTime();

        System.out.println("Sin condición: " + (fin1 - inicio1) + " ns");
        System.out.println("Con condición: " + (fin2 - inicio2) + " ns");
    }
}
