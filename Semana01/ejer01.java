package Semana01;
import java.util.Scanner;

// Ejercicio 1: Escribe un programa que solicite al usuario 5 numeros y mostrar el mayorde ellos.
public class ejer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor = 0; // solo para numeros mayores que 0
        int menor = 0; // solo para numeros menores que 0
        double promedio = 0; // para calcular el promedio de los numeros ingresados
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            promedio += numero; // sumamos el numero ingresado al promedio

        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio de los números ingresados es: " + (promedio / 5)); // dividimos el total por 5 para obtener el promedio
        scanner.close();
    }
}
