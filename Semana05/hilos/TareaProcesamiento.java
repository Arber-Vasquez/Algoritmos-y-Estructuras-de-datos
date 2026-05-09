package Semana05.hilos;

import javax.swing.*;
import Semana05.modelo.ArchivoCliente;

public class TareaProcesamiento extends SwingWorker<Void, String> {

    private JTextArea areaMensajes;
    private JProgressBar barra;
    private JButton boton;

    private ArchivoCliente archivo;

    public TareaProcesamiento(
            ArchivoCliente archivo,
            JTextArea areaMensajes,
            JProgressBar barra,
            JButton boton) {

        this.archivo = archivo;
        this.areaMensajes = areaMensajes;
        this.barra = barra;
        this.boton = boton;
    }

    @Override
    protected Void doInBackground() throws Exception {

        publish("Descargando archivo...");
        setProgress(25);
        Thread.sleep(3000);

        publish("Validando archivo...");
        setProgress(50);
        Thread.sleep(2000);

        publish("Procesando archivo...");
        setProgress(75);
        Thread.sleep(3000);

        publish("Proceso finalizado.");
        setProgress(100);

        return null;
    }

    @Override
    protected void process(java.util.List<String> mensajes) {

        for (String mensaje : mensajes) {
            areaMensajes.append(mensaje + "\n");
        }
    }

    @Override
    protected void done() {

        boton.setEnabled(true);

        areaMensajes.append("Sistema listo nuevamente.\n");
    }
}