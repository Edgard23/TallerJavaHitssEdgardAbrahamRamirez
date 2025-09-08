package Interfaces.Impl;

import Interfaces.Producto;

public class implProducto implements Producto{
    protected int precio;
    protected double precioVenta;

    public implProducto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public double getPrecioVenta() {
        return precioVenta;
    }
    
}
