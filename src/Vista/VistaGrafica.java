package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Objects;


public class VistaGrafica extends JFrame implements Ivista{private JPanel VG;
    private JLabel l00;
    private JLabel l03;
    private JButton botonInicio;
    private JLabel caero;
    private Controlador c;
    ArrayList<ImageIcon> Baseiconos = new RecursosIconos().getBaseIcono();
    ArrayList<ImageIcon> j1iconos = new RecursosIconos().getJ1Icono();
    ArrayList<ImageIcon> j2iconos = new RecursosIconos().getJ2Icono();
    ArrayList<JLabel> labels = new ArrayList<>();


    public VistaGrafica(Controlador c) {
        caero.setVisible(false);
        this.c = c;
        c.setVista(this);
        setLocationRelativeTo(null);
        setSize(600, 600);
        setContentPane(VG);

        // Agregar el MouseListener a los JLabels
        labels.add(l00);
        labels.add(l03);

        l00.addMouseListener(new LabelClickListener());
        l03.addMouseListener(new LabelClickListener());


        botonInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.iniciar();
            }
        });
    }

    public void establecerNombre(String nombreJugador) {
        setTitle(nombreJugador);
    }

    @Override
    public void mostrar(String casilla) {
        int turno = c.getTurno();
        setBackground(Color.lightGray);
        caero.setVisible(true);
        if (turno == 1){
            setBackground(Color.white);
            caero.setIcon(new ImageIcon( "C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\j1icono.png"));
            for(int i = 0;i< labels.size();i++){
                if (Objects.equals(labels.get(i).getText(), casilla)){
                    labels.get(i).setIcon(j1iconos.get(i));
                }
            }
        }else{

            for(int i = 0;i< labels.size();i++){
                setBackground(Color.white);
                caero.setIcon(new ImageIcon( "C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\j2icono.png"));
                if (Objects.equals(labels.get(i).getText(), casilla)){
                    labels.get(i).setIcon(j2iconos.get(i));
                }
            }
        }
    }

    @Override
    public void iniciar() {

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
            c.ponerFicha(labelClickeado.getText());
        }
    }
}
