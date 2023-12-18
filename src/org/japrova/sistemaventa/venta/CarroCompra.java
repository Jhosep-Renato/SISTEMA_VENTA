package org.japrova.sistemaventa.venta;

import org.japrova.sistemaventa.productos.ItemProducto;

import java.util.ArrayList;

public class CarroCompra {

    private ArrayList<ItemProducto> itemProductos;
    private double total = 0;

    public CarroCompra() {
        this.itemProductos = new ArrayList<>();
    }

    public void calcularTotal() {

        for (ItemProducto i: itemProductos) {
            this.setTotal(i.calcularImporte());
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total += total;
    }

    public ArrayList<ItemProducto> getItemProductos() {
        return itemProductos;
    }

    public void addItemProducto(ItemProducto itemProducto) {
        if(itemProducto != null) {

            this.itemProductos.add(itemProducto);
        }
    }
}
