package Clases;

public class Producto {
    private int idProducto;
    private static int contador = 1;
    private String nombre;
    private double precio;
    private int stock;

    //Constructor
    public Producto(String nombre, double precio, int stock) {
        this.idProducto = contador++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto {Producto #" + idProducto +
        ", Nombre: " + nombre + 
        ", precio: $" + precio + 
        ", stock: " + stock + "}";
    }

    
}
