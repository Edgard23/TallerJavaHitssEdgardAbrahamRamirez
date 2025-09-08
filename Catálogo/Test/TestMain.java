package Test;

import java.time.LocalDate;
import java.util.Arrays;

import Clases.Comics;
import Clases.Iphone;
import Clases.TvLcd;
import Interfaces.Producto;
import Interfaces.Impl.impLibro;

public class TestMain {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];
        productos[0] = new Iphone(18000, "Apple", "iPhone 16 Pro Max", "Blanco Perla", 22599.99);
        productos[1] = new TvLcd(8500, "Samsung", 70, 12999.90);
        productos[2]= new Comics(500, LocalDate.now(), "Scott Snyder", "El Batman que ríe", "DC Comics",
        999.99, "Batman");
        productos [3] = new impLibro(1000, LocalDate.of(2008, 03, 18), "Yunus Cengel", "Termodinámica",
        "Pearson Editorial", 2500.50);
        productos[4] = new Iphone(12000, "Apple", "iPhone 14 Plus", "Negro carbón", 15499.50);

        for (Producto producto : productos) {
            System.out.println();
        }
        System.out.println(Arrays.toString(productos));
    }
}
