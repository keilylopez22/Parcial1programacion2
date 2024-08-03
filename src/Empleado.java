public class Empleado {

    private String nombre;
    private String puesto;
    private double salario;

    public void trabajar(){
        System.out.println("trabajando");
    }
    public void tomarOrden(){
        System.out.println("tomando Orden");

    }

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
}
