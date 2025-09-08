package Clases;

public class Guepardo extends Felinos{

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico,
            double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo caza de día y utiliza su vista para detectar a sus presas";
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica a través de chirridos, ronroneos y gruñidos";
    }

    @Override
    public String correr() {
        return "El guepardo es el animal terrestre más veloz, alcanzando una velocidad de hasta 130 km/h";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme aproximadamente 12 horas al día";
    }
    @Override
    public String toString() {
        return "{Guepardo: " + ", Hábitat: " + habitat + 
        ", Tamaño de sus garras: " + tamanoGarras + 
        " cm, Altura: " + altura + 
        " cm, Velocidad: " + velocidad + 
        " km/h, Largo: " + largo + 
        " cm, Peso: " + peso + 
        " kg, Nombre Científico: " + nombreCientifico + "}";

    
    }
    
}
