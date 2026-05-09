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

        java.util.ArrayList<ArchivoCliente> archivos = new java.util.ArrayList<>();

        archivos.add(new ArchivoCliente("clientes1.txt", 10));
        archivos.add(new ArchivoCliente("clientes2.txt", 15));
        archivos.add(new ArchivoCliente("clientes3.txt", 20));

        int exitosos = 0;
        int fallidos = 0;

        int progreso = 0;

        for (ArchivoCliente archivo : archivos) {

            if (isCancelled()) {

                publish("Proceso cancelado.");

                break;
            }

            publish("Descargando: " + archivo.getNombre());
            Thread.sleep(2000);

            publish("Validando: " + archivo.getNombre());
            Thread.sleep(1500);

            publish("Procesando: " + archivo.getNombre());
            Thread.sleep(2000);

            if (Math.random() < 0.3) {

                archivo.setEstado("Error");

                publish("Error en archivo: "
                        + archivo.getNombre());

                fallidos++;

            } else {

                archivo.setEstado("Completado");

                archivo.setExitoso(true);

                publish("Archivo completado: "
                        + archivo.getNombre());

                exitosos++;
            }

            progreso += 33;

            setProgress(progreso);
        }

        publish("================================");

        publish("Resumen final:");

        publish("Archivos procesados: "
                + archivos.size());

        publish("Exitosos: " + exitosos);

        publish("Fallidos: " + fallidos);

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