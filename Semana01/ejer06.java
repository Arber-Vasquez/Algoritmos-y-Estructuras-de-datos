package Semana01;

import java.util.Scanner;
public class ejer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int cantidad = 0;
        System.out.println("Ingrese un número (0 para finalizar):");
        numero = scanner.nextInt();
        while (numero != 0) {
            suma += numero;
            cantidad++;
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("La cantidad de números ingresados es: " + cantidad);
        scanner.close();
        
    }
}

