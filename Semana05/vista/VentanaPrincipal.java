package Semana05.vista;

import Semana05.logica.ProcesadorArchivo;
import Semana05.modelo.ArchivoCliente;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JButton btnProcesar;
    private JTextArea areaMensajes;

    public VentanaPrincipal() {

        setTitle("Sistema DataFast");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnProcesar = new JButton("Procesar Archivo");

        areaMensajes = new JTextArea();
        areaMensajes.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaMensajes);

        setLayout(new BorderLayout());

        add(btnProcesar, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        btnProcesar.addActionListener(e -> procesarArchivo());
    }

    private void procesarArchivo() {

        ArchivoCliente archivo =
                new ArchivoCliente("clientes.txt", 15.5);

        ProcesadorArchivo procesador =
                new ProcesadorArchivo();

        try {

            areaMensajes.append("Descargando archivo...\n");
            Thread.sleep(3000);

            areaMensajes.append("Validando archivo...\n");
            Thread.sleep(2000);

            areaMensajes.append("Procesando archivo...\n");
            Thread.sleep(3000);

            areaMensajes.append("Proceso finalizado.\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}