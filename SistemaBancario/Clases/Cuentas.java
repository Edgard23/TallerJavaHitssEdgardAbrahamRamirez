package Clases;

public class Cuentas {
    private static int contadorCuenta = 1; //Generador de IDs automáticos, inicializado en 1
    private int idCuenta;
    private String titular;
    private double saldo;
    
    //Constructor
    public Cuentas(String titular, double depositoInicial) {
        this.idCuenta = contadorCuenta++;
        this.titular = titular;
        this.saldo = depositoInicial;
    }

    //Getters
    public int getIdCuenta() {
        return idCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //Método depósito
    public void depositar(double cantidad){
        this.saldo += cantidad;
    }

    //Método
    public boolean retirar(double cantidad){
        if (cantidad <= saldo) {
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "{ID: " + idCuenta + 
        ", titular: " + titular + 
        ", saldo: $ " + saldo + "}";
    }
    
}
