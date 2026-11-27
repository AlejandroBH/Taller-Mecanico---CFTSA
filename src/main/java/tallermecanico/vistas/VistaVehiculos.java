package tallermecanico.vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class VistaVehiculos extends JInternalFrame {
    
    private JTextField idVehiculo;
    private JTextField idCliente;
    private JTextField patente;
    private JTextField marca;
    private JTextField modelo;
    private JTextField anio;
    private JTextField kilometraje;
    
    private JComboBox<String> tipoVehiculo;
    
    private JTextField numeroPuertas;
    private JTextField capacidadCarga;
    private JTextField cilindrada;
    
    private JButton guardar;
    private JButton modificar;
    private JButton eliminar;
    private JButton limpiar;
    
    private JTable tablaVehiculos;
    
    public VistaVehiculos() {
        
        //Configuracion de la ventana
        setTitle("Gestion de Vehiculos");
        setSize(900 , 600);
        setClosable(true);
        setLayout(new BorderLayout());
        
        //Panel para ordenar los datos
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(11, 2, 10, 10));
        
        //Crear las cajas de texto
        idVehiculo = new JTextField();
        idCliente = new JTextField();
        patente = new JTextField();
        marca = new JTextField();
        modelo = new JTextField();
        anio = new JTextField();
        kilometraje = new JTextField();
        
        numeroPuertas = new JTextField();
        capacidadCarga = new JTextField();
        cilindrada = new JTextField();
        
        //crear la lista para la seleccionde tipo de vehiculo
        String[] tipos = {
            "Automovil",
            "Motocicleta",
            "Camioneta"
        };
         tipoVehiculo = new JComboBox<>(tipos);
         
         //Agregar los componentes al panel de datos del vehiculo
         panelDatos.add(new JLabel("ID Vehiculo: "));
         panelDatos.add(idVehiculo);
         
         panelDatos.add(new JLabel("ID Cliente: "));
         panelDatos.add(idCliente);
         
         panelDatos.add(new JLabel("Patente: "));
         panelDatos.add(patente);
         
         panelDatos.add(new JLabel("Marca: "));
         panelDatos.add(marca);
         
         panelDatos.add(new JLabel("Modelo: "));
         panelDatos.add(modelo);
         
         panelDatos.add(new JLabel("Año: "));
         panelDatos.add(anio);
         
         panelDatos.add(new JLabel("Kilometraje: "));
         panelDatos.add(kilometraje);
         
         panelDatos.add(new JLabel("Tipo de vehiculo: "));
         panelDatos.add(tipoVehiculo);
         
         panelDatos.add(new JLabel("Numero de puertas: "));
         panelDatos.add(numeroPuertas);
         
         panelDatos.add(new JLabel("Capacidad de carga: "));
         panelDatos.add(capacidadCarga);
         
         panelDatos.add(new JLabel("Cilindrada: "));
         panelDatos.add(cilindrada);
         
         //Panel para ordenar los botones
         JPanel botones = new JPanel();
         
         //Creacion de los botones
         guardar = new JButton("Guardar");
         modificar = new JButton("Modificar");
         eliminar = new JButton("Eliminar");
         limpiar = new JButton("Limpiar");
         
         //Agregar los botones al panel
         botones.add(guardar);
         botones.add(modificar);
         botones.add(eliminar);
         botones.add(limpiar);
         
         //Aqui se creara una tabla para mostrar los vehiculos registrados
         String[] columnas = {
             "ID", "ID Cliente", "Patente",
             "Marca", "Modelo", "Año",
             "Kilometraje", "Tipo", "Puertas",
             "Carga", "Cilindrada"
};
         Object[][] datos = {};
         
         tablaVehiculos = new JTable(datos, columnas);
         
         JScrollPane scroll = new JScrollPane(tablaVehiculos);
         
         //Agregar los paneles a la ventana
         add(panelDatos, BorderLayout.NORTH);
         add(scroll, BorderLayout.CENTER);
         add(botones, BorderLayout.SOUTH);
}
}