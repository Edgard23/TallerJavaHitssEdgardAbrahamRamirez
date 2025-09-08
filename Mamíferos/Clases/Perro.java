package Clases;

public class Perro extends Caninos{
    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color,
            double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "La dieta de un perro es omnívora";
    }

    @Override
    public String comunicarse() {
        return "El perro se comunica a través de ladridos y aullidos";
    }

    @Override
    public String correr() {
        return "La velocidad de un perro varía según la raza, pero en promedio, el perro alcanza velocidades de hasta 72 km/h para algunas razas";
    }

    @Override
    public String dormir() {
        return "El perro duerme en promedio de 12 a 14 horas";
    }

    @Override
    public String toString() {
        return "{Perro: Fuerza de la mordida: " + fuerzaMordida + 
        " N, Hábitat: " + habitat + 
        ", Color: " + color + 
        ", Altura: " + altura + 
        " cm, Tamaño de los colmillos: " + tamanoColmillos + 
        ", Largo: " + largo + 
        " cm, Peso: " + peso + 
        " kg, Nombre Científico: " + nombreCientifico + "}";
    }
    
    
}
