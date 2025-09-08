package Interfaces;

import java.time.LocalDate;

public interface Libro {
    public LocalDate getFechaPublicacion();
    public String getAutor();
    public String getTitulo();
    public String getEditorial();
}
