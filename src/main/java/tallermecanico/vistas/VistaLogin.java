package tallermecanico.vistas;

import java.awt.GridLayout;
import javax.swing.*;


public class VistaLogin extends JFrame {
    
    private JTextField usuario;
    private JPasswordField contrasena;
    private JButton ingresar;
    private JButton salir;
    
public VistaLogin() { 
     
    //Configuracion de la ventana
    setTitle("Inicio de Sesion - Taller Mecanico");
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(3, 2, 10, 10));
    
    //Creaciond de los campos donde se pondra informacion
    usuario = new JTextField();
    contrasena = new JPasswordField();
    
    //Agregar los botones
    ingresar = new JButton("Ingresar");
    salir = new JButton("Salir");
    
    //Agregamos los componentes
    add(new JLabel("Usuario: "));
    add(usuario);
    
    add(new JLabel("contraseña: "));
    add(contrasena);
    
    add(ingresar);
    add(salir);
        
}
}
