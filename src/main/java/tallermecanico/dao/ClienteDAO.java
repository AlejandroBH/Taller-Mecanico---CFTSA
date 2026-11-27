package tallermecanico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tallermecanico.conexion.ConexionBD;
import tallermecanico.modelos.Cliente;

public class ClienteDAO {

    public boolean registrarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente(rut, nombre, apellido, telefono, email) VALUES (?, ?, ?, ?, ?)";
        try (
                Connection conexion = ConexionBD.conectar();
                PreparedStatement consulta = conexion.prepareStatement(
                sql,
                Statement.RETURN_GENERATED_KEYS
        )) {
            // Asignamos los datos a los parámetros de la consulta.
            consulta.setString(1, cliente.getRut());
            consulta.setString(2, cliente.getNombre());
            consulta.setString(3, cliente.getApellido());
            consulta.setString(4, cliente.getTelefono());
            consulta.setString(5, cliente.getEmail());

            // Ejecutamos el INSERT.
            int filasInsertadas = consulta.executeUpdate();

            if (filasInsertadas == 1) {

                // Recuperamos el ID generado por MySQL.
                try (ResultSet resultado = consulta.getGeneratedKeys()) {
                    if (resultado.next()) {
                        cliente.setIdCliente(resultado.getInt(1));
                    }
                }
                return true;
            }
            return false;
        }
    }

    /*
    public ArrayList<Cliente> listarClientes() throws SQLException {
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql = "SELECT id_dueno, nombre, rut, telefono "
                   + "FROM dueno ORDER BY id_dueno";
        try (
            Connection conexion = ConexionBD.conectar();
            PreparedStatement consulta = conexion.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery()
        ) {
            while (resultado.next()) {
                Cliente cliente = new Cliente(
                    resultado.getString("nombre"),
                    resultado.getString("rut"),
                    resultado.getString("telefono")
                );
                cliente.setIdDueno(resultado.getInt("id_dueno"));
                lista.add(cliente);
            }
        }
        return lista;
    }
    public boolean actualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE dueno "
                   + "SET nombre = ?, rut = ?, telefono = ? "
                   + "WHERE id_dueno = ?";

        try (
            Connection conexion = ConexionBD.conectar();
            PreparedStatement consulta = conexion.prepareStatement(sql)
        ) {
            consulta.setString(1, cliente.getNombre());
            consulta.setString(2, cliente.getRut());
            consulta.setString(3, cliente.getTelefono());
            consulta.setInt(4, cliente.getIdDueno());

            int filasActualizadas = consulta.executeUpdate();

            return filasActualizadas == 1;
        }
    }
    public boolean eliminarCliente(int idDueno) throws SQLException {
        String sqlMascotas = "DELETE FROM mascota WHERE id_dueno = ?";
        String sqlDueno = "DELETE FROM dueno WHERE id_dueno = ?";
        try (Connection conexion = ConexionBD.conectar()) {
            conexion.setAutoCommit(false);
            try (
                PreparedStatement eliminarMascotas =
                        conexion.prepareStatement(sqlMascotas);
                PreparedStatement eliminarDueno =
                        conexion.prepareStatement(sqlDueno)
            ) {
                eliminarMascotas.setInt(1, idDueno);
                eliminarMascotas.executeUpdate();
                eliminarDueno.setInt(1, idDueno);
                int filasEliminadas = eliminarDueno.executeUpdate();
                if (filasEliminadas == 1) {
                    conexion.commit();
                    return true;
                }
                conexion.rollback();
                return false;
            } catch (SQLException ex) {
                conexion.rollback();
                throw ex;
            }
        }
    }*/
}
