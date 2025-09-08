package Interfaces.Impl;

import Interfaces.Electronico;

public class implElectronico extends implProducto implements Electronico{
    protected String fabricante;

    public String getFabricante() {
        return fabricante;
    }

    public implElectronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }
    
    
}
