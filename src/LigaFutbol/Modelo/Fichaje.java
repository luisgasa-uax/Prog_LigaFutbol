package LigaFutbol.Modelo;

public class Fichaje {
    private String nombre;
    private int precio;

    public Fichaje(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString(){
        String resultado;
        resultado = String.format("%s",nombre);
        return resultado;
    }
}
