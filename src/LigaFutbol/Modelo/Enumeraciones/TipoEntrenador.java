package LigaFutbol.Modelo.Enumeraciones;

public enum TipoEntrenador {

    primerEntrenador(1, "Mister"),
    segundoEntrenador(2, "Segundo mister");

    private int valor;
    private String descripcion;

    TipoEntrenador(int valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }
        
    @Override
    public String toString() {
    StringBuilder sb= new StringBuilder();
    sb.append(String.format("Valor: %d, Descripcion: %s", valor, descripcion));

    return sb.toString();
    }
}
