package Semana02;
//Esto es de tiempo
public class ejer04 {
    public static void main(String[] args) {

        int[] arreglo = new int[1000000];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }

        int objetivo = 999999;

        // SIN break
        long inicio1 = System.nanoTime();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                // no break
            }
        }

        long fin1 = System.nanoTime();

        // CON break
        long inicio2 = System.nanoTime();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                break;
            }
        }

        long fin2 = System.nanoTime();

        System.out.println("Sin break: " + (fin1 - inicio1) + " ns");
        System.out.println("Con break: " + (fin2 - inicio2) + " ns");
    }
}
