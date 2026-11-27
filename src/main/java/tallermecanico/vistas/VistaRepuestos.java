package tallermecanico.vistas;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VistaRepuestos extends JInternalFrame {

    private JTextField idRepuesto;
    private JTextField nombre;
    private JTextField stock;
    private JTextField precioUnitario;

    private JButton guardar;
    private JButton modificar;
    private JButton eliminar;
    private JButton limpiar;

    private JTable tablaRepuestos;

    public VistaRepuestos() {

        //Configuracion de la ventana
        setTitle("Gestion de Repuestos");
        setSize(750, 400);
        setClosable(true);
        setLayout(new BorderLayout());

        //Crear panel para ingresar los datos del repuesto
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(4, 2, 10, 10));

        //Crear las cajas de texto
        idRepuesto = new JTextField();
        nombre = new JTextField();
        stock = new JTextField();
        precioUnitario = new JTextField();

        //Agregar los componentes al panel de datos
        panelDatos.add(new JLabel("ID Repuesto:"));
        panelDatos.add(idRepuesto);

        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(nombre);

        panelDatos.add(new JLabel("Stock:"));
        panelDatos.add(stock);

        panelDatos.add(new JLabel("Precio Unitario:"));
        panelDatos.add(precioUnitario);

        //Crear panel para los botones
        JPanel botones = new JPanel();

        //Crear los botones
        guardar = new JButton("Guardar");
        modificar = new JButton("Modificar");
        eliminar = new JButton("Eliminar");
        limpiar = new JButton("Limpiar");

        //Agregar los botones al panel
        botones.add(guardar);
        botones.add(modificar);
        botones.add(eliminar);
        botones.add(limpiar);

        //Crear tabla para mostrar los repuestos registrados
        String[] columnas = {
            "ID", "Nombre", "Stock", "Precio Unitario"
        };

        Object[][] datos = {};

        tablaRepuestos = new JTable(datos, columnas);

        JScrollPane scroll = new JScrollPane(tablaRepuestos);

        // Agregar los paneles a la ventana
        add(panelDatos, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
    }
}