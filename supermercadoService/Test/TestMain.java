package Test;

import java.util.Arrays;
import java.util.List;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Producto;
import Clases.SupermercadoService;
import Clases.Venta;
import Enum.TipoCliente;

public class TestMain {
    public static void main(String[] args) {
        //Creación de objetos
        Producto p1 = new Producto("Leche Lala", 23.59, 200);
        Producto p2 = new Producto("Pan bimbo", 54.9, 100);
        Producto p3 = new Producto("Galletas María", 18.5, 180);
        Producto p4 = new Producto("Jugo Del Valle", 30.0, 220);
        Producto p5 = new Producto("Mermelada de fresa", 25.0, 4);

        Cliente c1 = new Cliente("Edgard", TipoCliente.VIP);
        Cliente c2 = new Cliente("Santiago", TipoCliente.NORMAL);

        Empleado e1 = new Empleado("Julián", "Cajero");
        Empleado e2 = new Empleado("Ana", "Gerente");

        List<Producto> lista1 = Arrays.asList(p1,p2,p3);
        List<Producto> lista2 = Arrays.asList(p4,p5);

        Venta v1 = new Venta(c1, e1, lista1);
        Venta v2 = new Venta(c2, e2, lista2);

        SupermercadoService service = new SupermercadoService();

        //Filtrar productos con stock bajo
        System.out.println("Productos con stock bajo:");
        for (Producto p : lista1) {
            if (service.stockBajo.test(p)) {
            System.out.println(" - " + p);
            }
        }       
        for (Producto p : lista2) {
            if (service.stockBajo.test(p)) {
            System.out.println(" - " + p);
            }
        }

        //Calcular total
        v1.setTotal(service.total.apply(v1));
        v2.setTotal(service.total.apply(v2));

        //Imprimir detalles
        service.imprimirVenta.accept(v1);
        service.imprimirVenta.accept(v2);

        //Producto de muestra
        System.out.println("Producto muestra: " + service.muestra.get());

        //Descuento
        System.out.println("Pan con descuento: " + service.descuento.apply(p2));

        //Más caro
        System.out.println("Más caro entre leche y jugo: " + service.masCaro.apply(p4, p1));

        //Cliente con descuento
        System.out.println("¿Cliente " + c1.getNombre() + " accede a descuento? " +service.clienteConDescuento.test(c1,v1.getTotal()));
        System.out.println("¿Cliente " + c2.getNombre() + " accede a descuento? " +service.clienteConDescuento.test(c2,v2.getTotal()));
        
        //Tickets
        System.out.println(service.ticket(c1, v1).get());
        System.out.println(service.ticket(c2, v2).get());

        //Notificaciones
        service.notificar.accept(c1, e1);
        service.notificar.accept(c2, e2);
    }
}
