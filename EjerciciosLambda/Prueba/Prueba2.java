package Prueba;

import java.util.HashMap;
import java.util.Map;

import interfaces.ContadorPalabra;

public class Prueba2 {
    public static void main(String[] args) {
        ContadorPalabra masRepetida = (frase) -> {
            String[] palabras = frase.toLowerCase().split(" ");
            Map<String, Integer> conteo = new HashMap<>();

            for (String p : palabras) {
                if (conteo.containsKey(p)) {
                    conteo.put(p, conteo.get(p) + 1);
                } else{
                    conteo.put(p, 1);
                }
            }

            String masRep = "";
            int max = 0;
            for (String p : conteo.keySet()) {
                if (conteo.get(p) > max) {
                    masRep = p;
                    max = conteo.get(p);
                }
            }

            Map<String, Integer> resultado = new HashMap<>();
            resultado.put(masRep, max);
            return resultado;
        };

        Map<String, Integer> resultado = masRepetida.palabraMasRepetida("Hola mundo mundo mundo de caramelo");
        System.out.println(resultado);
    }
}
