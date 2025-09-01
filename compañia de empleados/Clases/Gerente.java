package Clases;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,
            double porcentajeRemunaracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, porcentajeRemunaracion);
        this.presupuesto = presupuesto;
    }

    @Override
    public void aplicarRemuneracion() {
        super.aplicarRemuneracion();
    }

    @Override
    public String toString() {
        return "{Nombre del gerente: " + nombre + 
        ", Apellido: " + apellido + 
        ", Id de empleado: " + empleadoId + 
        ", Número Fiscal: " + numeroFiscal +
        ", Presupuesto: " + presupuesto + 
        ", Remuneración: " + remuneracion +
        ", Dirección: " + direccion + 
        ", Porcentaje de Remunaración: " + (porcentajeRemunaracion*100) + "%}";
    }

    
}
