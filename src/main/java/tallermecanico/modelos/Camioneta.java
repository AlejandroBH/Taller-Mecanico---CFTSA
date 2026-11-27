package tallermecanico.modelos;

public class Camioneta extends Vehiculo {

    private double capacidadCarga;

    public Camioneta() {
    }

    public Camioneta(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Camioneta(int idVehiculo, String patente, String marca, String modelo, int anio, int kilometraje, int idCliente, double capacidadCarga) {
        super(idVehiculo, patente, marca, modelo, anio, kilometraje, idCliente);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void getTipo() {
        System.out.println("TODO: Obtener tipo");
    }

}
