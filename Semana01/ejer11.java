package Semana01;

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar números del 1 al 5");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Hola!");
            } else if (opcion == 2) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
            }

        } while (opcion != 3);

        sc.close();
    }
}
