package Clases;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inventario {
    private Map<String, Producto> productosSku = new HashMap<>();
    private Map<String, Producto> productosInsercion = new LinkedHashMap<>();
    private Map<String,Producto> productosNombre = new TreeMap<>();

    //Método para registrar productos
    public void registrarProductos(Producto p){
        productosSku.put(p.getSku(), p);
        productosInsercion.put(p.getSku(), p);
        productosNombre.put(p.getSku(), p);
    }

    //Método para consulta por SKU
    public Producto consultarPorSku(String sku){
        return productosSku.get(sku);
    }

    //Método para actualizar stock
    public void actualizarStock(String sku, String sucursal, int cantidad){
        Producto p = productosSku.get(sku);
        if (p != null) {
            p.actualizarStock(sucursal, cantidad);
        } else
            System.out.println("Producto con SKU" + sku + " no encontrado");
    }

    public void reporteInsercion(){
        System.out.println("\n ====== Reporte por Orden de Inserción ======");
        for (Producto p : productosInsercion.values()) {
            System.out.println(p);
        }
    }

    public void reporteAlfabetico(){
        System.out.println("\n ====== Reporte por Orden Alfabético ======");
        for (Producto p : productosNombre.values()) {
            System.out.println(p);
        }
    }
}
