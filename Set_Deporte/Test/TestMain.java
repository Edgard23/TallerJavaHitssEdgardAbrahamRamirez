package Test;

import java.util.Scanner;

import Clases.Jugador;
import Clases.Torneo;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Torneo torneo = new Torneo();

        //Registro de jugadores
        torneo.registrarJugador(torneo.getFutbol(), new Jugador(1, "Edgard"));
        torneo.registrarJugador(torneo.getBasquetbol(), new Jugador(2, "Santiago"));
        torneo.registrarJugador(torneo.getVoleibol(), new Jugador(3, "Chris"));
        torneo.registrarJugador(torneo.getFutbol(), new Jugador(2, "Santiago"));
        torneo.registrarJugador(torneo.getBasquetbol(), new Jugador(5, "Julián"));
        torneo.registrarJugador(torneo.getVoleibol(), new Jugador(6, "Leo"));

        int opcion;
        do {
            System.out.println("\n ------ MENÚ -----");
            System.out.println("1. Mostrar jugadores por deporte");
            System.out.println("2. Contar jugadores en cada disciplina");
            System.out.println("3. Fusionar equipos (Básquetbol + Fútbol)");
            System.out.println("4. Ver jugadores en común");
            System.out.println("5. Transferir un jugador de básquetbol a fútbol");
            System.out.println("6. Mostrar jugadores ordenados por nombre");
            System.out.println("7. Mostrar ranking de jugadores por ID");
            System.out.println("8. Salir");
            System.out.println("Ingresa la opción deseada: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    torneo.mostrarJugador(torneo.getFutbol(), "Fútbol");
                    torneo.mostrarJugador(torneo.getBasquetbol(), "Básquetbol");
                    torneo.mostrarJugador(torneo.getVoleibol(), "Vóleibol");
                }
                case 2 -> torneo.contarJugadores();
                case 3 -> torneo.fusionarEquipos();
                case 4 -> torneo.jugadoresComunes();
                case 5 -> torneo.transferirJugador(new Jugador(2, "Julián"));
                case 6 -> torneo.ordenPorNombre();
                case 7 -> torneo.rankingId();
                case 8 -> {
                    System.out.println("Fin del programa");
                    return;
            }
                default -> System.out.println("Opción no válida, prueba de nuevo.");
            }
        } 
        while (opcion != 8);
            sc.close();
}
}