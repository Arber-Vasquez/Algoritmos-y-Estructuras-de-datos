package Semana07.controlador;

import Semana07.modelo.Alumno;
import Semana07.servicio.AlumnoServicio;
import Semana07.vista.AlumnoVista;

public class AlumnoControlador {

    private AlumnoVista vista;
    private AlumnoServicio servicio;

    public AlumnoControlador(AlumnoVista vista, AlumnoServicio servicio) {
        this.vista = vista;
        this.servicio = servicio;

        configurarEventos();
    }

    private void configurarEventos() {
        vista.getBtnAgregar().addActionListener(e -> agregarAlumno());
        vista.getBtnBuscar().addActionListener(e -> buscarAlumno());
        vista.getBtnAprobados().addActionListener(e -> mostrarAprobados());
        vista.getBtnOrdenar().addActionListener(e -> ordenarPorNota());
        vista.getBtnMostrarTodos().addActionListener(e -> mostrarTodos());
        vista.getBtnLimpiar().addActionListener(e -> vista.limpiarCampos());
    }

    private void agregarAlumno() {
        try {
            int codigo = Integer.parseInt(vista.getCodigoTexto());
            String nombre = vista.getNombreTexto();
            double nota = Double.parseDouble(vista.getNotaTexto());

            if (nombre.trim().isEmpty()) {
                vista.mostrarMensaje("El nombre no puede estar vacío.");
                return;
            }

            if (nota < 0 || nota > 20) {
                vista.mostrarMensaje("La nota debe estar entre 0 y 20.");
                return;
            }

            Alumno alumno = new Alumno(codigo, nombre, nota);

            boolean agregado = servicio.agregarAlumno(alumno);

            if (agregado) {
                vista.mostrarMensaje("Alumno agregado correctamente.");
                vista.mostrarAlumnos(servicio.obtenerTodos());
                vista.limpiarCampos();
            } else {
                vista.mostrarMensaje("Ya existe un alumno con ese código.");
            }

        } catch (NumberFormatException ex) {
            vista.mostrarMensaje("Código y nota deben ser valores numéricos.");
        }
    }

    private void buscarAlumno() {
        try {
            int codigo = Integer.parseInt(vista.getCodigoTexto());

            Alumno alumno = servicio.buscarPorCodigo(codigo);

            if (alumno != null) {
                vista.mostrarMensaje(
                        "Alumno encontrado:\n" +
                                "Código: " + alumno.getCodigo() + "\n" +
                                "Nombre: " + alumno.getNombre() + "\n" +
                                "Nota: " + alumno.getNota()
                );
            } else {
                vista.mostrarMensaje("No se encontró un alumno con ese código.");
            }

        } catch (NumberFormatException ex) {
            vista.mostrarMensaje("Ingrese un código válido.");
        }
    }

    private void mostrarAprobados() {
        vista.mostrarAlumnos(servicio.obtenerAprobados());
    }

    private void ordenarPorNota() {
        servicio.ordenarPorNotaDescendente();
        vista.mostrarAlumnos(servicio.obtenerTodos());
    }

    private void mostrarTodos() {
        vista.mostrarAlumnos(servicio.obtenerTodos());
    }
}
