package Semana02;
// Esto es de CPU
public class ejer07 {
    public static void main(String[] args) {

        long inicio1 = System.nanoTime();

        for (int i = 0; i < 100000000; i++) {
            int x = i * i;
        }

        long fin1 = System.nanoTime();

        long inicio2 = System.nanoTime();

        for (int i = 0; i < 100000000; i++) {
            double x = Math.sqrt(i);
        }

        long fin2 = System.nanoTime();

        System.out.println("Multiplicación: " + (fin1 - inicio1) + " ns");
        System.out.println("Raíz cuadrada: " + (fin2 - inicio2) + " ns");
    }
}
