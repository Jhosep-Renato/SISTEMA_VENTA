package org.japrova.sistemaventa.model.productos;

public class ItemProducto {

    private Producto producto;
    private int cantidad;

    public ItemProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
