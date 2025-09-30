package Clases;

import java.util.HashMap;
import java.util.Map;

import Enum.Categoria;

public class Producto implements Comparable<Producto>{
    private String sku, nombre;
    private Map<String, Integer> stock;
    private Categoria cat;
    public Producto(String sku, String nombre, int stock, Categoria cat) {
        this.sku = sku;
        this.nombre = nombre;
        this.stock = new HashMap<>();
        this.cat = cat;
    }
    public String getSku() {
        return sku;
    }
    public String getNombre() {
        return nombre;
    }
    public Map<String, Integer> getStock() {
        return stock;
    }
    public Categoria getCat() {
        return cat;
    }
    @Override
    public String toString() {
        return "Producto {SKU: " + sku + 
        ", Nombre del producto: " + nombre + 
        ", Categoría: " + cat + 
        ", Stock disponible: " + stock + "}"; 
    }

    //Método para actualizar stock
    public void actualizarStock(String sucursal, int cantidad){
        stock.put(sucursal, cantidad);
    }
    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
}
