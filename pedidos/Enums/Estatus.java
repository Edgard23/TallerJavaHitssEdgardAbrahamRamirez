package Enums;

public enum Estatus {
    NEW("Pedido creado"),
    PROCESSING("Pedido en proceso"),
    SHIPPED("Pedido enviado"),
    DELIVERED("Pedido entregado"),
    CANCELLED("Pedido cancelado");

    private final String mensaje;

    Estatus(String mensaje){
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
