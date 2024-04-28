public class Main{
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos");
        Empleado empleado2 = new Empleado("Pablo");

        empleado1.asignarSupervisor(empleado2);

        System.out.println("El supervisor de " + empleado1.getNombre() + " es: " + empleado1.obtenerNombreSupervisor());
    }
}
