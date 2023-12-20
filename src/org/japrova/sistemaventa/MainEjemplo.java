package org.japrova.sistemaventa;

import org.japrova.sistemaventa.model.personas.*;
import org.japrova.sistemaventa.model.productos.*;

import java.util.ArrayList;
import java.util.Scanner;


public class MainEjemplo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Producto[] productos = inicializarProducto();

        Vendedor vendedor = new Vendedor("E01", "Kiyotaka", "Ayanokoji");
        vendedor.setUsuario("kiyotaka00");
        vendedor.setContrasenia("kiyotaka123");

        Empleado admin = new Administrador("2132", "Kei", "karuizawa");
        admin.setUsuario("kei");
        admin.setContrasenia("kei123");


        int opciones = 0;

        while(opciones != 4) {

            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Visualizar carro");
            System.out.println("4. Salir");
            opciones = sc.nextInt();

            switch (opciones) {

                case 1 -> {
                    Producto p = eleccionProducto(productos);
                    ItemProducto itemProducto = new ItemProducto(p);
                    System.out.println("Cantidad de " + p.getNombreProducto() + ":");

                    itemProducto.setCantidad(sc.nextInt());
                    vendedor.addProductosCarro(itemProducto);
                }
                case 2 -> {
                    ArrayList<ItemProducto> itemProductos = vendedor.getCarro().getItemProductos();
                    int i = 0;

                    for(ItemProducto itemProducto: itemProductos) {
                        System.out.println((i++) + ": " + itemProducto.getProducto().getNombreProducto());

                    }
                    vendedor.eliminarProducto(itemProductos.get(sc.nextInt()));
                }
                case 3 -> System.out.println(vendedor.visualizarCarro());

                case 4 -> System.out.println("Gracias por usar el sistema");

                default -> System.out.println("Por favor ingrese las opciones correspondientes");
            }
        }

    }

    public static Producto eleccionProducto(Producto[] productos) {

        System.out.println("Elige su producto por favor");

        for (int i = 0; i < productos.length; i++) {

            System.out.println("Nmr: " + i + ". "  + productos[i].getNombreProducto());
        }
        System.out.println("Escriba su numero: " );

        return productos[sc.nextInt()];
    }

    private static Producto[] inicializarProducto() {
        Producto pilsen = new Producto("P001", "Pilsen", TipoProducto.CERVERZA);
        Producto curquenia = new Producto("P002", "Cusqueña", TipoProducto.CERVERZA);
        Producto cristal = new Producto("P003", "Cristal", TipoProducto.CERVERZA);
        Producto pickeo = new Producto("P004", "Pickeo", TipoProducto.APERITIVO);
        Producto chizito = new Producto("P005", "Chizito", TipoProducto.APERITIVO);

        pilsen.setPrecio(12.9);
        curquenia.setPrecio(11.2);
        cristal.setPrecio(9.2);
        chizito.setPrecio(3.10);
        pickeo.setPrecio(1.50);

        return new Producto[]{pilsen, curquenia, cristal, pickeo, chizito};
    }
}
