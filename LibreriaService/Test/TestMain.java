package Test;

import java.time.LocalDate;

import clases.Cliente;
import clases.LibreriaService;
import clases.Libro;
import clases.Venta;

public class TestMain {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Meditaciones", "Marco Aurelio", 2004, 359.99);
        Libro libro2 = new Libro("Java básico", "Eloy Sánchez", 2025, 299.00);
        Libro libro3 = new Libro("No me puedes lastimar", "David Goggins", 2018, 539.40);
        Libro libro4 = new Libro("Código de Hammurabi", "Babilonia", 759, 150.0);

        Cliente c1 = new Cliente("Edgard", 23);
        Cliente c2 = new Cliente("Santiago", 19);
        Cliente c3 = new Cliente("Leonardo", 9);

        LibreriaService service = new LibreriaService();

        //Validaciones
        System.out.println("¿Libro 1 es válido? " + service.validadLibro.test(libro1));
        System.out.println("¿Libro 2 es válido?" + service.validadLibro.test(libro2));
        System.out.println("¿Libro 3 es válido?" + service.validadLibro.test(libro3));
        System.out.println("¿Libro 4 es válido?" + service.validadLibro.test(libro4));

        System.out.println("¿Cliente 1 es válido? " + service.validarCliente.test(c1));
        System.out.println("¿Cliente 2 es válido? " + service.validarCliente.test(c2));
        System.out.println("¿Cliente 3 es válido? " + service.validarCliente.test(c3));

        //Trasformación
        System.out.println("Resumen del primer libro: " + service.resumenLibro.apply(libro1));
        System.out.println("Resumen del segundo libro: " + service.resumenLibro.apply(libro2));
        System.out.println("Resumen del tercer libro: " + service.resumenLibro.apply(libro3));
        System.out.println("Resumen del cuarto libro: " + service.resumenLibro.apply(libro4));

        //Ventas
        Venta v1 = new Venta(c1, libro1, LocalDate.of(2025, 9, 25));
        c1.registrarVenta(v1);
        Venta v2 = new Venta(c1, libro3, LocalDate.of(2025, 9, 25));
        c1.registrarVenta(v2);
        Venta v3 = new Venta(c2, libro2, LocalDate.now());
        c3.registrarVenta(v3);
        service.imprimirFactura.accept(v1);
        service.imprimirFactura.accept(v2);
        service.imprimirFactura.accept(v3);

        //Descuentos
        System.out.println("Precio con descuento del libro 1: $" + service.descuento.apply(libro1.getPrecio()));
        System.out.println("Precio con descuento del libro 2: $" + service.descuento.apply(libro2.getPrecio()));
        System.out.println("Precio con descuento del libro 3: $" + service.descuento.apply(libro3.getPrecio()));

        //Códigos de venta
        System.out.println("Código de la venta 1: " + service.codigo.get());
        System.out.println("Código de la venta 2: " + service.codigo.get());
        System.out.println("Código de la venta 3: " + service.codigo.get());
        


    }
}
