package examenmvc.main;
import examenmvc.vista.VistaTarea;
import examenmvc.controlador.TareaControlador;
public class Main {
    public static void main(String[] args) {
        VistaTarea vista = new VistaTarea();
        TareaControlador controlador = new TareaControlador(vista);

        vista.setVisible(true);
    }
}
