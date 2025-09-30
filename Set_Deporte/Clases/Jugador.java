package Clases;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
    private int id;
    private String nombre;
   
    //Constructor
    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id; 
    }

    @Override
    public String toString() {
        return "Jugador {id: " + id + 
        ", nombre: " + nombre + "}";
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
}
