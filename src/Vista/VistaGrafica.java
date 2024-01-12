package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VistaGrafica extends JFrame implements Ivista{private JPanel VG;
    private JLabel l00;
    private JLabel l03;
    private Controlador c;
    private JLabel ultimaLabelClickeado;
    ImageIcon baseAbajoDerecha = new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO ABAJO DERECHA.png");
    ImageIcon j1AbajoDerecha = new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO ABAJO DERECHA.png");
    ImageIcon j2AbajoDerecha = new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO ABAJO DERECHA.png");
    ImageIcon baseIzquierdaDerechaAbajo = new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\BCIRCULO IZQUIERDA DERECHA ABAJO.png");
    ImageIcon j1IzquierdaDerechaAbajo = new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J1CIRCULO IZQUIERDA DERECHA ABAJO.png");
    ImageIcon j2IzquierdaDerechaAbajo = new ImageIcon("C:\\Users\\domin\\OneDrive\\Escritorio\\molino-main\\src\\recursos\\J2CIRCULO IZQUIERDA DERECHA ABAJO.png");
    ArrayList<ImageIcon> j1iconos = new ArrayList<>();
    ArrayList<ImageIcon> j2iconos = new ArrayList<>();
    ArrayList<JLabel> labels = new ArrayList<>();


    public VistaGrafica(Controlador c) {
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

        j1iconos.add(j1AbajoDerecha);
        j1iconos.add(j1IzquierdaDerechaAbajo);
        j2iconos.add(j2AbajoDerecha);
        j2iconos.add(j2IzquierdaDerechaAbajo);
    }

    public void establecerNombre(String nombreJugador) {
        setTitle(nombreJugador);
    }

    @Override
    public void mostrar() {
        int turno = c.getTurno();
        if (turno == 1){
            for(int i = 0;i< labels.size();i++){
                if (labels.get(i) == ultimaLabelClickeado){
                    ultimaLabelClickeado.setIcon(j1iconos.get(i));
                }
            }
        }else{
            for(int i = 0;i< labels.size();i++){
                if (labels.get(i) == ultimaLabelClickeado){
                    ultimaLabelClickeado.setIcon(j2iconos.get(i));
                }
            }
        }
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
            ultimaLabelClickeado = labelClickeado;
            // Ajustar el tamaño de ambos JLabels
            c.ponerFicha(labelClickeado.getText());
        }
    }
}
