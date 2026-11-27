package tallermecanico.modelos;

public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil() {
    }

    public Automovil(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Automovil(int idVehiculo, String patente, String marca, String modelo, int anio, int kilometraje, int idCliente, int numeroPuertas) {
        super(idVehiculo, patente, marca, modelo, anio, kilometraje, idCliente);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void getTipo() {
        System.out.println("TODO: Obtener tipo");
    }

}
