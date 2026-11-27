package tallermecanico.vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class VistaClientes extends JInternalFrame {
    
    private JTextField idCliente;
    private JTextField rut;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField telefono;
    private JTextField email;
    
    private JButton guardar;
    private JButton modificar;
    private JButton eliminar;
    private JButton limpiar;
    
    private JTable tablaClientes;
    
    public VistaClientes() {
        
        //Creacion de la ventana
        setTitle("Gestion de Clientes");
        setSize(900, 600);
        setClosable(true);
        setLayout(new BorderLayout());
        
        // Colores que llevara el sistema
        Color negro = new Color(28, 28, 28);
        Color amarillo = new Color(255, 193, 7);
        Color grisAcero = new Color(73, 80, 87);
        Color grisClaro = new Color(233, 236, 239);
        
        //Esto permitira maximizar y minimizar la ventana interna
        setMaximizable(true);
        setIconifiable(true);
        setResizable(true);
        
        
        //Panel del formulario donde se organizaran y agruparan los datos de cliente
        JPanel formulario = new JPanel();
        formulario.setLayout(new GridLayout(6, 2, 10, 10));
        
        
        //Diseño del panel de datos con color
        formulario.setBackground(grisClaro);
        formulario.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));
        
        //Creacion de las campos donde se pondra informacion con colores
        idCliente = new JTextField();
        idCliente.setFont(new Font("Arial", Font.PLAIN, 15));
        rut = new JTextField();
        rut.setFont(new Font("Arial", Font.PLAIN, 15));
        nombre = new JTextField();
        nombre.setFont(new Font("Arial", Font.PLAIN, 15));
        apellido = new JTextField();
        apellido.setFont(new Font("Arial", Font.PLAIN, 15));
        telefono = new JTextField();
        telefono.setFont(new Font("Arial", Font.PLAIN, 15));
        email = new JTextField();
        email.setFont(new Font("Arial", Font.PLAIN, 15));
        
        //Donde se agregaran la informacion del formulario
        formulario.add(new JLabel("ID Cliente: "));
        formulario.add(idCliente);
        
        formulario.add(new JLabel("Rut: "));
        formulario.add(rut);
        
        formulario.add(new JLabel("Nombre: "));
        formulario.add(nombre);
        
        formulario.add(new JLabel("Apellido: "));
        formulario.add(apellido);
        
        formulario.add(new JLabel("Telefono: "));
        formulario.add(telefono);
        
        formulario.add(new JLabel("Email: "));
        formulario.add(email);
        
        //Agregamos los botones
        JPanel botones = new JPanel();
        
        guardar = new JButton("Guardar");
        guardar.setBackground(new Color(40, 167, 69));
        guardar.setForeground(Color.WHITE);
        guardar.setFont(new Font("Arial", Font.BOLD, 14));
        guardar.setPreferredSize(new Dimension(150, 40));
        
        modificar = new JButton("Modificar");
        modificar.setBackground(amarillo);
        modificar.setForeground(Color.BLACK);
        modificar.setFont(new Font("Arial", Font.BOLD, 14));
        modificar.setPreferredSize(new Dimension(150, 40));
        
        eliminar = new JButton("Eliminar");
        eliminar.setBackground(new Color(220, 53, 69));
        eliminar.setForeground(Color.WHITE);
        eliminar.setFont(new Font("Arial", Font.BOLD, 14));
        eliminar.setPreferredSize(new Dimension(150, 40));
        
        limpiar = new JButton("Limpiar");
        eliminar.setBackground(new Color(220, 53, 69));
        eliminar.setForeground(Color.WHITE);
        eliminar.setFont(new Font("Arial", Font.BOLD, 14));
        eliminar.setPreferredSize(new Dimension(150, 40));
        
        
        botones.add(guardar);
        botones.add(modificar);
        botones.add(eliminar);
        botones.add(limpiar);
        botones.setBackground(negro);
        
        //Creacion de la tabla donde se mostrara los clientes registrados
        String[] columnas = {
            "ID", "Rut", "Nombre",
            "Apellido", "Telefono", "Email"
        };
        
        
        //Aqui creamos una matriz vacia para los datos
        Object[][] datos = {};
        
        
        //Creacion de la tabla y su diseño de la tabla clientes
        tablaClientes = new JTable(datos, columnas);
        tablaClientes.setBackground(Color.WHITE);
        tablaClientes.setForeground(Color.BLACK);
        tablaClientes.setFont(new Font("Arial", Font.PLAIN, 14));
        tablaClientes.setRowHeight(30);
        
        //Diseño para los encabezados de la tabla
        tablaClientes.getTableHeader().setBackground(amarillo);
        tablaClientes.getTableHeader().setForeground(negro);
        tablaClientes.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        
        //Color de la fila seleccionada
        tablaClientes.setSelectionBackground(amarillo);
        tablaClientes.setSelectionForeground(negro);
        
        
        //Este codigo permitira desplazarnos por la tabla cuando existan muchos clientes registrados
        JScrollPane scroll = new JScrollPane(tablaClientes);
        
        //Crear panel para agrupar el encabezado y los datos
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());

        panelSuperior.add(formulario, BorderLayout.CENTER);

        //Agregar los paneles a la ventana
        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
        }
        
        
        
}
