package Semana01;
import java.util.Scanner;

public class ejer17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Ingrese 5 números:");

        for(int i = 0; i < 5; i++){
            numeros[i] = sc.nextInt();
        }
        
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("Mayor: " + mayor);
        sc.close();
    }
}
