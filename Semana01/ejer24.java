package Semana01;

import java.util.Vector;

public class ejer24 {
    public static void main(String[] args) {
        Vector<Integer> numeros = new Vector<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(100);

        if (numeros.contains(20)) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }

    }
}
