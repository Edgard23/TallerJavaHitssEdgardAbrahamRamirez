package clases;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LibreriaService {
    public Predicate<Libro> validadLibro = l -> l.getAno() > 1900;

    public Predicate<Cliente> validarCliente = c -> c.getEdad() >= 18;

    public Function<Libro,String> resumenLibro = lib -> lib.getTitulo() + " - " + lib.getAutor() + " ($" + lib.getPrecio() + ")";

    public Consumer<Venta> imprimirFactura = v -> System.out.println("Factura -> " + v.getCliente().getNombre() + " compró " + v.getLibro().getTitulo() + " el " +
    v.getFecha());

    public Function<Double, Double> descuento = precio -> precio * 0.9;

    public Supplier<String> codigo = () -> UUID.randomUUID().toString();
}
