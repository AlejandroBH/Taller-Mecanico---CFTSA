package tallermecanico.vistas;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VistaMecanicos extends JInternalFrame {

    private JTextField idMecanico;
    private JTextField rut;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField especialidad;

    private JButton guardar;
    private JButton modificar;
    private JButton eliminar;
    private JButton limpiar;

    private JTable tablaMecanicos;

    public VistaMecanicos() {

        // Configuracion de la ventana
        setTitle("Gestion de Mecanicos");
        setSize(750, 450);
        setClosable(true);
        setLayout(new BorderLayout());

        // Crear panel para ingresar los datos del mecanico
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(5, 2, 10, 10));

        // Crear la caja de textos
        idMecanico = new JTextField();
        rut = new JTextField();
        nombre = new JTextField();
        apellido = new JTextField();
        especialidad = new JTextField();

        // Agregar los componentes al panel de datos
        panelDatos.add(new JLabel("ID Mecanico: "));
        panelDatos.add(idMecanico);

        panelDatos.add(new JLabel("RUT: "));
        panelDatos.add(rut);

        panelDatos.add(new JLabel("Nombre: "));
        panelDatos.add(nombre);

        panelDatos.add(new JLabel("Apellido: "));
        panelDatos.add(apellido);

        panelDatos.add(new JLabel("Especialidad: "));
        panelDatos.add(especialidad);

        //Crear panel para los botones
        JPanel botones = new JPanel();

        // Crear los botones
        guardar = new JButton("Guardar");
        modificar = new JButton("Modificar");
        eliminar = new JButton("Eliminar");
        limpiar = new JButton("Limpiar");

        // Agregar los botones al panel
        botones.add(guardar);
        botones.add(modificar);
        botones.add(eliminar);
        botones.add(limpiar);

        // Crear tabla para mostrar los mecanicos registrados
        String[] columnas = {
            "ID", "RUT", "Nombre",
            "Apellido", "Especialidad"
        };
        
        //Aqui crearemos la tabla para mostrar los mecanicos registrados
        Object[][] datos = {};

        tablaMecanicos = new JTable(datos, columnas);

        JScrollPane scroll = new JScrollPane(tablaMecanicos);

        // Agregar los paneles a la ventana
        add(panelDatos, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
    }
}
