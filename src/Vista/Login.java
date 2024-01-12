package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JButton iniciarButton;
    private JTextField textField1;
    private JButton consolaButton;
    private JButton graficaButton;
    private JPanel login;
    private boolean seleccionGrafica; // consola false || grafica true

    public Login(){
        Color base = consolaButton.getBackground();
        setVisible(true);
        setTitle("login ");
        setLocationRelativeTo(null);
        setSize(400,200);
        setContentPane(login);

        consolaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionGrafica = false;
                consolaButton.setBackground(Color.gray);
                graficaButton.setBackground(base);
            }
        });
        graficaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionGrafica = true;
                consolaButton.setBackground(base);
                graficaButton.setBackground(Color.gray);
            }
        });
    }


    public boolean getSeleccionGrafica() {
        return seleccionGrafica;
    }



    public JButton getIniciarButton() {
        return iniciarButton;
    }

    public void setIniciarButton(JButton iniciarButton) {
        this.iniciarButton = iniciarButton;
    }

    public String getTextField1() {
        return textField1.getText();
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JButton getConsolaButton() {
        return consolaButton;
    }

    public void setConsolaButton(JButton consolaButton) {
        this.consolaButton = consolaButton;
    }

    public JButton getGraficaButton() {
        return graficaButton;
    }

    public void setGraficaButton(JButton graficaButton) {
        this.graficaButton = graficaButton;
    }

    public JPanel getLogin() {
        return login;
    }

    public void setLogin(JPanel login) {
        this.login = login;
    }


}
