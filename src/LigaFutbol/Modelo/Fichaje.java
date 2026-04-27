package LigaFutbol.Modelo;

public class Fichaje {
    private int id;
    private String nombre;
    private int precio;

    public Fichaje(int id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPrecio(){
        return precio;
    }
    public int getId(){
        return id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        String resultado;
        resultado = String.format("%s - Precio: %d",nombre,precio);
        return resultado;
    }

}