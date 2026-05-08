package Semana05.logica;

import Semana05.modelo.ArchivoCliente;

public class ProcesadorArchivo {

    public void descargarArchivo(ArchivoCliente archivo) {
        System.out.println("Descargando: " + archivo.getNombre());
    }

    public void validarArchivo(ArchivoCliente archivo) {
        System.out.println("Validando: " + archivo.getNombre());
    }

    public void procesarArchivo(ArchivoCliente archivo) {
        System.out.println("Procesando: " + archivo.getNombre());
    }
}