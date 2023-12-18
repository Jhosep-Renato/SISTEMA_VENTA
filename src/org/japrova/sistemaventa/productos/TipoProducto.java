package org.japrova.sistemaventa.productos;

public enum TipoProducto {

    CERVERZA("Cerveza"),
    APERITIVO("Aperitivo");

    private final String nombre;

    TipoProducto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
