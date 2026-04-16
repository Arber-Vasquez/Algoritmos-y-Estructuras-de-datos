package Semana02;

public class ejer02 {
    public static void main(String args[]){
        long inicio = System.nanoTime();
        int[] numeros = new int[100];
        for(int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random() * 100 + 1);
            System.out.println(numeros[i] + " ");
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de ejecucion:" + (fin - inicio) + " ns");
    }
}
