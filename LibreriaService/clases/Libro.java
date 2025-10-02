package clases;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private double precio;
    public Libro(String titulo, String autor ,int ano, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }
    public double getPrecio() {
        return precio;
    }

    
}
