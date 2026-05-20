package Semana07.Main;

import Semana07.controlador.AlumnoControlador;
import Semana07.servicio.AlumnoServicio;
import Semana07.vista.AlumnoVista;

public class Main {

    public static void main(String[] args) {
        AlumnoVista vista = new AlumnoVista();
        AlumnoServicio servicio = new AlumnoServicio();

        new AlumnoControlador(vista, servicio);

        vista.setVisible(true);
    }
}
