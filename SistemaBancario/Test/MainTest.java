package Test;

import Clases.Banco;
import Clases.Cuentas;
import Clases.Transacciones;

public class MainTest {
    public static void main(String[] args) {
        //Crear cuentas
        Cuentas ana = new Cuentas("Ana", 10000);
        Cuentas luis = new Cuentas("Luis", 2500);
        Cuentas edgard = new Cuentas("Edgard", 4000);

        //Operaciones
        ana.depositar(1000);
        Transacciones t1 = new Transacciones("Depósito", 1000, ana);
        ana.retirar(3500);
        Transacciones t2 = new Transacciones("Retiro", 3500, ana);
        Transacciones t3 = null;
       if (luis.retirar(3500)) {
        t3 = new Transacciones("Retiro", 3500, luis);
        } else {
        System.out.println("Error: saldo insuficiente en la cuenta de " + luis.getTitular());
        }
        edgard.depositar(1500);
        Transacciones t4 = new Transacciones("Depósito", 1500, edgard);

        //Mostrar cuentas
        Banco banco = new Banco();
        banco.mostrarCuenta(ana);
        banco.mostrarCuenta(luis);
        banco.mostrarCuenta(edgard);

        //Mostrar transacciones
        banco.mostrarTransaccion(t1);
        banco.mostrarTransaccion(t2);
        if (t3 != null) {
            banco.mostrarTransaccion(t3);
        }
        banco.mostrarTransaccion(t4);

    }
}
