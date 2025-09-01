package Main;

import Clases.Orden;
import Enums.Estatus;
import Enums.MetodoPago;
import Enums.Prioridad;

public class TestMain {
    public static void main(String[] args) {
        Orden o1 = new Orden(1, "Edgard", Estatus.NEW, Prioridad.HIGH, MetodoPago.CARD);
        Orden o2 = new Orden(2, "Ana", Estatus.DELIVERED, Prioridad.MEDIUM, MetodoPago.CASH);
        Orden o3 = new Orden(3, "Juan", Estatus.SHIPPED, Prioridad.LOW, MetodoPago.TRANSFER);

        o1.showDetails();
        System.out.println("---------------------------------------------------------");
        o2.showDetails();
        System.out.println("---------------------------------------------------------");
        o3.showDetails();
    }
}
