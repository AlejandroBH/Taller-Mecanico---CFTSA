package tallermecanico.modelos;

public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motocicleta(int idVehiculo, String patente, String marca, String modelo, int anio, int kilometraje, int idCliente, int cilindrada) {
        super(idVehiculo, patente, marca, modelo, anio, kilometraje, idCliente);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void getTipo() {
        System.out.println("TODO: Obtener tipo");
    }

}
