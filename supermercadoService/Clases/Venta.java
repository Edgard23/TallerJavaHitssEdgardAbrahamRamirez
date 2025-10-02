package Clases;

import java.util.List;

public class Venta {
    private int idVenta;
    private static int contadorVenta = 1;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> productos;
    private double total;
    
    //Constructor
    public Venta(Cliente cliente, Empleado empleado, List<Producto> productos) {
        this.idVenta = contadorVenta++;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.total = 0;
    }

    //Getters
    public int getIdVenta() {
        return idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


}
