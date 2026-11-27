package tallermecanico.modelos;

public class Vehiculo {

    protected int idVehiculo;
    protected String patente;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected int kilometraje;
    protected int idCliente; // VEHICULO - CLIENTE N:1

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String patente, String marca, String modelo, int anio, int kilometraje, int idCliente) {
        this.idVehiculo = idVehiculo;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.idCliente = idCliente;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void getTipo() {
        System.out.println("TODO: Obtener tipo");
    }

    public String mostrarFicha() {
        return "TODO: Informacion ficha";
    }

}
