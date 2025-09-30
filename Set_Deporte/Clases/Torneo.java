package Clases;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Torneo {
    private Set<Jugador> futbol = new HashSet<>();
    private Set<Jugador> basquetbol = new HashSet<>();
    private Set<Jugador> voleibol = new HashSet<>();

    public void registrarJugador(Set<Jugador> disciplina, Jugador jugador){
        if (disciplina.add(jugador)) {
            System.out.println("Jugador " + jugador + " registrado");
        } else {
            System.out.println("Jugador " + jugador + " ya está inscrito");
        }
    }

    public void mostrarJugador(Set<Jugador> disciplina, String deporte){
        System.out.println("Jugadores en " + deporte + ":");
        for (Jugador jugador : disciplina) {
            System.out.println(jugador);
        }
    }

    public void contarJugadores(){
        System.out.println("\n Cantidad de jugadores: ");
        System.out.println("Fútbol: " + futbol.size());
        System.out.println("Básquetbol: " + basquetbol.size());
        System.out.println("Vóleibol: " + voleibol.size());
    }

    public void fusionarEquipos(){
        Set<Jugador> unir = new HashSet<>(futbol);
        unir.addAll(basquetbol);
        for (Jugador jugador : unir) {
            System.out.println("\n Fusión fútbol + básquetbol:");
            System.out.println(jugador);
        }
    }

    public void jugadoresComunes(){
        Set<Jugador> comunes = new HashSet<>(futbol);
        comunes.retainAll(basquetbol);
        System.out.println("Jugadores en fútbol y básquetbol: ");
        for (Jugador jugador : comunes) {
            System.out.println(jugador);
        }
    }

    public void transferirJugador(Jugador jugador){
        if (basquetbol.remove(jugador)) {
            futbol.add(jugador);
            System.out.println("Jugador transferido de fútbol a básquetbol: " + jugador);
        } else{
            System.out.println("El jugador no estaba en básquetbol");
        }
    }

    public void ordenPorNombre(){
        Set<Jugador> nombres = new TreeSet<>();
        nombres.addAll(futbol);
        nombres.addAll(basquetbol);
        nombres.addAll(voleibol);
        System.out.println("Jugadores ordenados alfabéticamente: ");
        for (Jugador jugador : nombres) {
            System.out.println(jugador);
        }
    }

    public void rankingId(){
        Set<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        ranking.addAll(futbol);
        ranking.addAll(basquetbol);
        ranking.addAll(voleibol);
        System.out.println("\n Ranking de jugadores por ID: ");
        for (Jugador jugador : ranking) {
            System.out.println(jugador);
        }
    }

    public Set<Jugador> getFutbol() {
        return futbol;
    }

    public Set<Jugador> getBasquetbol() {
        return basquetbol;
    }

    public Set<Jugador> getVoleibol() {
        return voleibol;
    }

    
}
