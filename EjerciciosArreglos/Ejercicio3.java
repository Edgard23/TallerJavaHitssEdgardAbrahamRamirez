package Arreglos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        //Solicitar al usuario el valor de n
        System.out.println("Ingresa un valor para n: ");
        n = sc.nextInt();

        //Ciclo if donde si n es igual a cero, se finaliza el programa
        if (n <= 0) {
            System.out.println("ERROR");
            return;
        }

        //Con el valor de n, formar la matriz correspondiente

        String[][] X = new String[n][n];

        //Rellenar la matriz

        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X.length; j++) {
                if (i == j || i + j == n - 1) {
                    X[i][j] = "X";
                } else{
                    X[i][j] = "_";
                }
            }
        }

        //Imprimir la matriz
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X.length; j++) {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
    sc.close();
    }
}
