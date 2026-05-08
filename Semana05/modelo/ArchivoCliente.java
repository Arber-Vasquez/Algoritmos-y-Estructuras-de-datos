package Semana05.modelo;

public class ArchivoCliente {

    private String nombre;
    private double tamaño;
    private String estado;

    public ArchivoCliente(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.estado = "Pendiente";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}