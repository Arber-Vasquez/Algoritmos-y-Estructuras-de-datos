package Semana05.vista;

import Semana05.hilos.TareaProcesamiento;
import Semana05.modelo.ArchivoCliente;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JButton btnProcesar;
    private JTextArea areaMensajes;
    private JProgressBar barra;
    private JButton btnCancelar;
    private TareaProcesamiento tareaActual;

    public VentanaPrincipal() {

        setTitle("Sistema DataFast");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnProcesar = new JButton("Procesar Archivo");

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setEnabled(false);

        areaMensajes = new JTextArea();
        areaMensajes.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaMensajes);

        barra = new JProgressBar(0, 100);
        barra.setStringPainted(true);

        JPanel panelBotones = new JPanel();

        panelBotones.add(btnProcesar);
        panelBotones.add(btnCancelar);

        setLayout(new BorderLayout());

        add(panelBotones, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(barra, BorderLayout.SOUTH);

        btnProcesar.addActionListener(e -> iniciarProceso());

        btnCancelar.addActionListener(e -> {

            if (tareaActual != null) {

                tareaActual.cancel(true);

                areaMensajes.append("Cancelando proceso...\n");
            }
        });
    }

    private void iniciarProceso() {

        btnProcesar.setEnabled(false);
        btnCancelar.setEnabled(true);

        areaMensajes.setText("");

        ArchivoCliente archivo = new ArchivoCliente("clientes.txt", 15.5);

        tareaActual = new TareaProcesamiento(
                archivo,
                areaMensajes,
                barra,
                btnProcesar);

        tareaActual.addPropertyChangeListener(evt -> {

            if ("progress".equals(evt.getPropertyName())) {

                barra.setValue((Integer) evt.getNewValue());
            }
        });

        tareaActual.execute();
    }
}