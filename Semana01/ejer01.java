package Semana01;
import java.util.Scanner;

public class ejer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        double promedio = 0;
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            promedio += numero;

        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio de los números ingresados es: " + (promedio / 5));
        scanner.close();
    }
}
