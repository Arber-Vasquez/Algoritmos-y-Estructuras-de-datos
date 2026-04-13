package Semana01;
import java.util.Scanner;
public class ejer10 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();
        if(numero == 0){
            System.out.println("No se ingresaron numeros");
            scanner.close();
            return;
        }
        int mayor = numero;
        int menor = numero;
        while(numero != 0){
            if(numero > mayor){
                mayor = numero;
            }
            if(numero < menor){
                menor = numero;
            }
            numero = scanner.nextInt();
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        scanner.close();
    }
}
