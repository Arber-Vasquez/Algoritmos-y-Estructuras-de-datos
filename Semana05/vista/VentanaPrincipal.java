package Semana05.vista;

import Semana05.hilos.TareaProcesamiento;
import Semana05.modelo.ArchivoCliente;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JButton btnProcesar;
    private JTextArea areaMensajes;
    private JProgressBar barra;

    public VentanaPrincipal() {

        setTitle("Sistema DataFast");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnProcesar = new JButton("Procesar Archivo");

        areaMensajes = new JTextArea();
        areaMensajes.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaMensajes);

        barra = new JProgressBar(0, 100);
        barra.setStringPainted(true);

        setLayout(new BorderLayout());

        add(btnProcesar, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(barra, BorderLayout.SOUTH);

        btnProcesar.addActionListener(e -> iniciarProceso());
    }

    private void iniciarProceso() {

        btnProcesar.setEnabled(false);

        areaMensajes.setText("");

        ArchivoCliente archivo =
                new ArchivoCliente("clientes.txt", 15.5);

        TareaProcesamiento tarea =
                new TareaProcesamiento(
                        archivo,
                        areaMensajes,
                        barra,
                        btnProcesar
                );

        tarea.addPropertyChangeListener(evt -> {

            if ("progress".equals(evt.getPropertyName())) {

                barra.setValue((Integer) evt.getNewValue());
            }
        });

        tarea.execute();
    }
}