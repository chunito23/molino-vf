import Controlador.Controlador;
import Vista.Login;
import Vista.VistaConsola;
import Modelo.*;
import Vista.VistaGlobal;
import Vista.VistaGrafica;

public class Main {
    public static void main(String[] args) {
            //no se actualiza cuando moves
            Jugador j1 = new Jugador();
            Jugador j2 = new Jugador();
            Modelo m = new Modelo(j1,j2);

            Controlador controlador1 = new Controlador(m);
            Controlador controlador2 = new Controlador(m);
            controlador1.setJugador(j1);
            controlador2.setJugador(j2);

            VistaGlobal vg = new VistaGlobal(controlador1,controlador2);
    }
}