package Semana01;

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int suma = 0;

        do {
            System.out.println("\n1. Ingresar número");
            System.out.println("2. Mostrar suma");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Número: ");
                int num = sc.nextInt();
                suma += num;
            } else if (opcion == 2) {
                System.out.println("Suma actual: " + suma);
            }

        } while (opcion != 3);

        sc.close();
    }
}
