package Clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelos implements Comparable<Vuelos>{
    private String nombre, origen, destino;
    private LocalDate fecha;
    private LocalTime hora;
    private int pasajeros;
    public Vuelos(String nombre, String origen, String destino, LocalDate fecha, LocalTime hora, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.pasajeros = pasajeros;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public int compareTo(Vuelos otro) {
        
        int comparacionFecha = this.fecha.compareTo(otro.fecha);
        if (comparacionFecha != 0) {
            return comparacionFecha;
        }
        return this.hora.compareTo(otro.hora);
    }

    @Override
    public String toString() {
        return "Vuelo {nombre: " + nombre + 
        ", origen: " + origen + 
        ", destino: " + destino + 
        ", fecha de llegada: " + fecha + 
        ", hora de llegada: " + hora + 
        ", pasajeros: " + pasajeros + "}";
    }

    


    
}
