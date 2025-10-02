package Clases;

import Enum.TipoCliente;

public class Cliente {
    private int idCliente;
    private static int contadorCliente = 1;
    private String nombre;
    private TipoCliente tipo;
    
    //Constructor
    public Cliente(String nombre, TipoCliente tipo) {
        this.idCliente = contadorCliente++;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
}
