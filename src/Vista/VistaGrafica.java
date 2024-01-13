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


public class VistaGrafica extends JFrame implements Ivista{
    private JPanel VG;
    private JLabel l00;
    private JLabel l03;
    private JButton botonInicio;
    private JLabel caero;
    private JLabel l06;
    private JLabel l11;
    private JLabel l13;
    private JLabel l15;
    private JLabel l22;
    private JLabel l24;
    private JLabel l35;
    private JLabel l31;
    private JLabel l30;
    private JLabel l36;
    private JLabel l32;
    private JLabel l34;
    private JLabel l23;
    private JLabel l60;
    private JLabel l43;
    private JLabel l53;
    private Controlador c;
    ArrayList<ImageIcon> Baseiconos = new RecursosIconos().getBaseIconos();
    ArrayList<ImageIcon> j1iconos = new RecursosIconos().getJ1Iconos();
    ArrayList<ImageIcon> j2iconos = new RecursosIconos().getJ2Iconos();
    ArrayList<JLabel> labels = new ArrayList<>();


    public VistaGrafica(Controlador c) {
        this.c = c;
        c.setVista(this);
        setLocationRelativeTo(null);
        setSize(600, 600);
        setContentPane(VG);

        l00.setName("0");
        l11.setName("0");
        l22.setName("0");
        l03.setName("1");
        l43.setName("1");
        l06.setName("2");
        l15.setName("2");
        l24.setName("2");
        l53.setName("8");
        l13.setName("8"); //los del 8 no andan
        l31.setName("8");
        l35.setName("8");

        labels.add(l00);
        labels.add(l11);
        labels.add(l22);
        labels.add(l03);
        labels.add(l43);
        labels.add(l06);
        labels.add(l13);
        labels.add(l15);
        labels.add(l24);
        labels.add(l35);
        labels.add(l31);
        labels.add(l30);
        labels.add(l36);
        labels.add(l32);
        labels.add(l34);
        labels.add(l23);

        for (JLabel label : labels) {
            label.addMouseListener(new LabelClickListener());
        }

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
        caero.setText(String.valueOf(turno));
        if (turno == 1){
            setBackground(Color.white);
            //caero.setIcon(new ImageIcon( "C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\j1icono.png"));
            for(int i = 0;i< Baseiconos.size();i++){ // hay mas label que iconos
                if (Objects.equals(labels.get(i).getText(), casilla)){
                    labels.get(i).setIcon(j1iconos.get(Integer.parseInt(labels.get(i).getName())));
                }
            }
        }else{

            for(int i = 0;i< Baseiconos.size();i++){
                setBackground(Color.white);
                //caero.setIcon(new ImageIcon( "C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\j2icono.png"));
                if (Objects.equals(labels.get(i).getText(), casilla)){
                    labels.get(i).setIcon(j2iconos.get(Integer.parseInt(labels.get(i).getName())));
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

