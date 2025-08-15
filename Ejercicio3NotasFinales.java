//Pedir 20 notas finales de alumnos en una escala de 1 a 10, manejar decimales en las notas (double)
//Mostrar el promedio de las notas mayores o iguales a 6, promedio de notas inferiores a 6 y la cantidad de notas iguales a 1, además mostrar el promedio total. 

package ciclos;

import java.util.Scanner;

public class Ejercicio3NotasFinales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        int i, contador1 = 0, contador2 = 0, contador3 = 0;
        double calf, prom1 = 0, prom2 = 0, promtotal = 0, suma1 = 0, suma2 = 0, suma3 = 0;

        //Solicitar las calificaciones
        System.out.println("Ingrese las calificaciones");
        for (i = 1; i <= 20; i++){
            calf = entrada.nextDouble();
            
            //Ciclos if para calcular promedios superiores e inferiores a 6
            if (calf >= 6){
                contador1 += 1;
                suma1 += calf; 
                prom1 = suma1 / contador1;
            } if(calf < 6){
                contador2 += 1;
                suma2 += calf;
                prom2 = suma2 / contador2;
            
              
            } if(calf == 1) contador3 += 1;
            
              //Ciclo if para terminar el método en caso de ingresar calificación menor a 1
            if(calf < 1){
                System.out.println("ERROR. Calificación no válida");
                return;
            }

            //Cálculo del promedio total y los promedio mayores y menores a 6
            suma3 += calf;
            promtotal = suma3 / 20;
        }

        //Mostrar los promedios
        System.out.println("El promedio total del grupo es de " + promtotal);
        System.out.println(contador1 + " alumnos tuvieron calificación igual o mayor que 6 y su promedio fue de " + prom1);
        System.out.println(contador2 + " alumnos tuvieron calificación menor que 6 y su promedio fue de " + prom2);
        System.out.println(contador3 + " alumnos tuvieron calificación igual a 1");

        entrada.close();
    }
}
