package Semana01;

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int positivos = 0, negativos = 0;

        do {
            System.out.println("\n1. Ingresar número");
            System.out.println("2. Ver resultados");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                int num = sc.nextInt();
                if (num >= 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            } else if (opcion == 2) {
                System.out.println("Positivos: " + positivos);
                System.out.println("Negativos: " + negativos);
            }

        } while (opcion != 3);

        sc.close();
    }
}
