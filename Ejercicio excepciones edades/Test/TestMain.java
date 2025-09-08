package Test;

import java.util.Scanner;

import Clases.Alumno;
import Excepciones.EdadInvalidaException;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[3];
        int contador = 0;

        while (true) {
            try{
                System.out.println("Ingresa el nombre del alumno: ");
                String nombre = sc.nextLine();
                System.out.println("Ingresa la edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                Alumno a = new Alumno(nombre, edad);
                alumnos[contador] = a;
                contador++;
                System.out.println("Alumno registrado con éxito");
                
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No puedes registrar más de tres alumnos. ");
                break;
            } catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            } catch (EdadInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
            }

            if (contador == alumnos.length) {
                System.out.println("Registro completo. Lista de alumnos: ");
                for (Alumno a : alumnos) {
                    System.out.println(a);
                }
                break;
            }
        }
        sc.close();
    }
}
