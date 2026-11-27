package tallermecanico.principal;

import java.sql.SQLException;
import tallermecanico.controladores.ClienteControlador;
import tallermecanico.modelos.Cliente;
import tallermecanico.vistas.VistaMenuPrincipal;

public class TallerMecanico {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");

        /*
        Tareas Lunes 23:
        Pablo: crea las vistas (la rubrica exige 4 vistas como minimo)
        Pablo: crea conexion a la DB con JDBC
        Alejandro: crea los modelos basandose en el diagrama de clases (DC)
        Alejandro: crea script para la base de datos basandose en diagrama (MR)
         */
 /*
        nombre db para conexion jdbc: taller_mecanico
        clave de conexion: Analista26.
         */
        // Test DAO cliente
     /*   Cliente clientePrueba = new Cliente(2, "12.456.789-9", "Prueba 1", "Prueba 1", "+56974127412", "prueba1@hola.cl");
        ClienteControlador clienteControlador = new ClienteControlador();

        clienteControlador.registrarCliente(clientePrueba);*/
        
        
        
        VistaMenuPrincipal menu = new VistaMenuPrincipal();
        menu.setVisible(true);
    }

}
