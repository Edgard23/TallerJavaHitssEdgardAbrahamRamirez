package entidades;

import genericos.identificable;

public class Cliente implements identificable<String>{
    private String id, nombre;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getID() {
        return id;
    }



    public String getNombre() {
        return nombre;
    }



    @Override
    public String toString() {
        return "Cliente {id: " + id + ", nombre: " + nombre + "}";
    }
    
}
