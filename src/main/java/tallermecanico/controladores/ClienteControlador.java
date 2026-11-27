package tallermecanico.controladores;

import java.sql.SQLException;
import java.util.ArrayList;
import tallermecanico.dao.ClienteDAO;
import tallermecanico.modelos.Cliente;

public class ClienteControlador {

    private ArrayList<Cliente> clientes;
    private ClienteDAO clienteDAO;

    public ClienteControlador() {
        clientes = new ArrayList<>();
        clienteDAO = new ClienteDAO();
    }

    public boolean registrarCliente(Cliente cliente) throws SQLException {
        boolean registrado = clienteDAO.registrarCliente(cliente);

        if (registrado) {
            clientes.add(cliente);
        }
        return registrado;
    }

    /* public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Cliente> listarClientes() throws SQLException {
        this.clientes = clienteDAO.listarClientes();
        return this.clientes;
    }

    public Cliente obtenerCliente(int idCliente) {
        return clientes.get(idCliente);
    }

    public Cliente obtenerClientePorRut(String rutCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equals(rutCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean editarCliente(Cliente cliente) throws SQLException {
        return clienteDAO.actualizarCliente(cliente);
    }

    public boolean eliminarCliente(Cliente cliente) throws SQLException {
        boolean eliminado = clienteDAO.eliminarCliente(cliente.getIdUsuario());

        if (eliminado) {
            this.clientes.remove(cliente);
        }
        return eliminado;
    }*/
}
