package Semana07.vista;

import Semana07.modelo.Alumno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class AlumnoVista extends JFrame {

    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtNota;

    private JButton btnAgregar;
    private JButton btnBuscar;
    private JButton btnAprobados;
    private JButton btnOrdenar;
    private JButton btnMostrarTodos;
    private JButton btnLimpiar;

    private JTable tabla;
    private DefaultTableModel modeloTabla;

    public AlumnoVista() {
        setTitle("Sistema de Alumnos");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 10, 10));

        panelFormulario.add(new JLabel("Código:"));
        txtCodigo = new JTextField();
        panelFormulario.add(txtCodigo);

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Nota:"));
        txtNota = new JTextField();
        panelFormulario.add(txtNota);

        btnAgregar = new JButton("Agregar");
        btnBuscar = new JButton("Buscar");
        panelFormulario.add(btnAgregar);
        panelFormulario.add(btnBuscar);

        JPanel panelBotones = new JPanel();

        btnAprobados = new JButton("Mostrar aprobados");
        btnOrdenar = new JButton("Ordenar por nota");
        btnMostrarTodos = new JButton("Mostrar todos");
        btnLimpiar = new JButton("Limpiar");

        panelBotones.add(btnAprobados);
        panelBotones.add(btnOrdenar);
        panelBotones.add(btnMostrarTodos);
        panelBotones.add(btnLimpiar);

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Nota");

        tabla = new JTable(modeloTabla);

        setLayout(new BorderLayout(10, 10));
        add(panelFormulario, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    public String getCodigoTexto() {
        return txtCodigo.getText();
    }

    public String getNombreTexto() {
        return txtNombre.getText();
    }

    public String getNotaTexto() {
        return txtNota.getText();
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnAprobados() {
        return btnAprobados;
    }

    public JButton getBtnOrdenar() {
        return btnOrdenar;
    }

    public JButton getBtnMostrarTodos() {
        return btnMostrarTodos;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtNota.setText("");
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        modeloTabla.setRowCount(0);

        for (Alumno alumno : alumnos) {
            Object[] fila = {
                    alumno.getCodigo(),
                    alumno.getNombre(),
                    alumno.getNota()
            };

            modeloTabla.addRow(fila);
        }
    }
}
