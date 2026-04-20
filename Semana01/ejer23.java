package Semana01;

import java.util.Vector;

public class ejer23 {
    public static void main(String[] args) {
        Vector<Integer> numeros = new Vector<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Eliminar el segundo elemento
        numeros.remove(1);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }


    }
}
