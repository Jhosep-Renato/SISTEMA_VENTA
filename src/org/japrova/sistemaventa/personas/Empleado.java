package org.japrova.sistemaventa.personas;

public class Empleado extends Persona {

    protected int id;
    protected String usuario;
    protected String contrasenia;
    private static int contador_id;

    public Empleado(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.id = ++Empleado.contador_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
