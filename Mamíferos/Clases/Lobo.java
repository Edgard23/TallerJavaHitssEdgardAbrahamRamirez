package Clases;

public class Lobo extends Caninos{
    private int numCamada;
    private String especieLobo;
    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color,
            double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }
    @Override
    public String comer() {
        return "El lobo es un mamífero primoridialmente carnívoro";
    }
    @Override
    public String comunicarse() {
        return "El lobo se comunica a través de aullidos";
    }
    @Override
    public String correr() {
        return "El lobo alcanza una velocidad de hasta 60 km/h";
    }
    @Override
    public String dormir() {
        return "El lobo duerme aproximadamente entre 6 a 8 horas al día";
    }
    
    @Override
    public String toString() {
        return "{Lobo: Número de camada: " + numCamada + 
        ", Hábitat: " + habitat + 
        ", Color: " + color + 
        ", Especie de Lobo: " + especieLobo + 
        ", Altura: " + altura + 
        " cm, Tamaño de los colmillos: " + tamanoColmillos + 
        " cm, Largo: " + largo + 
        " cm, Peso: " + peso + 
        " kg, Nombre Científico: " + nombreCientifico + "]";
    }
    
    
}
