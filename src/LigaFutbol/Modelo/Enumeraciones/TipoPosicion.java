package LigaFutbol.Modelo.Enumeraciones;

public enum TipoPosicion {

    Portero(1, "Guardameta"),
    Defensa(2, "Central"),
    Mediocampo(3, "Centrocampista"),
    Delantero(4, "Pichichi");

    private int valor;
    private String descripcion;
    /*
    EI(1, "Extremo izquierdo"),
    ED(2, "Extremo derecho"),
    DC(3, "Delantero centro"),
            MCO;
    */

    private TipoPosicion(int valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

    @Override
    public String toString() {
    StringBuilder sb= new StringBuilder();
    sb.append(String.format("Valor: %d, Descripcion: %s", valor, descripcion));

    return sb.toString();
    }
