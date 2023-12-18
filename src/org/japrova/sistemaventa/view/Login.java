package org.japrova.sistemaventa.view;

import org.japrova.sistemaventa.model.personas.Empleado;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    private JTextField usuarioText;
    private JButton ingresarBtn;
    private JPanel panel;
    private JPasswordField passwordText;


    public Login(Empleado[] empleados) {
        definirElementos();

        this.ingresarBtn.addActionListener(e -> {

            if(verificarUsuario(empleados)) {
                System.out.println("Has iniciado session correctamente");
                return;
            }
            System.out.println("Contraseña incorrecta");
            limpiarCampos();
        });
    }

    public void definirElementos() {
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setContentPane(this.panel);
    }

    public boolean verificarUsuario(Empleado[] empleados) {
        boolean validar = false;

        for (Empleado e: empleados) {

            if(e.getUsuario().equals(usuarioText.getText()) &&
                e.getContrasenia().equals(String.valueOf(passwordText.getPassword()))) {

                validar = true;
                break;
            }
        }

        return validar;
    }

    public void limpiarCampos() {
        this.usuarioText.setText("");
        this.passwordText.setText("");
    }
}
