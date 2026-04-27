package LigaFutbol.Modelo;

import LigaFutbol.Modelo.Enumeraciones.TipoPosicion;

public class Jugador extends Fichaje {
    private int dorsal;
    private TipoPosicion posicion;

    public Jugador(int id,String nombre, int precio, int dorsal, TipoPosicion posicion) {
        super(id,nombre,precio);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public TipoPosicion getPosicion() {
        return posicion;
    }

    public void setPosicion(TipoPosicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString(){
        String resultado;
        resultado = String.format("%s - [%d] Posición; %s",super.toString(),dorsal,posicion);
        return resultado;
    }

}
