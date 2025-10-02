package Clases;

public class Empleado {
    private int id;
    private static int contadorEmpleado = 1;
    private String nombre;
    private String puesto;
   
    //Constructor
    public Empleado(String nombre, String puesto) {
        this.id = contadorEmpleado++;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    
}
