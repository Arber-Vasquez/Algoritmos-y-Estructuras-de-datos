package Semana05.modelo;

public class ArchivoCliente {

    private String nombre;
    private double tamaño;
    private String estado;
    private boolean exitoso;

    public ArchivoCliente(String nombre, double tamaño) {

        this.nombre = nombre;
        this.tamaño = tamaño;
        this.estado = "Pendiente";
        this.exitoso = false;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public boolean isExitoso() {
        return exitoso;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
    }
}