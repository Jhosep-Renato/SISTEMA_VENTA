package org.japrova.sistemaventa.model.productos;

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
