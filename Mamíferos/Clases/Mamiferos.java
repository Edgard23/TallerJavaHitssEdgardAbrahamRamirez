package Clases;

public abstract class Mamiferos {
    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;
    public Mamiferos(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }
    public String getHabitat() {
        return habitat;
    }
    public double getAltura() {
        return altura;
    }
    public double getLargo() {
        return largo;
    }
    public double getPeso() {
        return peso;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    //Métodos abstractos
    //Comer
    public abstract String comer();
    //Dormir
    public abstract String dormir();
    //Correr
    public abstract String correr();
    //Comunicarse
    public abstract String comunicarse();
    
}
