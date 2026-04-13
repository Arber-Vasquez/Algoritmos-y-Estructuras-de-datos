package Semana01;

import java.util.Scanner;

public class ejer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        System.out.println("Ingrese 20 números:");
        for (int i=0; i<20; i++){
            int numero = scanner.nextInt();
            if(numero % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("El número de pares es:" + par);
        System.out.println("El número de impares es:" + impar);
        scanner.close();
    }
}
