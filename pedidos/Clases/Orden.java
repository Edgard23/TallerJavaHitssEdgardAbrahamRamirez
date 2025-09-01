package Clases;

import Enums.Estatus;
import Enums.MetodoPago;
import Enums.Prioridad;

public class Orden {
    private static int contador = 1;
    private int id;
    private String customer;
    private Estatus estatus;
    private Prioridad nivel;
    private MetodoPago metodo;
    
    //Generar el constructor
    public Orden(int id, String customer, Estatus estatus, Prioridad nivel, MetodoPago metodo) {
        this.id = contador++;
        this.customer = customer;
        this.estatus = estatus;
        this.nivel = nivel;
        this.metodo = metodo;
    }

    //Método show details
    public void showDetails(){
        System.out.println("Pedido # " + id);
        System.out.println("Cliente: " + customer);
        System.out.println("Estatus del pedido: " + estatus + " -> " + estatus.getMensaje());
        System.out.println("Nivel de prioridad: " + nivel + " (" + nivel.getPrioridad() + ")");
        System.out.println("Método de pago: " + metodo + " -> " + metodo.getMetodo());
    }
}
