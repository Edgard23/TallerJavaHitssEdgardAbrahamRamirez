package Test;

import Clases.Guepardo;
import Clases.Leon;
import Clases.Lobo;
import Clases.Mamiferos;
import Clases.Perro;
import Clases.Tigre;

public class TestMain {
    public static void main(String[] args) {
        Mamiferos leon = new Leon("Sabana", 181.5, 200.1, 190, "Panthera leo",
         0.38, 60, 20, 114);
        System.out.println(leon);
        System.out.println(leon.comer());
        Mamiferos guepardo = new Guepardo("Sabana africana", 85, 150, 60, "Acinonyx jubatus"
        , 0.2, 130);
        System.out.println(guepardo);
        System.out.println(guepardo.comunicarse());
        Mamiferos lobo = new Lobo("Bosque", 85, 110, 60, "Canis lupus",
         "Blanco", 5, 6, "Lobo blanco");
         System.out.println(lobo);
         System.out.println(lobo.comunicarse());
         Mamiferos tigre = new Tigre("Jungla", 100, 206, 200, "Panthera tigris",
        10, 50, "Tigre siberiano");
        System.out.println(tigre);
        System.out.println(tigre.comer());
        Mamiferos perro = new Perro("Casa", 120, 170, 50, "Canis lupus familiaris",
        "Marrón", 4, 256);
        System.out.println(perro);
        System.out.println(perro.dormir());
    }
}
