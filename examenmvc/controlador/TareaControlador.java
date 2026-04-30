package examenmvc.controlador;
import examenmvc.vista.VistaTarea;
import examenmvc.modelo.Tarea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TareaControlador implements ActionListener {

    private VistaTarea vista;
    private ArrayList<Tarea> listaTareas;

    public TareaControlador(VistaTarea vista) {
        this.vista = vista;
        this.listaTareas = new ArrayList<>();

        this.vista.btnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnRegistrar) {

            String codigo = vista.txtCodigo.getText();
            String titulo = vista.txtTitulo.getText();
            String curso = vista.txtCurso.getText();
            String fecha = vista.txtFecha.getText();
            String estado = vista.cbEstado.getSelectedItem().toString();

            Tarea tarea = new Tarea(codigo, titulo, curso, fecha, estado);
            listaTareas.add(tarea);

            mostrarTareas();
        }
    }

    private void mostrarTareas() {
        StringBuilder sb = new StringBuilder();

        for (Tarea t : listaTareas) {
            sb.append(t.getCodigo()).append(" - ")
              .append(t.getTitulo()).append(" - ")
              .append(t.getEstado()).append("\n");
        }

        System.out.println(sb.toString());
    }
}