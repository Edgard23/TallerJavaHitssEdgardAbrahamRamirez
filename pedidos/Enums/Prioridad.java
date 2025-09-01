package Enums;

public enum Prioridad {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int prioridad;

    Prioridad(int prioridad){
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}

