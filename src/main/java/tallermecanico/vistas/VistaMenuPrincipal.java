package tallermecanico.vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Image;

public class VistaMenuPrincipal extends JFrame{
    
        private JDesktopPane escritorio;

        private JButton clientes;
        private JButton vehiculos;
        private JButton mecanicos;
        private JButton repuestos;
        private JButton ordenTrabajo;
        private JButton salir;

        public VistaMenuPrincipal(){ 
        
        //Configuracion de la ventana
        setTitle("Sistema de Taller Mecanico");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        //colores que llevara el sistema
        Color negro = new Color(28, 28, 28);
        Color amarillo = new Color(255, 193, 7);
        Color grisAcero = new Color(73, 80, 87);
        Color grisClaro = new Color(233, 236, 239);
        
        //Crear encabezado del sistema
        JPanel encabezado = new JPanel();
        encabezado.setBackground(negro);
        encabezado.setPreferredSize(new Dimension(1200, 80));

        //Crear titulo del sistema
        JLabel titulo = new JLabel("Sistema de Taller Mecanico");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(amarillo);

        //Agregar titulo al encabezado
        encabezado.add(titulo);
        
           
        //Crear escritorio para mostrar las ventanas y agregar color
        escritorio = new JDesktopPane();
        escritorio.setBackground(grisClaro);
        
        //Cargar la imagen del taller mecanico
        ImageIcon imagen = new ImageIcon(
                getClass().getResource("/imagenes/fondoTaller.png"));

        //Ajustar el tamaño de la imagen
        Image imagenAjustada = imagen.getImage().getScaledInstance(
                980, 680, Image.SCALE_SMOOTH);

        //Crear etiqueta para mostrar la imagen
        JLabel fondo = new JLabel(new ImageIcon(imagenAjustada));

        //Definir posicion y tamaño de la imagen
        fondo.setBounds(0, 0, 980, 680);

        //Agregar la imagen al escritorio
        escritorio.add(fondo, JDesktopPane.FRAME_CONTENT_LAYER);
        
        //Crear panel lateral con color
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(6, 1, 10, 10));
        panelBotones.setBackground(negro);
        panelBotones.setPreferredSize(new Dimension(220, 0));
        
        //Crear los botones del menu con color
        clientes = new JButton("Clientes");
        clientes.setBackground(amarillo);
        clientes.setForeground(Color.BLACK);
        clientes.setFont(new Font("Arial", Font.BOLD, 16));
           
        vehiculos = new JButton("Vehiculos");
        vehiculos.setBackground(amarillo);
        vehiculos.setForeground(Color.BLACK);
        vehiculos.setFont(new Font("Arial", Font.BOLD, 16));
        
        mecanicos = new JButton("Mecanicos");
        mecanicos.setBackground(amarillo);
        mecanicos.setForeground(Color.BLACK);
        mecanicos.setFont(new Font("Arial", Font.BOLD, 16));
        
        
        repuestos = new JButton("Repuestos");
        repuestos.setBackground(amarillo);
        repuestos.setForeground(Color.BLACK);
        repuestos.setFont(new Font("Arial", Font.BOLD, 16));
        
        ordenTrabajo = new JButton("Orden de Trabajo");
        ordenTrabajo.setBackground(amarillo);
        ordenTrabajo.setForeground(Color.BLACK);
        ordenTrabajo.setFont(new Font("Arial", Font.BOLD, 16));
        
        salir = new JButton("Salir");
        salir.setBackground(grisAcero);
        salir.setForeground(Color.WHITE);
        salir.setFont(new Font("Arial", Font.BOLD, 16));
        
        
        //Agregar los botones al panel
        panelBotones.add(clientes);
        panelBotones.add(vehiculos);
        panelBotones.add(mecanicos);
        panelBotones.add(repuestos);
        panelBotones.add(ordenTrabajo);
        panelBotones.add(salir);
        
        //Agregar los paneles a la ventana principal
        add(encabezado, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.WEST);
        add(escritorio, BorderLayout.CENTER);
        
        //Aqui se abrira la ventana de los clientes
        clientes.addActionListener(e -> {
            VistaClientes ventana = new VistaClientes();
            escritorio.add(ventana);
            ventana.setVisible(true);            
        });
        
        //Aqui se abrira la ventana de los vehiculos
        vehiculos.addActionListener(e -> {
            VistaVehiculos ventana = new VistaVehiculos();
            escritorio.add(ventana);
            ventana.setVisible(true);       
        });
        
        //Aqui se abrira la ventana de los mecanicos
        mecanicos.addActionListener(e -> {
            VistaMecanicos ventana = new VistaMecanicos();
            escritorio.add(ventana);
            ventana.setVisible(true); 
        });
        
        //Aqui se abrira la ventana de repuestos
        repuestos.addActionListener(e -> {
            VistaRepuestos ventana = new VistaRepuestos();
            escritorio.add(ventana);
            ventana.setVisible(true);
        });
        
        //Aqui se abrira la ventana de ordenes de trabajo
        ordenTrabajo.addActionListener(e -> {
            VistaOrdenTrabajo ventana = new VistaOrdenTrabajo();
            escritorio.add(ventana);
            ventana.setVisible(true);
        });
        
        //Aqui se cerrara el sistema
        salir.addActionListener(e -> {
            System.exit(0);
        });
}
}
