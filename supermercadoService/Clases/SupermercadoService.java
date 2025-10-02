package Clases;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import Enum.TipoCliente;

public class SupermercadoService {
    
    //1. Filtrar productos con stock bajo -> Predicate
    public Predicate<Producto> stockBajo = p -> p.getStock() < 5;

    //2. Calcular el total de una venta a partir de la lista de productos -> Function
    public Function<Venta, Double> total = v -> {
        double total = 0;
        for (Producto p : v.getProductos()) {
            total += p.getPrecio();
        }
        return total;
    };

    //3. Imprimir los detalles de una venta -> Consumer
    public Consumer<Venta> imprimirVenta = v -> {
        System.out.println("Venta #" + v.getIdVenta() + " | Cliente: " + v.getCliente().getNombre() + " | Empleado: " + v.getEmpleado().getNombre());
        v.getProductos().forEach(p -> System.out.println(" - " + p));
        System.out.println("Total: $" + v.getTotal());
    };

    //4. Generar un producto de muestra para pruebas -> Supplier
    public Supplier<Producto> muestra = () -> new Producto("Producto muestra", 9.99, 100);

    //5. Aplicar un descuento del 10% a un producto -> Function
    public Function<Producto,Producto> descuento = p -> new Producto(p.getNombre(), p.getPrecio() * 0.9, p.getStock());

    //6. Comparar dos productos y devolver el más caro -> BiFunction
    public BiFunction<Producto,Producto,Producto> masCaro = (p1,p2) -> p1.getPrecio() > p2.getPrecio() ? p1 : p2;

    //7. Verificar si un cliente puede acceder a un descuento -> BiPredicate
    public BiPredicate<Cliente, Double> clienteConDescuento = (c,total) -> {
        if (c.getTipo() == TipoCliente.VIP && total > 1000) {
            return true;
        } else return false;
    };

    //8. Generar un ticket de venta con Cliente + Venta, simulado en consola
    public Supplier<String> ticket(Cliente cliente, Venta venta){
        return () -> {
            StringBuilder sb = new StringBuilder();
            sb.append("====== TICKET DE VENTA =====\n");
            sb.append("Venta #" + venta.getIdVenta() + "\n");
            sb.append("Cliente: " + cliente.getNombre() + "\n");
            sb.append("Empleado: " + venta.getEmpleado().getNombre() + "\n");
            sb.append("Productos:\n");
            for (Producto p : venta.getProductos()) {
                sb.append(" - " + p.getNombre() +" $" + p.getPrecio() + "\n");
            }
            sb.append("Total: $" + venta.getTotal() + "\n");
            return sb.toString();
        };
    }

    //9. Notificar a un cliente que su compra fue procesada por un empleado -> BiConsumer
    public BiConsumer<Cliente, Empleado> notificar = (c,e) -> System.out.println("Estimado " + c.getNombre() + " su compra fue procesada por el empleado "
    + e.getNombre());

}
