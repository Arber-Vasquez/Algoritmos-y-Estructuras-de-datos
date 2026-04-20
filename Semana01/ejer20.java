package Semana01;

import java.util.Scanner;

public class ejer20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Ingrese número a buscar:");
        int buscar = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado");
        } else {
            System.out.println("Número no encontrado");
        }
        sc.close();
    }
}
