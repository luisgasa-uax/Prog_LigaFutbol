package LigaFutbol.Modelo;

public class Entrenador {
    private String tipo;

    public Entrenador(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("TIPO = %s", tipo));

        return toString();
    }
}
