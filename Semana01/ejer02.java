package Semana01;

import java.util.Scanner;

public class ejer02 {
    public static void main( String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de que desea ingresar:");
        int cantidad = scanner.nextInt();
        System.out.println("Ingrese los números:");
        int numero = scanner.nextInt();
        int mayor = numero;
        int menor = numero;
        double suma = numero;

        for (int i = 1; i < cantidad; i++) {
            numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            suma += numero;

        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio de los números ingresados es: " + (suma/ cantidad));
        scanner.close();
    }
}
