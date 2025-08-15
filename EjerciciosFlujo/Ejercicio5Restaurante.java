package ciclos;

import java.util.Scanner;

public class Ejercicio5Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        double precio, ventas = 0;

        do {
            //Desplegar el menú
            System.out.println("¿Qué deseas hacer? Ingresa la opción deseada");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Ver el total de ventas");
            System.out.println("3. Salir del sistema");

            //El usuario ingresa la entrada
            i = sc.nextInt();

            //Ingreso del ciclo switch para controlar el flujo
            switch (i) {
                case 1 -> {
                    do {
                        System.out.println("Por favor, ingresa el precio del pedido");
                        precio = sc.nextDouble();
                        if (precio <=0){
                            System.out.println("Por favor, ingresa un precio válido. ");
                        }
                    } while (precio <= 0);
                    ventas += precio;
                    System.out.println("Pedido registrado con éxito. ");
                }
                case 2 -> {
                    System.out.println("El total de ventas es de " + ventas + " pesos mexicanos");
                }
                case 3 -> System.out.println("Hasta pronto.");
                default -> System.out.println("Ingresa una opción válida");
            }
        } while (i != 3);

        sc.close();
    }
}
