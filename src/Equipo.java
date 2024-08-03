public class Equipo {

    private String tipo;
    private String estado;

    public void encender(){
        System.out.println("encendido");

    }
    public void apagar(){
        System.out.println("apagado");

    }

    public  void reparar(){
        System.out.println("reparado");
    }

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }
}
