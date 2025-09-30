package interfaces;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabra {
    Map<String, Integer> palabraMasRepetida(String frase);
}
