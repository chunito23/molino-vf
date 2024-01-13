package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class VistaConsola extends JFrame implements Ivista {
    private JTextArea textArea1;
    private JPanel panel1;
    private JTextField textField1;
    private Controlador c;


    public VistaConsola(Controlador c){
        this.c = c;
        c.setVista(this);
        setSize(600,600);
        setLocationRelativeTo(null);
        this.add(panel1);
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField1.getText();
                if (Objects.equals(texto, "iniciar")){
                    c.iniciar();
                } else if (texto.startsWith("poner:")) { //arreglar error imput
                    if(casillaValida(texto.substring(6))){
                        c.ponerFicha(texto.substring(6));
                    }else{
                        MostrarTexto("casilla invalida");
                    }
                } else if (texto.startsWith("mover:")) {
                    c.MoverFicha(texto.substring(6));
                }else if (texto.startsWith("eliminar:")) {
                c.Eliminar(texto.substring(9));
            }
            }
        });
    }

    @Override
    public void mostrar(String casilla){
        textArea1.setText("");
        for (int i = 0; i < c.getTablero().length; i++) {
            for (int j = 0; j < c.getTablero().length; j++) {
                if(c.getTablero()[i][j] == -1 || c.getTablero()[i][j] == -2){
                    textArea1.append("  -  ");
                }else{
                    textArea1.append("  " + String.valueOf(c.getTablero()[i][j])+ "  ");
                }

            }
            textArea1.append("\n");
        }
    }

    @Override
    public void iniciar() {
        textArea1.setText("");
        for (int i = 0; i < c.getTablero().length; i++) {
            for (int j = 0; j < c.getTablero().length; j++) {
                if(c.getTablero()[i][j] == -1 || c.getTablero()[i][j] == -2){
                    textArea1.append("  -  ");
                }else{
                    textArea1.append("  " + String.valueOf(c.getTablero()[i][j])+ "  ");
                }

            }
            textArea1.append("\n");
        }
    }

    private boolean casillaValida(String subtexto){
        boolean esValido = false;
        int[] tableroposiValidad = c.getTableroposiValidad();
        for(int i = 0;i<tableroposiValidad.length;i++){
            if(tableroposiValidad[i] == Integer.parseInt(subtexto)){
                esValido = true;
            }
        }
        return esValido;
    }

    public void establecerNombre(String nombreJugador) { //nose si borre aca
        setTitle(nombreJugador);
    }

    @Override
    public void MostrarTexto(String texto){
        textArea1.append(texto);
    }

}
