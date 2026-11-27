package tallermecanico.modelos;

public class Mecanico {

    private int idMecanico;
    private String rut;
    private String nombre;
    private String apellido;
    private String especialidad;
    private int idUsuario; // USUARIO - MECANICO 1:1

    public Mecanico() {
    }

    public Mecanico(int idMecanico, String rut, String nombre, String apellido, String especialidad, int idUsuario) {
        this.idMecanico = idMecanico;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.idUsuario = idUsuario;
    }

    public int getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

}
