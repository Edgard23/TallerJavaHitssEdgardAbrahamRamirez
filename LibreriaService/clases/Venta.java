package clases;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;
    public Venta(Cliente cliente, Libro libro, LocalDate fecha) {
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Libro getLibro() {
        return libro;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    
}
