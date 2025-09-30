package Test;

import Clases.Inventario;
import Clases.Producto;
import Enum.Categoria;

public class TestMain {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        //Registro de productos
        Producto p1 = new Producto("P0001", "Jersey Cruz Azul Local 2025", 100, Categoria.FUTBOL);
        Producto p2 = new Producto("P0004", "Camiseta Runing Nike", 200, Categoria.RUNNING);
        Producto p3 = new Producto("P0015", "Jersey Chicago Bulls", 20, Categoria.BALONCESTO);
        Producto p4 = new Producto("P0003", "Traje de baño Speedo", 50, Categoria.NATACION);
        Producto p5 = new Producto("P0008", "Cinturón de levantamiento de pesas", 23, Categoria.GIMNASIO);

        inventario.registrarProductos(p1);
        inventario.registrarProductos(p2);
        inventario.registrarProductos(p3);
        inventario.registrarProductos(p4);
        inventario.registrarProductos(p5);

        //Actualizar stock
        inventario.actualizarStock("P0001", "Perisur", 150);
        inventario.actualizarStock("P0001", "Lindavista", 200);
        inventario.actualizarStock("P0015", "Perisur", 20);
        inventario.actualizarStock("P0015", "Lindavista", 40);
        inventario.actualizarStock("P0004", "Perisur", 15);
        inventario.actualizarStock("P0004", "Lindavista", 5);
        inventario.actualizarStock("P0003", "Lindavista", 30);
        inventario.actualizarStock("P0003", "Perisur", 50);
        inventario.actualizarStock("P0008", "Perisur", 15);
        inventario.actualizarStock("P0008", "Lindavista", 10);

        //Consultar por SKU
        System.out.println("\n Consulta SKU P0003: " + inventario.consultarPorSku("P0003"));

        //Reportes
        inventario.reporteInsercion();
        inventario.reporteAlfabetico();
    }
}
