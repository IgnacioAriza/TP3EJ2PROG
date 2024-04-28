public class Empleado {
    private String nombre;
    private Empleado supervisor;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void asignarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public String obtenerNombreSupervisor() {
        if (supervisor != null) {
            return supervisor.nombre;
        } else {
            return "Sin supervisor";
        }
    }
}