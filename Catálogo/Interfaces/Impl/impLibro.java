package Interfaces.Impl;

import java.time.LocalDate;

import Interfaces.Libro;

public class impLibro extends implProducto implements Libro{
    protected LocalDate fechaPublicacion;
    protected String autor, titulo, editorial;
    protected double precioVenta;
    
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public impLibro(int precio, LocalDate fechaPublicacion, String autor, String titulo, String editorial,
            double precioVenta) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.precioVenta = precioVenta;
    }
    @Override
    public String toString() {
        return "{Libro | Precio: $" + precio +  
        ", Fecha de Publicacion: " + fechaPublicacion + 
        ", Autor: " + autor + 
        ", Título: " + titulo + 
        ", Editorial: " + editorial + 
        ", Precio de Venta: $" + precioVenta + "}";
    }

    
    
}
    
    

