package Modelo;

import java.util.ArrayList;

public class Modelo implements IModelo{
    private ArrayList<Iobserver> observadores = new ArrayList();
    private Jugador jugador1;
    private Jugador jugador2;

    private Eventos estado;
    private int Turno;
    private int fichasTotales;


    private int[][] tablero = {
            { 0, -1, -1,  0, -1, -1,  0},
            {-1,  0, -1,  0, -1,  0, -1},
            {-1, -1,  0,  0,  0, -1, -1},
            { 0,  0,  0, -2,  0,  0,  0},
            {-1, -1,  0,  0,  0, -1, -1},
            {-1,  0, -1,  0, -1,  0, -1},
            { 0, -1, -1,  0, -1, -1,  0}
    };
    private int[] tableroposiValidad =
            {00,03,06, 11,13,15, 22,23,24, 30,31,32,34,35,36,42,43,44,51,53,55, 60,63,66};

    public Modelo(Jugador jugador1, Jugador jugador2) {
        estado = Eventos.inicio;
        Turno = 2;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador1.SetId(1);
        this.jugador2.SetId(2);
    }

    public void conectarJugador(Iobserver io){
        observadores.add(io);
    }

    public int[][] getTablero(){
        return tablero;
    }


    public int[] getTableroposiValidad() {
        return tableroposiValidad;
    }

    @Override
    public void iniciar(Eventos eventos) {
        cambiarTurno();
        notificar(eventos);
        estado = Eventos.ponerFicha;
    }

    private void notificar(Object evento){
        for(Iobserver o : observadores){
            o.update(evento);
        }
    }

    private void cambiarTurno(){
        if (Turno == 1){
            Turno = 2;
        }else{
            Turno = 1;
        }
    }

    @Override
    public void ponerFicha(int fila,int columna,IJugador jg) {
        tablero[fila][columna] = jg.Getid();
        jg.SetFichas(jg.GetFichas() +1);
        fichasTotales++;
        if (fichasTotales == 18){
            estado = Eventos.MoverFicha;
        }
        if(esMolino(fila,columna,jg)){
            notificar(Eventos.quitarFicha);
        }else{
            cambiarTurno();
            notificar(estado);
        }


    }

    public void moverFicha(int filaOriginal, int columnaOriginal, int filaNuevo, int columnaNuevo,IJugador jg) {
        tablero[filaOriginal][columnaOriginal] = 0;
        tablero[filaNuevo][columnaNuevo] = jg.Getid();
        //if molino cambio estado y ejecuto eliminar
        if(esMolino(filaNuevo,columnaNuevo,jg)){
            notificar(Eventos.quitarFicha);
        }else {
            cambiarTurno();
            notificar(estado);
        }
    }

    public void Eliminar(int fila,int columna,IJugador jg) {
        tablero[fila][columna] = 0;
        cambiarTurno();
        if (jg.Getid() == 1) {
            jugador2.SetFichas(jugador2.GetFichas() - 1);
            if (jugador2.GetFichas() == 0) {
                estado = Eventos.terminar;
            }
        } else if (jg.Getid() == 2) {
            jugador1.SetFichas(jugador1.GetFichas() - 1);
            if (jugador1.GetFichas() == 0) {
                estado = Eventos.terminar;
            }
        }
        notificar(estado);
    }

    public int getTurno() {
        return Turno;
    }

    private boolean esMolino(int fila,int columna,IJugador jg){
        boolean esMolino = false;
        int contadorMolino = 0;
        //recorro arriba abajo
        for (int i = 0; i < 7; i++) {
            if (tablero[i][columna] == -2){
                break;
            }
            if (tablero[i][columna] == jg.Getid()) {
                contadorMolino += 1;
            }
        }
        if (contadorMolino == 3) {
            esMolino = true;
            return esMolino;
        }
        contadorMolino = 0;
        //recorro abajo arriba
        for (int i = 6; i >= 0; i--) {
            if (tablero[i][columna] == -2){
                break;
            }
            if (tablero[i][columna] == jg.Getid()) {
                contadorMolino += 1;
            }
        }
        if (contadorMolino == 3) {
            esMolino = true;
            return esMolino;
        }
        contadorMolino = 0;
        //recorro izquierda derecha

        for (int i = 0; i < 7; i++) {

            if (tablero[fila][i] == -2){
                break;
            }
            if (tablero[fila][i] == jg.Getid()) {
                contadorMolino += 1;
            }
        }

        if (contadorMolino == 3) {
            esMolino = true;
            return esMolino;
        }
        contadorMolino = 0;
        //recorro izquierda derecha
        for (int i = 6; i >= 0; i--) {
            if (tablero[fila][i] == -2){
                break;
            }
            if (tablero[fila][i] == jg.Getid()) {
                contadorMolino += 1;
            }
        }
        if (contadorMolino == 3) {
            esMolino = true;
            return esMolino;
        }
        return(esMolino);
    }

}
