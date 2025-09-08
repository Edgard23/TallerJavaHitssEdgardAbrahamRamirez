package Clases;

import Excepciones.EdadInvalidaException;

public class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) throws IllegalArgumentException, EdadInvalidaException{
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");            
        }
        if (edad < 18) { 
            throw new EdadInvalidaException("La edad mínima es de 18 años");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{Nombre del alumno: " + nombre + 
        ", edad: " + edad + "}";
    }
    
    
}
