package Semana01;

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Salir");
            System.out.print("Elige: ");
            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción inválida");
            }

        } while (opcion != 3);

        sc.close();
    }
}
