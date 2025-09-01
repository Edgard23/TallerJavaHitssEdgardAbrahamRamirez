package Enums;

public enum MetodoPago {
    CASH("Efectivo"),
    CARD("Tarjeta de crédito/débito"),
    TRANSFER("Transferencia bancaria");

    private final String metodo;

    MetodoPago(String metodo){
        this.metodo = metodo;
    }

    public String getMetodo() {
        return metodo;
    }

}
