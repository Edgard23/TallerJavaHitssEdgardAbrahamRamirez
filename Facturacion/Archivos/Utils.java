package Archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import entidades.Factura;

public class Utils {
    private static final Path carpetaFacturas = Paths.get("Facturas");
    public static void guardarFactura(Factura factura){
        try {
            if (!Files.exists(carpetaFacturas)) {
                Files.createDirectories(carpetaFacturas);
            }
            Path archivo = carpetaFacturas.resolve("Factura_" + factura.getID() + ".txt");
            //Escribir contenido
            Files.writeString(archivo, factura.generarReporte(), StandardOpenOption.CREATE,StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Factura guardada en: " + archivo.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al guardar factura: " + e.getMessage());
        }
    }

    //Leer la factura desde un archivo
    public static void leerFactura(int id){
        Path archivo = carpetaFacturas.resolve("Factura_" + id + ".txt");
        if (!Files.exists(archivo)) {
            System.out.println("La factura con ID" + id + " no existe");
            return;            
        }
        try {
            Files.lines(archivo).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error al leer la factura: " + e.getMessage());
        }
    }

    //Listar facturas
    public static void listarFacturas(){
        if (!Files.exists(carpetaFacturas)) {
            System.out.println("No hay facturas guardadas");
            return;
        }
        try (Stream<Path> archivos = Files.list(carpetaFacturas)){
            System.out.println("\n Lista de facturas:");
            archivos.filter(Files::isRegularFile).map(Path::getFileName).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error al listar facturas: " + e.getMessage());
        }
    }
}
