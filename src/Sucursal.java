public class Sucursal {

    private String nombre;
    private String direcion;

    public void agregarEmpleado(){
        System.out.println("agregando empleado");

    }

    public void agregarEquipo(){
        System.out.println("agregando Equipo");
    }

    public void  agregarEspecialidad(){
        System.out.println("postres");
    }

    public Sucursal(String nombre, String direcion) {
        this.nombre = nombre;
        this.direcion = direcion;
    }
}
