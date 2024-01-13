package Controlador;

import Modelo.*;
import Vista.Ivista;

import java.util.ArrayList;

public class Controlador implements Iobserver {

    private IModelo m;
    private Ivista vista;
    private IJugador jugador;


    public Controlador(IModelo m){
        this.m = m;
        m.conectarJugador(this);
    }

    public int getTurno(){
        return m.getTurno();
    }

    public void setVista(Ivista vista){
        this.vista = vista;
    }

    public void conectarJugador(Iobserver io){
        m.conectarJugador(io);
    }

    public void setJugador(IJugador jugador){
        this.jugador = jugador;
    }

    public int[][] getTablero(){
        return m.getTablero();
    }

    public int[] getTableroposiValidad(){
        return m.getTableroposiValidad();
    }

    @Override
    public void update(Object cambios) {
        ArrayList<Object> cambio = (ArrayList<Object>) cambios;
        String casilla = (String) cambio.get(1);
        vista.mostrar(casilla);
        switch ((Eventos) cambio.get(0)){
            case inicio:
                vista.mostrar(casilla);
                if (this.jugador.Getid() == m.getTurno()) {
                    vista.MostrarTexto("es tu turno jugador " + this.jugador.Getid() + "\n");
                }
                break;
            case ponerFicha:
                if (this.jugador.Getid() == m.getTurno()){
                    vista.MostrarTexto("es tu turno jugador " + this.jugador.Getid() + "\n");
                }
                break;
            case MoverFicha:
                if (this.jugador.Getid() == m.getTurno()){
                    vista.MostrarTexto("mover:[ficha] [posiAmover]");
                }
                break;
            case quitarFicha:
                if (this.jugador.Getid() == m.getTurno()){
                    vista.MostrarTexto("eliminar: ");
                }
                break;
            case terminar:
                vista.MostrarTexto("termino el juego");
                break;
        }

    }

    public void iniciar() {
            m.iniciar(Eventos.inicio);
    }

    public void ponerFicha(String substring) {
        if (jugador.Getid() == m.getTurno()){
            int fila = ((int) substring.charAt(0)) -48;
            int columna = ((int) substring.charAt(1)) -48;
            m.ponerFicha(fila,columna,jugador);
        }
    }

    public void MoverFicha(String substring){
        if (jugador.Getid() == m.getTurno()){
            int filaOriginal = ((int) substring.charAt(0)) -48;
            int columnaOriginal = ((int) substring.charAt(1)) -48;
            int filaNuevo = ((int) substring.charAt(3)) -48;
            int columnaNuevo = ((int) substring.charAt(4)) -48;
            m.moverFicha(filaOriginal,columnaOriginal,filaNuevo,columnaNuevo,this.jugador);
        }
    }

    public void Eliminar(String substring) {
        if (jugador.Getid() == m.getTurno()){
            int fila = ((int) substring.charAt(0)) -48;
            int columna = ((int) substring.charAt(1)) -48;
            m.Eliminar(fila,columna,jugador);
        }
    }
}
