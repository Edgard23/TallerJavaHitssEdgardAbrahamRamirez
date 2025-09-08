package Clases;

public abstract class Felinos extends Mamiferos{
    protected double tamanoGarras;
    protected int velocidad;
    public Felinos(String habitat, double altura, double largo, double peso, String nombreCientifico,
            double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    
    public double getTamanoGarras() {
        return tamanoGarras;
    }


    public int getVelocidad() {
        return velocidad;
    }


    
    
}
