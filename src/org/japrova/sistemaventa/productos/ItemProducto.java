package org.japrova.sistemaventa.productos;

public class ItemProducto {

    private Producto producto;
    private int cantidad;

    public ItemProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularImporte() {
        if (this.producto != null && this.producto.getPrecio() > 0) {
            return this.producto.getPrecio() * cantidad;
        }
        return 0;
    }
}
