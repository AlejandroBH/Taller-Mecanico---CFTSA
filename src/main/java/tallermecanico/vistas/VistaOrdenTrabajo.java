package tallermecanico.vistas;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VistaOrdenTrabajo extends JInternalFrame {

    private JTextField idOrden;
    private JTextField idVehiculo;
    private JTextField idMecanico;
    private JTextField fechaIngreso;
    private JTextField fechaEntrega;
    private JTextField descripcionTrabajo;
    private JComboBox<String> estado;
    private JTextField costoTotal;

    private JTextField idRepuesto;
    private JTextField cantidad;
    private JTextField precioAplicado;

    private JButton agregarRepuesto;
    private JButton guardar;
    private JButton modificar;
    private JButton eliminar;
    private JButton limpiar;

    private JTable tablaOrdenes;
    private JTable tablaRepuestos;

    public VistaOrdenTrabajo() {

        //Configuracion de la ventana
        setTitle("Gestion de Ordenes de Trabajo");
        setSize(950, 650);
        setClosable(true);
        setLayout(new BorderLayout());

        //Crear panel para ingresar los datos de la orden
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(8, 2, 10, 10));

        //Crear las cajas de texto
        idOrden = new JTextField();
        idVehiculo = new JTextField();
        idMecanico = new JTextField();
        fechaIngreso = new JTextField();
        fechaEntrega = new JTextField();
        descripcionTrabajo = new JTextField();
        costoTotal = new JTextField();

        //Arreglo con los posibles estados de la orden
        String[] estados = {
            "Pendiente",
            "En proceso",
            "Finalizado",
            "Entregado"
        };

        estado = new JComboBox<>(estados);

        //Agregar los componentes al panel de datos
        panelDatos.add(new JLabel("ID Orden:"));
        panelDatos.add(idOrden);

        panelDatos.add(new JLabel("ID Vehiculo:"));
        panelDatos.add(idVehiculo);

        panelDatos.add(new JLabel("ID Mecanico:"));
        panelDatos.add(idMecanico);

        panelDatos.add(new JLabel("Fecha de Ingreso:"));
        panelDatos.add(fechaIngreso);

        panelDatos.add(new JLabel("Fecha de Entrega:"));
        panelDatos.add(fechaEntrega);

        panelDatos.add(new JLabel("Descripcion del Trabajo:"));
        panelDatos.add(descripcionTrabajo);

        panelDatos.add(new JLabel("Estado:"));
        panelDatos.add(estado);

        panelDatos.add(new JLabel("Costo Total:"));
        panelDatos.add(costoTotal);

        //Aqui se evitara que el usuaario modifique el costo total
        costoTotal.setEditable(false);

        //Crear panel para ingresar los repuestos utilizados
        JPanel panelRepuestos = new JPanel();
        panelRepuestos.setLayout(new GridLayout(4, 2, 10, 10));

        idRepuesto = new JTextField();
        cantidad = new JTextField();
        precioAplicado = new JTextField();

        agregarRepuesto = new JButton("Agregar Repuesto");

        //Agregar componentes al panel de repuestos
        panelRepuestos.add(new JLabel("ID Repuesto:"));
        panelRepuestos.add(idRepuesto);

        panelRepuestos.add(new JLabel("Cantidad:"));
        panelRepuestos.add(cantidad);

        panelRepuestos.add(new JLabel("Precio Aplicado:"));
        panelRepuestos.add(precioAplicado);

        panelRepuestos.add(new JLabel(""));
        panelRepuestos.add(agregarRepuesto);

        //Crear tabla de repuestos que se utilizaran en el vehiculo
        String[] columnasRepuestos = {
            "ID Orden", "ID Repuesto", "Cantidad",
            "Precio Aplicado", "Subtotal"
        };

        Object[][] datosRepuestos = {};

        tablaRepuestos = new JTable(
                datosRepuestos, columnasRepuestos);

        JScrollPane scrollRepuestos =
                new JScrollPane(tablaRepuestos);

        //Crear tabla para mostrar las ordenes registradas
        String[] columnasOrdenes = {
            "ID Orden", "ID Vehiculo", "ID Mecanico",
            "Fecha Ingreso", "Fecha Entrega",
            "Descripcion", "Estado", "Costo Total"
        };

        Object[][] datosOrdenes = {};

        tablaOrdenes = new JTable(
                datosOrdenes, columnasOrdenes);

        JScrollPane scrollOrdenes =
                new JScrollPane(tablaOrdenes);

        //Crear panel para ordenar las tablas
        JPanel panelTablas = new JPanel();
        panelTablas.setLayout(new GridLayout(2, 1, 10, 10));

        panelTablas.add(scrollRepuestos);
        panelTablas.add(scrollOrdenes);

        //Crear panel para los datos de la orden y repuestos
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());

        panelSuperior.add(panelDatos, BorderLayout.NORTH);
        panelSuperior.add(panelRepuestos, BorderLayout.CENTER);

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

        // Agregar los paneles a la ventana
        add(panelSuperior, BorderLayout.NORTH);
        add(panelTablas, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
    }
}
