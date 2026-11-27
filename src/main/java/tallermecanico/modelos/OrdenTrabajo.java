package tallermecanico.modelos;

import java.util.ArrayList;
import java.util.Date;

public class OrdenTrabajo {

    private int idOrden;
    private Date fechaIngreso;
    private Date fechaEntrega;
    private String descripcionTrabajo;
    private String estado;
    private double costoTotal;
    private int idVehiculo; // ORDENTRABAJO - VEHICULO N:1
    private int idMecanico; // ORDENTRABAJO - MECANICO N:1
    private ArrayList<DetalleOrdenRepuesto> detalles;

    public OrdenTrabajo() {
        this.detalles = new ArrayList<>();
    }

    public OrdenTrabajo(int idOrden, Date fechaIngreso, Date fechaEntrega, String descripcionTrabajo, String estado, double costoTotal, int idVehiculo, int idMecanico) {
        this.idOrden = idOrden;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.descripcionTrabajo = descripcionTrabajo;
        this.estado = estado;
        this.costoTotal = costoTotal;
        this.idVehiculo = idVehiculo;
        this.idMecanico = idMecanico;
        this.detalles = new ArrayList<>();
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcionTrabajo() {
        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        this.descripcionTrabajo = descripcionTrabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    public ArrayList<DetalleOrdenRepuesto> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleOrdenRepuesto> detalles) {
        this.detalles = detalles;
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (DetalleOrdenRepuesto detalle : this.detalles) {
            total += detalle.calcularSubtotal();
        }
        this.costoTotal = total;
        return this.costoTotal;
    }

}
