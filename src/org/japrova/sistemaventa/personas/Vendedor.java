package org.japrova.sistemaventa.personas;

import org.japrova.sistemaventa.productos.ItemProducto;
import org.japrova.sistemaventa.productos.Producto;
import org.japrova.sistemaventa.venta.CarroCompra;

import java.util.ArrayList;

public class Vendedor extends Empleado {

    private ArrayList<ItemProducto> items;
    private CarroCompra carro;

    public Vendedor(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.carro = new CarroCompra();
    }

    public void setItems(ArrayList<ItemProducto> items) {
        this.items = items;
    }

    public Vendedor addProductosCarro(ItemProducto item) { // PARA MÉTODOS ENCADENADOS

        if(item != null) {
            this.setItems(carro.getItemProductos());
            carro.addItemProducto(item);
        }
        return this;
    }

    public void eliminarProducto(Producto producto) {

        if(producto != null) {
            items.forEach(i -> {
                if(i.getProducto() == producto) {
                    items.remove(i);
                }
            });
        }
    }

    public void realizarVenta() {

    }

    public String visualizarCarro() {
        StringBuilder sb = new StringBuilder("Productos: \n");

        for (ItemProducto i : items) {
            sb.append("Nombre: ").append(i.getProducto().getNombreProducto()).append("\n")
                    .append(("Precio: ")).append(i.getProducto().getPrecio()).append("\n");
        }
        carro.calcularTotal();
        sb.append(Math.round(carro.getTotal() * 100.0) / 100.0);

        return sb.toString();
    }

}
