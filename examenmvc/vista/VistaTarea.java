package examenmvc.vista;
import javax.swing.*;
public class VistaTarea extends JFrame {

    public JTextField txtCodigo, txtTitulo, txtCurso, txtFecha;
    public JComboBox<String> cbEstado;
    public JButton btnRegistrar;

    public VistaTarea() {
        setTitle("Sistema de Tareas");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 80, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 20, 150, 25);
        add(txtCodigo);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(20, 60, 80, 25);
        add(lblTitulo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(120, 60, 150, 25);
        add(txtTitulo);

        JLabel lblCurso = new JLabel("Curso:");
        lblCurso.setBounds(20, 100, 80, 25);
        add(lblCurso);

        txtCurso = new JTextField();
        txtCurso.setBounds(120, 100, 150, 25);
        add(txtCurso);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(20, 140, 80, 25);
        add(lblFecha);

        txtFecha = new JTextField();
        txtFecha.setBounds(120, 140, 150, 25);
        add(txtFecha);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(20, 180, 80, 25);
        add(lblEstado);

        cbEstado = new JComboBox<>(new String[]{"Pendiente", "En proceso", "Completada"});
        cbEstado.setBounds(120, 180, 150, 25);
        add(cbEstado);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(120, 230, 100, 30);
        add(btnRegistrar);
    }
}