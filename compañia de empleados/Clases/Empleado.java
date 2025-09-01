package Clases;

public class Empleado extends Persona{
    protected double remuneracion;
    protected int empleadoId;
    private static int contador;
    protected double porcentajeRemunaracion;
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,
             double porcentajeRemunaracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++contador;
        this.porcentajeRemunaracion = porcentajeRemunaracion;
    }
    
        public void aplicarRemuneracion(){
            remuneracion += remuneracion*porcentajeRemunaracion;
        }
    @Override
    public String toString() {
        return "{Nombre del empleado: " + nombre + 
        ", Apellido: " + apellido +
        ", Remuneración: " + remuneracion + 
        ", Id del empleado: " + empleadoId + 
        ", Número Fiscal: " + numeroFiscal + 
        ", Dirección: " + direccion + 
        ", Porcentaje de Remunaración: " + (porcentajeRemunaracion*100) + "%}";
    }
    
    
}
