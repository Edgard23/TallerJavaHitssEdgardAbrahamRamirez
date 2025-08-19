package Arreglos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración del arreglo
        int[] arreglo = new int[10];

        //Solicitar al usuario ingresar los componentes del arreglo
        System.out.println("Ingresa 10 números entre el 1 y el 9.");
        for (int i = 0; i < arreglo.length; i++) {
            System.err.println("Número " + i + " :");
            arreglo[i] = sc.nextInt();
            
            //Validación para que los números ingresados estén en el rango de 1 a 9
            while (arreglo[i] < 1 || arreglo[i] > 9) {
                System.out.println("Valor inválido. Ingresa un número entre el 1 y el 9");
                System.out.println("Número " + i + " :");
                arreglo[i] = sc.nextInt();
            }
        }
            //Contar las ocurrencias
            int[] conteo = new int[10];
            for (int num : arreglo) {
                conteo[num]++;
            }

            //Encontrar el número con más ocurrencias
            int maxOcurrencia = 0;
            int masRepetido = 0;

            for (int i = 1; i < 9; i++) {
                if (conteo[i] > maxOcurrencia) {
                    maxOcurrencia = conteo[i];
                    masRepetido = i;
                }
            }

            //Resultados
            System.out.println("El número que más se repite es " + masRepetido);
            System.out.println("La mayor ocurrencia es: " + maxOcurrencia);

            //cerrar la entrada
            sc.close();
    }


}

