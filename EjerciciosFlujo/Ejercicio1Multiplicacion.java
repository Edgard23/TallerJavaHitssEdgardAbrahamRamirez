package ciclos;

import java.util.Scanner;

public class Ejercicio1Multiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, resultado = 0, originalA, originalB;
        System.out.println("Ingresa un primer número: ");
        a = entrada.nextInt();
        System.out.println("Ingresa un segundo número: ");
        b = entrada.nextInt();

        originalA = a;
        originalB = b;

        //Determinar el signo
        int signo = 1;
        if (a < 0) {
            a = -a;
            signo *= -1;
        } 
        if (b < 0){
            b = -b;
            signo *= -1;
        }

        //Sumar el número a, b veces
        for (int i = 0; i < b; i++){
            resultado += a;
        }

        //Aplicar el signo
        resultado *= signo;

        //Se imprime el resultado
        System.out.println(originalA + " x " + originalB +" = " + resultado);
        entrada.close();
    }
}

