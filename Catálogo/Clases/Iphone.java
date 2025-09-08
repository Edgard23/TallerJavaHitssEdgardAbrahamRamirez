package Clases;

import Interfaces.Impl.implElectronico;

public class Iphone extends implElectronico{
    private String modelo;
    private String color;
    public double precioVenta;
    public double getPrecioVenta() {
        return precioVenta;
    }
    public Iphone(int precio, String fabricante, String modelo, String color, double precioVenta) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
        this.precioVenta = precioVenta;
    }
    @Override
    public String toString() {
        return "{Iphone | Precio: $" + precio + 
        ", Modelo: " + modelo + 
        ", Color: " + color + 
        ", Precio de venta: $" + precioVenta + "}";
    }

    

}
