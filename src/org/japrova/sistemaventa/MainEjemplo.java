package org.japrova.sistemaventa;

import org.japrova.sistemaventa.model.personas.Administrador;
import org.japrova.sistemaventa.model.personas.Empleado;
import org.japrova.sistemaventa.model.personas.Vendedor;
import org.japrova.sistemaventa.model.productos.ItemProducto;
import org.japrova.sistemaventa.model.productos.Producto;
import org.japrova.sistemaventa.model.productos.TipoProducto;
import org.japrova.sistemaventa.view.Login;


public class MainEjemplo {
    public static void main(String[] args) {

        Producto pilsen = new Producto("P001", "Pilsen", TipoProducto.CERVERZA);
        Producto curquenia = new Producto("P002", "Cusqueña", TipoProducto.CERVERZA);
        Producto cristal = new Producto("P003", "Cristal", TipoProducto.CERVERZA);
        Producto pickeo = new Producto("P004", "Pickeo", TipoProducto.APERITIVO);
        Producto chizito = new Producto("P005", "Chizito", TipoProducto.APERITIVO);

        pilsen.setPrecio(12.9);
        curquenia.setPrecio(11.2);
        cristal.setPrecio(9.2);
        chizito.setPrecio(3.10);



        Empleado[] empleados = MainEjemplo.devolverEmpleado();
        Login login = new Login(empleados);

    }

    private static Empleado[] devolverEmpleado() {
        Empleado vendedor = new Vendedor("E01", "Kiyotaka", "Ayanokoji");
        vendedor.setUsuario("kiyotaka00");
        vendedor.setContrasenia("kiyotaka123");

        Empleado admin = new Administrador("2132", "Kei", "karuizawa");
        admin.setUsuario("kei");
        admin.setContrasenia("kei123");

        /*((Vendedor)vendedor).addProductosCarro(new ItemProducto(pilsen, 2))
                .addProductosCarro(new ItemProducto(curquenia, 3))
                .addProductosCarro(new ItemProducto(cristal, 3))
                .addProductosCarro(new ItemProducto(chizito, 4));


        System.out.println(((Vendedor) vendedor).visualizarCarro());*/

        return new Empleado[]{vendedor, admin};
    }
    public static int empleado() {

        return 0;
    }
}
