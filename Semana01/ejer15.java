package Semana01;

import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese primer número: ");
                int a = sc.nextInt();
                System.out.print("Ingrese segundo número: ");
                int b = sc.nextInt();

                if (opcion == 1) {
                    System.out.println("Resultado: " + (a + b));
                } else {
                    System.out.println("Resultado: " + (a - b));
                }
            }

        } while (opcion != 3);

        sc.close();
    }
}
