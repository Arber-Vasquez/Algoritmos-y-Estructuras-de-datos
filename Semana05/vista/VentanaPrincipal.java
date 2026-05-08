package Semana05.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JButton btnProcesar;

    public VentanaPrincipal() {

        setTitle("Sistema DataFast");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnProcesar = new JButton("Procesar Archivo");

        setLayout(new FlowLayout());
        add(btnProcesar);
    }
}