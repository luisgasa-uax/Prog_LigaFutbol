package LigaFutbol.Controlador;


import LigaFutbol.Modelo.Fichaje;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Fichaje> fichajes;

    public Equipo() {
        this.fichajes = new ArrayList();
    }

    public String listarFichajes(){
        StringBuilder resultado = new StringBuilder();
        for (Fichaje fichaje : fichajes){
            resultado.append(fichaje.toString());
        }
        return resultado.toString();
    }

    // alta fichaje
    public boolean darFichajeDeAlta(Fichaje fichaje){
        boolean resultado;
        if (buscarFichajePorId(fichaje.getId()) != null){
            resultado = true;
            fichajes.add(fichaje);
        } else {
            resultado = false;
        }
        return resultado;
    }

    // baja fichaje por id
    public boolean darFichajeDeBajaPorId(int id){
        boolean resultado;
        Fichaje fichajeAQuitar;

        fichajeAQuitar = buscarFichajePorId(id);
        if (fichajeAQuitar != null){
            resultado = true;
            fichajes.remove(fichajeAQuitar);
        }
        else {
            resultado = false;
        }
        return resultado;
    }

    // baja fichaje por nombre
    public boolean darFichajeDeBajaPorNombre(String nombre){
        boolean resultado;
        Fichaje fichajeAQuitar;

        fichajeAQuitar = buscarFichajePorNombre(nombre);
        if (fichajeAQuitar != null){
            resultado = true;
            fichajes.remove(fichajeAQuitar);
        }
        else {
            resultado = false;
        }
        return resultado;
    }

    // modificar fichaje por id
    public boolean modificarFichajePorId(int id, int nuevoPrecio){
        boolean resultado;
        Fichaje fichajeAModificar;

        fichajeAModificar = buscarFichajePorId(id);
        if (fichajeAModificar != null){
            fichajeAModificar.setPrecio(nuevoPrecio);
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    // modificar fichaje por nombre


    // buscar fichaje por id
    public Fichaje buscarFichajePorId(int id){
        Fichaje resultado = null;

        for (Fichaje fichaje: fichajes){
            if (fichaje != null && fichaje.getId() == id){
                resultado =  fichaje;
            }
        }
        return resultado;
    }

    // buscar fichaje por nombre
    public Fichaje buscarFichajePorNombre(String nombre){
        Fichaje resultado = null;

        for (Fichaje fichaje: fichajes){
            if (fichaje.getNombre() != null && fichaje.getNombre().equals(nombre)){
                resultado =  fichaje;
            }
        }
        return resultado;
    }


}
