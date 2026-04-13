package Semana01;
import java.util.Scanner;

public class ejer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:, valor negativo para finalizar");
        int numero = scanner.nextInt();
        int suma = 0;
        while(numero >= 0){
            suma += numero;
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
        scanner.close();
    }
}
