package Semana05.logica;

import Semana05.modelo.ArchivoCliente;
import java.util.ArrayList;

public class GestorArchivos {

    private ArrayList<ArchivoCliente> archivos;

    public GestorArchivos() {
        archivos = new ArrayList<>();
    }

    public void agregarArchivo(ArchivoCliente archivo) {
        archivos.add(archivo);
    }

    public ArrayList<ArchivoCliente> getArchivos() {
        return archivos;
    }
}
