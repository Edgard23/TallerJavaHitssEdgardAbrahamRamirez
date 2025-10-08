package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import clases.Empleado;
import clases.Evaluacion;

public class TestMain {
    public static void main(String[] args) {
        //Creación de objetos
        //Empleados
        Empleado e1 = new Empleado(1, "Carlos", "TI", 55000, 6, 
        Arrays.asList(new Evaluacion(2024, 95), new Evaluacion(2023, 90), 
        new Evaluacion(2022, 85), new Evaluacion(2021, 80), new Evaluacion(2020, 75), new Evaluacion(2019, 72)));
        Empleado e2 = new Empleado(2, "Santiago", "TI", 30000, 3, 
        Arrays.asList(new Evaluacion(2024, 84), new Evaluacion(2023, 78), new Evaluacion(2022, 74)));
        Empleado e3 = new Empleado(3, "Ana", "RH", 25000, 4, 
        Arrays.asList(new Evaluacion(2024, 96), new Evaluacion(2023, 92), new Evaluacion(2022, 92),
         new Evaluacion(2021, 88)));
         Empleado e4 = new Empleado(4, "María", "Ventas", 62000, 8, 
         Arrays.asList(new Evaluacion(2024, 92),new Evaluacion(2023, 85), 
        new Evaluacion(2022, 90), new Evaluacion(2021, 80), new Evaluacion(2020, 75), new Evaluacion(2019, 76),
        new Evaluacion(2018, 73), new Evaluacion(2017, 66)));

        List<Empleado> empleados = List.of(e1,e2,e3,e4);

        //1. Listar empleados de un departamento específico ordenados alfabéticamente
        System.out.println("Empleados del departamento TI:");
        empleados.stream()
                 .filter(e -> e.getDepto().equalsIgnoreCase("TI"))
                 .sorted(Comparator.comparing(Empleado::getNombre))
                 .forEach(e -> System.out.println(" - " + e.getNombre()));
        System.out.println("\nEmpleados del departamento RH:");
        empleados.stream()
                 .filter(e -> e.getDepto().equalsIgnoreCase("RH"))
                 .sorted(Comparator.comparing(Empleado::getNombre))
                 .forEach(e -> System.out.println(" - " + e.getNombre()));
        System.out.println("\nEmpleados del departamento ventas:");
        empleados.stream()
                 .filter(e -> e.getDepto().equalsIgnoreCase("Ventas"))
                 .sorted(Comparator.comparing(Empleado::getNombre))
                 .forEach(e -> System.out.println(" - " + e.getNombre()));

        //2. Calcular el salario promedio por departamento
        System.out.println("\nSalario promedio por departamento: ");
        empleados.stream()
                 .collect(Collectors.groupingBy(Empleado::getDepto,
                 Collectors.averagingDouble(Empleado::getSalario)))
                 .forEach((dep, prom) -> System.out.println(dep + " - $" + prom));
        
        //3. Empleado con mayor salario
        Empleado maxSalario = empleados.stream().max(Comparator.comparingDouble(Empleado::getSalario)).orElse(null);
        System.out.println("\nEmpleado con mayor salario: " + maxSalario.getNombre() + " - $" + maxSalario.getSalario());

        //4. Listar todos los empleados con más de 5 años de experiencia y salario mayor a 50,000
        System.out.println("\nEmpleados con cinco años de experiencia y salario mayor a $50,000: ");
        empleados.stream().filter(e -> e.getAniosExperiencia() > 5 && e.getSalario() > 50000)
                 .forEach(e -> System.out.println(" - " + e.getNombre()));

        //5. Top 3 empleados con mejor puntaje en la última evaluación
        System.out.println("\nTop 3 empleados con mejor puntaje en 2024:");
        empleados.stream().sorted((a,b) -> Integer.compare(b.getUltimaEv(), a.getUltimaEv()))
                 .limit(3).forEach(e -> System.out.println(e.getNombre() + " - Puntaje 2024: " + e.getUltimaEv()));

        //6. Contar cuántos empleados tienen al menos una evaluación superior a 90 puntos
        System.out.println("\nEmpleados con al menos una evaluación > 90:");
        long empleadosConAltaEvaluacion = empleados.stream().filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90)).count();
        System.out.println("Total: " + empleadosConAltaEvaluacion);

        //7. Generar un ranking de promedio de puntajes por empleado
        System.out.println("\nRanking: Promedio de puntajes por empleado");
        empleados.stream()
                 .collect(Collectors.toMap(Empleado::getNombre, e -> e.getEvaluaciones().stream()
                 .mapToInt(Evaluacion::getPuntaje)
                 .average()
                 .orElse(0)))
                 .entrySet().stream()
                 .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                 .forEach(e -> System.out.println(e.getKey() + " - Promedio: " + e.getValue()));
    }
}
