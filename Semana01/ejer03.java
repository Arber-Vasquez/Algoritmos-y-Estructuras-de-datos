package Semana01;

import java.util.Scanner;

public class ejer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de que desea ingresar:");
        int cantidad = scanner.nextInt();
        while (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor a 0, ingrese nuevamente:");
            cantidad = scanner.nextInt();
        }

        System.out.println("Ingrese los números:");
        int numero = scanner.nextInt();
        int mayor = numero;
        int menor = numero;
        double suma = numero;

        int ceros = 0; // para contar la cantidad de ceros ingresados
        int positivos = 0; // para contar la cantidad de numeros positivos ingresados
        int negativos = 0; // para contar la cantidad de numeros negativos ingresados

        if(numero == 0){
            ceros++;
        } else if(numero > 0){
            positivos++;
        } else {
            negativos++;
        }

        for (int i = 1; i < cantidad; i++) {
            numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            suma += numero; // sumamos el numero ingresado al promedio

            if (numero == 0) {
                ceros++;
            } else if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }

        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio de los números ingresados es: " + (suma / cantidad));
        System.out.println("La cantidad de ceros ingresados es: " + ceros);
        System.out.println("La cantidad de números positivos ingresados es: " + positivos);
        System.out.println("La cantidad de números negativos ingresados es: " + negativos);
        scanner.close();
    }
}
