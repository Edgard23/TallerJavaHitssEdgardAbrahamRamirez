package Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Clases.Vuelos;

public class TestMain {
    public static void main(String[] args) {
        List<Vuelos> vuelos = new ArrayList<>();
        vuelos.add(new Vuelos("AAL 933", "New York", "Santiago", LocalDate.of(2021, 8, 29),
        LocalTime.of(05, 39), 62));
        vuelos.add(new Vuelos("LAT 755", "Sao Paulo", "Santiago", LocalDate.of(2021, 8, 31),
        LocalTime.of(04, 45), 47));
        vuelos.add(new Vuelos("SKU 621", "Rio de Janeiro", "Santiago", LocalDate.of(2021, 8, 30),
        LocalTime.of(16, 00), 52));
        vuelos.add(new Vuelos("DAL 147", "Atlanta", "Santiago", LocalDate.of(2021, 8, 29),
        LocalTime.of(13, 22), 59));
        vuelos.add(new Vuelos("AVA 241", "Bogotá", "Santiago", LocalDate.of(2021, 8, 31),
        LocalTime.of(14, 05), 25));
        vuelos.add(new Vuelos("AMX 10", "CDMX", "Santiago", LocalDate.of(2021, 8, 31),
        LocalTime.of(05, 20), 29));
        vuelos.add(new Vuelos("IBE 6833", "Londres", "Santiago", LocalDate.of(2021, 8, 30),
        LocalTime.of(8, 45), 55));
        vuelos.add(new Vuelos("LAT 2479", "Frankfurt", "Santiago", LocalDate.of(2021, 8, 29),
        LocalTime.of(07, 41), 51));
        vuelos.add(new Vuelos("SKU 803", "Lima", "Santiago", LocalDate.of(2021, 8, 30),
        LocalTime.of(10, 35), 48));
        vuelos.add(new Vuelos("LAT 533", "Los Ángeles", "Santiago", LocalDate.of(2021, 8, 29),
        LocalTime.of(9, 14), 59));
        vuelos.add(new Vuelos("LAT 1447", "Guayaquil", "Santiago", LocalDate.of(2021, 8, 31),
        LocalTime.of(8, 33), 31));
        vuelos.add(new Vuelos("CMP 111", "Ciudad de Panamá", "Santiago", LocalDate.of(2021, 8, 31),
        LocalTime.of(15, 15), 29));
        vuelos.add(new Vuelos("LAT 705", "Madrid", "Santiago", LocalDate.of(2021, 8, 30),
        LocalTime.of(8, 14), 47));
        vuelos.add(new Vuelos("AAL 957", "Miami", "Santiago", LocalDate.of(2021, 8, 29),
        LocalTime.of(22, 53), 60));
        vuelos.add(new Vuelos("ARG 5091", "Buenos Aires", "Santiago", LocalDate.of(2021, 8, 31),
        LocalTime.of(9, 57), 32));
        vuelos.add(new Vuelos("LAT 1283", "Cancún", "Santiago", LocalDate.of(2021, 8, 31),
        LocalTime.of(04, 00), 35));
        vuelos.add(new Vuelos("LAT 579", "Barcelona", "Santiago", LocalDate.of(2021, 8, 29),
        LocalTime.of(07, 45), 61));
        vuelos.add(new Vuelos("AAL 945", "Dallas-Forth Worth", "Santiago", LocalDate.of(2021, 8, 30),
        LocalTime.of(07, 12), 58));
        vuelos.add(new Vuelos("LAT 501", "París", "Santiago", LocalDate.of(2021, 8, 29),
        LocalTime.of(18, 29), 49));
        vuelos.add(new Vuelos("LAT 405", "Montevideo", "Santiago", LocalDate.of(2021, 8, 30),
        LocalTime.of(15, 45), 39));

        Collections.sort(vuelos);
        System.out.println("=========== Lista de vuelos ordenada de forma ascendente ===========");
        for (Vuelos vuelo : vuelos) {
        System.out.println(vuelo);
        }

        //Último vuelo en llegar
        Vuelos ultimoVuelo = vuelos.get(vuelos.size()-1);
        System.out.println("\n Último vuelo en llegar: " + ultimoVuelo);

        //Vuelo con menor número de pasajeros
        Vuelos menosPasajeros = Collections.min(vuelos, Comparator.comparingInt(Vuelos::getPasajeros));
        System.out.println("\n Vuelo con menor número de pasajeros: " + menosPasajeros);
    }
}
