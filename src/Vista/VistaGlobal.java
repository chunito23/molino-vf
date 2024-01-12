package Vista;


import Controlador.Controlador;
import Modelo.Modelo;

import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class VistaGlobal {
    Login login1 = new Login();
    Login login2 = new Login();
    ArrayList<Ivista> vcs = new ArrayList<>();
    ArrayList<Ivista> vgs = new ArrayList<>();



     public VistaGlobal(Controlador c, Controlador c2){
         login1.getIniciarButton().addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 iniciarJugadores(login1,c);
             }
         });
         login2.getIniciarButton().addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 iniciarJugadores(login2,c2);
             }
         });
     }

     public void iniciarJugadores(Login l,Controlador c){
         l.setVisible(false);
         if (l.getSeleccionGrafica()){
             VistaGrafica vg = new VistaGrafica(c);
             vg.setVisible(true);
             vg.establecerNombre(l.getTextField1());
             vgs.add(vg);
         }else{
             VistaConsola vc = new VistaConsola(c);
             vc.establecerNombre(l.getTextField1());
             vc.setVisible(true);
             vcs.add(vc);
         }
     }
}
