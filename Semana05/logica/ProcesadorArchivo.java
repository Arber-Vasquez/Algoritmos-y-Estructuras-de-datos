package Semana05.logica;

import Semana05.modelo.ArchivoCliente;

public class ProcesadorArchivo {

    public void procesar(ArchivoCliente archivo) {

        try {

            System.out.println("Descargando archivo...");
            Thread.sleep(3000);

            System.out.println("Validando archivo...");
            Thread.sleep(2000);

            System.out.println("Procesando archivo...");
            Thread.sleep(3000);

            System.out.println("Proceso finalizado.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}