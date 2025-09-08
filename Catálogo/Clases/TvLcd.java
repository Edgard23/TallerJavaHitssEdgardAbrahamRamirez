package Clases;

import Interfaces.Impl.implElectronico;

public class TvLcd extends implElectronico{
    private int pulgada;
    private double precioVenta;
    

    public double getPrecioVenta() {
        return precioVenta;
    }


    public TvLcd(int precio, String fabricante, int pulgada, double precioVenta) {
        super(precio, fabricante);
        this.pulgada = pulgada;
        this.precioVenta = precioVenta;
    }


    @Override
    public String toString() {
        return "{TV LCD | Precio: $ " + precio + 
        ", Fabricante: " + fabricante + 
        ", Pulgadas: " + pulgada + 
        ", Precio venta: " + precioVenta + "}";
    }
    
    
}
