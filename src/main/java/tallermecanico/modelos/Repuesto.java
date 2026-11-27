package tallermecanico.modelos;

public class Repuesto {

    private int idRepuesto;
    private String nombre;
    private int stock;
    private double precioUnitario;

    public Repuesto() {
    }

    public Repuesto(int idRepuesto, String nombre, int stock, double precioUnitario) {
        this.idRepuesto = idRepuesto;
        this.nombre = nombre;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}
