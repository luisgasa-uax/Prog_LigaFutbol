package LigaFutbol.Modelo;

import LigaFutbol.Modelo.Enumeraciones.TipoEntrenador;

public class Entrenador extends Fichaje{
    private TipoEntrenador tipoEntrenador;

    public Entrenador(int id, String nombre, int precio,TipoEntrenador tipoEntrenador) {
        super(id,nombre,precio);

        this.tipoEntrenador = tipoEntrenador;
    }

    public TipoEntrenador getTipo() {
        return tipoEntrenador;
    }

    public void setTipo(TipoEntrenador tipo) {
        this.tipoEntrenador = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("TIPO = %s", tipoEntrenador));

        return toString();
    }
}
