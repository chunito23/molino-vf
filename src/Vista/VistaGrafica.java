package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaGrafica extends JFrame implements Ivista{private JPanel VG;
    private JLabel l00;
    private JLabel l03;
    private Controlador c;
    private int contador = 1;

    public VistaGrafica(Controlador c) {
        this.c = c;
        c.setVista(this);
        setLocationRelativeTo(null);
        setSize(600, 600);
        setContentPane(VG);

        // Agregar el MouseListener a los JLabels
        l00.setName("00");
        l03.setName("03");
        l00.addMouseListener(new LabelClickListener());
        l03.addMouseListener(new LabelClickListener());
    }

    public void establecerNombre(String nombreJugador) {
        setTitle(nombreJugador);
    }

    @Override
    public void mostrar() {

    }

    @Override
    public void MostrarTexto(String texto) {

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private class LabelClickListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel labelClickeado = (JLabel) e.getSource();

            // Ajustar el tamaño de ambos JLabels
            System.out.println(labelClickeado.getName());
        }
    }
}
