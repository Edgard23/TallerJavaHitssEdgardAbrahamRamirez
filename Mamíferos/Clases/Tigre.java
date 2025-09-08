package Clases;

public class Tigre extends Felinos{
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras,
            int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre caza solo y acecha a sus presas";
    }

    @Override
    public String comunicarse() {
        return "El tigre se comunica con sus rugidos, percibibles a 3km de distancia";
    }

    @Override
    public String correr() {
        return "El tigre corre a una velocidad de 60 km/h";
    }

    @Override
    public String dormir() {
        return "El tigre duerme en promedio de 16 a 18 horas al día";
    }

    @Override
    public String toString() {
        return "{Tigre: Especie de tigre: " + especieTigre + 
        ", Hábitat: " + habitat + 
        ", Tamaño de sus garras: " + tamanoGarras + 
        " cm, Altura: " + altura + 
        " cm, Velocidad: " + velocidad + 
        " km/h, Largo: " + largo + 
        " cm, Peso: " + peso + 
        " kg, Nombre Científico: " + nombreCientifico + "}";
    }
    
    
    
}
