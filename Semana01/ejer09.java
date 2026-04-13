package Semana01;
import java.util.Scanner;
public class ejer09 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();
        int par = 0;
        int impar = 0;
        while(numero != 0){
            if(numero % 2 == 0){
                par++;
            } else {
                impar++;
            }
            numero = scanner.nextInt();
        }
        System.out.println("El numero de pares: " + par);
        System.out.println("El numero de impares: " + impar);
        scanner.close();
    }
}
