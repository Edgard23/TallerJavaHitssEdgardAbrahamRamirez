package clases;

import java.util.List;

public class Empleado {
    private int id;
    private String nombre;
    private String depto;
    private double salario;
    private int aniosExperiencia;
    private List<Evaluacion> evaluaciones;
    public Empleado(int id, String nombre, String depto, double salario, int aniosExperiencia,
            List<Evaluacion> evaluaciones) {
        this.id = id;
        this.nombre = nombre;
        this.depto = depto;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
        this.evaluaciones = evaluaciones;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDepto() {
        return depto;
    }
    public double getSalario() {
        return salario;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    public int getUltimaEv(){
        return evaluaciones.stream().filter(ev -> ev.getAnio() == 2024).map(Evaluacion::getPuntaje).findFirst().orElse(0);
    }
}
