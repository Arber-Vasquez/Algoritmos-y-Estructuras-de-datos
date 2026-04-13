package Semana01;
import java.util.Scanner;

public class ejer08 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();
        int suma = 0;
        int cantidad = 0;
        while(numero !=0){
            suma += numero;
            cantidad++;
            numero = scanner.nextInt();
        }
        if (cantidad > 0) {
            System.out.println("El promedio es: " + (suma / cantidad));
        } else {
            System.out.println("No se ingresaron números");
        }
        scanner.close();
    }
}
