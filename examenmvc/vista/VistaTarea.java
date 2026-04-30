package examenmvc.vista;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class VistaTarea extends JFrame {

    public JTextField txtCodigo, txtTitulo, txtCurso, txtFecha;
    public JComboBox<String> cbEstado;
    public JButton btnRegistrar;
    public JTextArea txtArea;
    public JButton btnEliminar, btnBuscar, btnCambiarEstado;
    public JTextField txtBuscar;

    public VistaTarea() {
        setTitle("Sistema de Tareas");
        setSize(960, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(40, 30, 100, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(150, 30, 200, 25);
        add(txtCodigo);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(40, 70, 100, 25);
        add(lblTitulo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(150, 70, 200, 25);
        add(txtTitulo);

        JLabel lblCurso = new JLabel("Curso:");
        lblCurso.setBounds(40, 110, 100, 25);
        add(lblCurso);

        txtCurso = new JTextField();
        txtCurso.setBounds(150, 110, 200, 25);
        add(txtCurso);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(40, 150, 100, 25);
        add(lblFecha);

        txtFecha = new JTextField();
        txtFecha.setBounds(150, 150, 200, 25);
        add(txtFecha);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(40, 190, 100, 25);
        add(lblEstado);

        cbEstado = new JComboBox<>(new String[] { "Pendiente", "En proceso", "Completada" });
        cbEstado.setBounds(150, 190, 200, 25);
        add(cbEstado);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(150, 240, 140, 35);
        add(btnRegistrar);

        txtArea = new JTextArea();
        txtArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtArea);
        scroll.setBounds(400, 30, 500, 300);
        add(scroll);

        JLabel lblBuscar = new JLabel("Buscar:");
        lblBuscar.setBounds(40, 320, 100, 25);
        add(lblBuscar);

        txtBuscar = new JTextField();
        txtBuscar.setBounds(150, 320, 200, 25);
        add(txtBuscar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(40, 370, 120, 35);
        add(btnBuscar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(180, 370, 120, 35);
        add(btnEliminar);

        btnCambiarEstado = new JButton("Cambiar Estado");
        btnCambiarEstado.setBounds(320, 370, 160, 35);
        add(btnCambiarEstado);
    }
}