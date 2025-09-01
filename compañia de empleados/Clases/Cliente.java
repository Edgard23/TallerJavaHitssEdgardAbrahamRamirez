package Clases;

public class Cliente extends Persona{
    private int clienteId;
    private static int contadorCliente;
    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++contadorCliente;
    }
    @Override
    public String toString() {
        return "{Nombre del cliente: " + nombre + 
        ", Apellido: " + apellido +
        ", Id de cliente: " + clienteId +
        ", Número Fiscal: " + numeroFiscal + 
        ", Direccion: " + direccion + "}";
    }
    
    
}
