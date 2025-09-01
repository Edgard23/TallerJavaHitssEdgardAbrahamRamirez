package Clases;

public class Transacciones {
    private static int contadorTransaccion = 1; //Generador de ID automático para cada transacción
    private int idTransaccion;
    private String tipoTransaccion;
    private double  monto;
    private Cuentas cuentaAsociada;
    
    //Constructor
    public Transacciones(String tipoTransaccion, double monto, Cuentas cuentaAsociada) {
        this.idTransaccion = contadorTransaccion++;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
        this.cuentaAsociada = cuentaAsociada;
    }


    @Override
    public String toString() {
        return "{idTransaccion: " + idTransaccion + 
        ", tipo de Transaccion: " + tipoTransaccion + 
        ", monto: "+ monto + 
        ", cuenta ID: " + cuentaAsociada.getIdCuenta() + 
        ", Titular: " + cuentaAsociada.getTitular() + "}";
    }


    
}
