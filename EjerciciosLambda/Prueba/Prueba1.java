package Prueba;

import interfaces.Transformador;

public class Prueba1 {
    public static void main(String[] args) {
        Transformador<String, String> eliminarTodo = e -> e.replaceAll("[ ,.]", "").toUpperCase();
        System.out.println(eliminarTodo.transformar("Hola, mi nombre es Edgard Gil. Es un gusto conocerlos."));
    }   
}
