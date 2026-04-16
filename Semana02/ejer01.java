package Semana02;

public class ejer01 {
    public static void main(String args[]){
        long inicio = System.nanoTime();
    
        for(int i=0; i<100000000;i++){
            Math.sqrt(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de ejecucion:" + (fin - inicio) + " ns");
    }
}
