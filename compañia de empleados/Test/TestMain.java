package Test;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", "Pérez", "PEJU1242", "Av. Insurgentes Sur 242", 10000, 
        0.1);
        Gerente g = new Gerente("Edgard", "Gil", "RAGE020103", "Calle Japon #61", 15000,
        0.2, 30000);
        Cliente c = new Cliente("José", "Rivero", "RISJ011286", "La Noria, Xochimilco");
        System.out.println("Empleado");
        e1.aplicarRemuneracion();
        System.out.println(e1);
        System.out.println("Gerente: ");
        g.aplicarRemuneracion();
        System.out.println(g);
        System.out.println("Cliente:");
        System.out.println(c);


        
    }
}
