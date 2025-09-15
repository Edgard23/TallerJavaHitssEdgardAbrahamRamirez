package Test;
//Sistema de facturacion
//Entidades: cliente, producto, factura
//Servicio genérico, ID unico -> Todas las entidades que implementen de Identificable
//-> Guardar las entidades
//-> Listar las entidades
//-> Buscar por ID
//-> Actualizar por ID
//-> Eliminar por ID

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Archivos.Utils;
import entidades.Cliente;
import entidades.Estudiante;
import entidades.Factura;
import entidades.Producto;
import genericos.ServicioGenerico;

//Una interfaz genérica identificable

//Problema: Escribir y leer un archivo donde se guarde el detalle de la factura
//Una clase con métodos estáticos, los cuales son:
//1.- Guardar en un archivo la factura, con la siguiente nomenclatura en el nombre del archivo:
//"factura_idFactura.txt"
//Todas las facturas se guardan en una carpeta llamada facturas
//2.- Leer la factura y mostrar en consola
//3.- Listar los nombres de todas las facturas existentes

public class Facturacion {
    public static void main(String[] args) {
    
        //Servicios
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Integer> facturaServicio = new ServicioGenerico<>();
        //No se acepta la entidad estudiante porque no implementa la interfaz identificable
        //ServicioGenerico<Estudiante, Integer> estudianteServicio = new ServicioGenerico<>();

        //Clientes
        Cliente c1 = new Cliente("C001", "Dave Mustaine");
        Cliente c2 = new Cliente("C002", "James Hetfield");
        Cliente c3 = new Cliente("C003", "Edgard Gil");
        clienteServicio.guardar(c1);
        clienteServicio.guardar(c2);
        clienteServicio.guardar(c3);

        //Productos
        Producto p1 = new Producto(100, "Guitarra Jackson", 17000);
        Producto p2 = new Producto(200, "Laptop", 15000);
        Producto p3 = new Producto(300, "PlayStation 5", 12000);
        Producto p4 = new Producto(400, "iPhone 15 Pro", 18000);
        productoServicio.guardar(p1);
        productoServicio.guardar(p2);
        productoServicio.guardar(p3);
        

        //Facturas
        //List<Producto> nuevaLista = new ArrayList<>(Arrays.asList(p1,p2,p3));
        Factura f1 = new Factura(1, c1, Arrays.asList(p1, p2));
        Factura f2 = new Factura(2, c2, Arrays.asList(p1,p3));
        Factura f3 = new Factura(3, c3, Arrays.asList(p1, p2, p3));
        facturaServicio.guardar(f1);
        facturaServicio.guardar(f2);
        facturaServicio.guardar(f3);

        //Buscar por ID
        System.out.println("Buscar cliente C002");
        System.out.println(clienteServicio.buscarPorID("C002"));
        System.out.println("Buscar cliente C004");
        System.out.println(clienteServicio.buscarPorID("C004"));

        //Actualizar cliente
        System.out.println("Actualizando cliente C002...");
        clienteServicio.actualizar("C002", new Cliente("C002", "Kirk Hammett"));

        //Eliminar cliente
        System.out.println("Eliminando cliente C003");
        clienteServicio.eliminar("C003");

        System.out.println("Eliminar y agregar producto a factura");
        f2.eliminarProducto(300);
        f3.agregarElemento(p4);

        System.out.println(f2.generarReporte());

        Utils.guardarFactura(f1);
        Utils.guardarFactura(f2);
        Utils.guardarFactura(f3);

        Utils.leerFactura(1);;;
        Utils.listarFacturas();
    }
}
