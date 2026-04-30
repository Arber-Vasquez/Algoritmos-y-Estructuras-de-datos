package examenmvc.controlador;

import examenmvc.vista.VistaTarea;
import examenmvc.modelo.Tarea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TareaControlador implements ActionListener {

    private VistaTarea vista;
    private ArrayList<Tarea> listaTareas;

    public TareaControlador(VistaTarea vista) {
        this.vista = vista;
        this.listaTareas = new ArrayList<>();

        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnCambiarEstado.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnRegistrar) {
            registrarTarea();
        }

        if (e.getSource() == vista.btnEliminar) {
            eliminarTarea();
        }

        if (e.getSource() == vista.btnBuscar) {
            buscarTarea();
        }

        if (e.getSource() == vista.btnCambiarEstado) {
            cambiarEstado();
        }
    }

    private void registrarTarea() {

        String codigo = vista.txtCodigo.getText().trim();
        String titulo = vista.txtTitulo.getText().trim();

        if (codigo.isEmpty() || titulo.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Campos obligatorios vacíos");
            return;
        }

        for (Tarea t : listaTareas) {
            if (t.getCodigo().equals(codigo)) {
                JOptionPane.showMessageDialog(vista, "Código repetido");
                return;
            }
        }

        String curso = vista.txtCurso.getText();
        String fecha = vista.txtFecha.getText();
        String estado = vista.cbEstado.getSelectedItem().toString();

        Tarea tarea = new Tarea(codigo, titulo, curso, fecha, estado);
        listaTareas.add(tarea);

        JOptionPane.showMessageDialog(vista, "Tarea registrada");
        mostrarTareas();
    }

    private void mostrarTareas() {
        StringBuilder sb = new StringBuilder();

        for (Tarea t : listaTareas) {
            sb.append(t.getCodigo()).append(" - ")
                    .append(t.getTitulo()).append(" - ")
                    .append(t.getEstado()).append("\n");
        }

        vista.txtArea.setText(sb.toString());
    }

    private void eliminarTarea() {
        String codigo = vista.txtCodigo.getText();

        listaTareas.removeIf(t -> t.getCodigo().equals(codigo));

        JOptionPane.showMessageDialog(vista, "Tarea eliminada (si existía)");
        mostrarTareas();
    }

    private void buscarTarea() {
        String dato = vista.txtBuscar.getText();

        for (Tarea t : listaTareas) {
            if (t.getCodigo().equals(dato) || t.getTitulo().equalsIgnoreCase(dato)) {
                JOptionPane.showMessageDialog(vista, "Encontrado: " + t.getTitulo());
                return;
            }
        }

        JOptionPane.showMessageDialog(vista, "No encontrado");
    }

    private void cambiarEstado() {
        String codigo = vista.txtCodigo.getText();

        for (Tarea t : listaTareas) {
            if (t.getCodigo().equals(codigo)) {
                t.setEstado(vista.cbEstado.getSelectedItem().toString());
                JOptionPane.showMessageDialog(vista, "Estado actualizado");
                mostrarTareas();
                return;
            }
        }

        JOptionPane.showMessageDialog(vista, "Tarea no encontrada");
    }
}