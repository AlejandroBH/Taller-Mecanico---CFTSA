package tallermecanico.modelos;

public class DetalleOrdenRepuesto {

    private int idOrden;
    private int idRepuesto;
    private int cantidad;
    private double precioAplicado;

    public DetalleOrdenRepuesto() {
    }

    public DetalleOrdenRepuesto(int idOrden, int idRepuesto, int cantidad, double precioAplicado) {
        this.idOrden = idOrden;
        this.idRepuesto = idRepuesto;
        this.cantidad = cantidad;
        this.precioAplicado = precioAplicado;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioAplicado() {
        return precioAplicado;
    }

    public void setPrecioAplicado(double precioAplicado) {
        this.precioAplicado = precioAplicado;
    }

    public double calcularSubtotal() {
        return this.cantidad * this.precioAplicado;
    }
}
