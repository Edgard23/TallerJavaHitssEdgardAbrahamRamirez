package ciclos;

import java.util.Scanner;

public class Ejercicio4Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        
        do {
            //Desplegar el menú
            System.out.println("¡Bienvenido! Ingresa la opción correspondiente: ");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Listar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            i = sc.nextInt(); 
            switch (i) {
                case 1:
                System.out.println("Usuario creado correctamente");
                break;
                case 2:
                System.out.println("Usuario actualizado correctamente");
                break;
                case 3:
                System.out.println("Usuario listado correctamente");
                break;
                case 4: 
                System.out.println("Usuario eliminado correctamente");
                break; 
                case 5:
                break;
                default:
                System.out.println("Ingresa un número válido");
                break;
            }
        }
        while (i != 5);
        System.out.println("Haz salido con éxito");
        sc.close();
    }
}
