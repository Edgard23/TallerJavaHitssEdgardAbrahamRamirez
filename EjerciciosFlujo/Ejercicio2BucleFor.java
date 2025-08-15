//Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el número de veces (ingresado) para pedir el número entero, entonces se requiere:
//Calcular el menor número e imprimir el valor.
//Si el menor número es menor que 10, imprimir “El número menor es menor que 10”. Si no, imprimir “el número menor es igual o mayor a 10”


package ciclos;

import java.util.Scanner;

public class Ejercicio2BucleFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar al usuario la cantidad de números a ingresar
        System.out.println("¿Cuántos números ingresarás?: ");
        int datos, menor = Integer.MAX_VALUE, numero;
        datos = entrada.nextInt();

        //Ciclo If, si la cantidad de números a ingresar es menor que 10 se le pide al usuario ingresar una nueva cantidad
        if (datos < 10) {
            System.out.println("Ingresa un número mayor de datos");
            datos = entrada.nextInt();
        }

        //Ciclo for
        for (int i = 1; i <= datos; i++){
            System.out.println("Ingresa el número " + i +" :");
            numero = entrada.nextInt();
            
            //Ciclo if para comparar el número ingresado con el valor menor
            if (numero < menor) {
                menor = numero;
            }
        }

        //Mostrar el menor encontrado
        System.out.println("El número menor es: " + menor);

        //Mensaje si el menor es mayor o menor que 10
        if (menor < 10) {
            System.out.println("¡El número " + menor + " es menor a 10!");
        } else{
            System.out.println("¡El número " + menor + " es igual o mayor que 10!");
        }
        entrada.close();
    }
}
