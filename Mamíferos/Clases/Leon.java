package Clases;

public class Leon extends Felinos{
    private int numManada;
    private double potenciaRugidoDecibel;
    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras,
            int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }
    @Override
    public String comer() {
        return "El león caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }
    @Override
    public String comunicarse() {
        return "El león ruge para comunicarse";
    }
    @Override
    public String correr() {
        return "El león corre a una velocidad de " + velocidad + " km/h";
    }
    @Override
    public String dormir() {
        return "El león duerme una media de 15 a 20 horas al día";
    }
    @Override
    public String toString() {
        return "{Leon: número de integrantes de su manada: " + numManada + 
        ", Hábitat: " + habitat + 
        ", Tamaño de sus garras: " + tamanoGarras
                + " cm, Potencia de su rugido: " + potenciaRugidoDecibel + 
                " dB, Altura: " + altura + 
                " cm, Velocidad: " + velocidad + 
                " km/h, Largo: " + largo + 
                " m, Peso: " + peso + 
                " kg, Nombre Cientifico: " + nombreCientifico + "}";
    }

    
    
    
}
