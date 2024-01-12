package Modelo;

public interface IModelo {
    int[][] getTablero();

    int[] getTableroposiValidad();

    int getTurno();

    void conectarJugador(Iobserver io);

    void iniciar(Eventos eventos);

    void ponerFicha(int fila, int columna, IJugador jugador);

    void moverFicha(int filaOriginal, int columnaOriginal, int filaNuevo, int columnaNuevo, IJugador jg);

    void Eliminar(int fila,int columna,IJugador jg);


}
