package Clases;

import java.time.LocalDate;

import Interfaces.Impl.impLibro;

public class Comics extends impLibro{
    private String personaje;

    public String getPersonaje() {
        return personaje;
    }

    public Comics(int precio, LocalDate fechaPublicacion, String autor, String titulo, String editorial,
            double precioVenta, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial, precioVenta);
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "{Comic | Precio: $" + precio + 
        ", Personaje: " + personaje + 
        ", Autor: " + autor + 
        ", Fecha de publicación: " + fechaPublicacion + 
        ", Título: " + titulo + 
        ", Editorial: " + editorial + 
        ", precio de venta: $" + precioVenta + "}";
    }
    
    
}
