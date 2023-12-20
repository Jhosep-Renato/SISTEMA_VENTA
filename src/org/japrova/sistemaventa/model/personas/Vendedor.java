package org.japrova.sistemaventa.model.personas;

import org.japrova.sistemaventa.model.productos.ItemProducto;
import org.japrova.sistemaventa.model.venta.CarroCompra;

public class Vendedor extends Empleado {

    private CarroCompra carro;

    public Vendedor(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.carro = new CarroCompra();
    }


    public CarroCompra getCarro() {
        return carro;
    }

    public Vendedor addProductosCarro(ItemProducto item) { // PARA MÉTODOS ENCADENADOS

        if(item != null) {
            carro.addItemProducto(item);
        }
        return this;
    }

    public void eliminarProducto(ItemProducto itemProducto) {

        if(itemProducto != null) {

            for(ItemProducto item: this.carro.getItemProductos()) {

                if(item == itemProducto) {
                    carro.getItemProductos().remove(itemProducto);
                    break;
                }
            }
        }
    }

    public void realizarVenta() {

    }


    public String visualizarCarro() {
        StringBuilder sb = new StringBuilder("\n");

        if (!carro.getItemProductos().isEmpty()) {
            int numeroItems = 0;

            sb.append("================ Listado de productos ================").append("\n");
            for (ItemProducto i : carro.getItemProductos()) {
                sb.append(++numeroItems).append(". ")
                    .append(i.getProducto().getNombreProducto()).append(" - ")
                        .append("C: ").append(i.getCantidad()).append(" :: S/. ")
                        .append(i.calcularImporte()).append("\n");
            }
            carro.calcularTotal();
            sb.append("\n").append("Total: ")
                    .append(Math.round(carro.getTotal() * 100.0) / 100.0).append("\n");
        }
        else {
            sb.append("================")
                    .append(" No hay productos ").append("================")
                    .append("\n");
        }

        return sb.toString();
    }

}
