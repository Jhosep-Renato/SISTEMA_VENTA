package org.japrova.sistemaventa.productos;

public class Producto {

    private String codigo;
    private String nombreProducto;
    private double precio;
    private TipoProducto tipo;

    public Producto(String codigo, String nombreProducto, TipoProducto tipo) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public TipoProducto getTipo() {
        return tipo;
    }
}
