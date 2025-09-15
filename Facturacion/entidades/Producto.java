package entidades;

import genericos.identificable;

public class Producto implements identificable<Integer>{
    private Integer id;
    private String descripcion;
    private double precio;
    
    public Producto(Integer id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public Integer getID() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto {id: " + id + ", descripcion: " + descripcion + 
                ", precio: " + precio + "}";
    }
    
}
