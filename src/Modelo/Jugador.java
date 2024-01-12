package Modelo;

public class Jugador implements IJugador {
    int cantidadFichas;
    int id;

    public Jugador(){
        cantidadFichas = 0;
    }
    @Override
    public int GetFichas() {
        return cantidadFichas;
    }

    @Override
    public int Getid() {
        return id;
    }

    @Override
    public void SetFichas(int fichas) {
        this.cantidadFichas = fichas;
    }

    @Override
    public void SetId(int id) {
        this.id = id;
    }
}
