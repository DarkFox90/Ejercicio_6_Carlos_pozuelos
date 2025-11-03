public class Estacion extends Equipo implements IAccionable, IRegistrable, Imedible {
    private String accion;
    private String registrar;

    public Estacion(int id, String nombre, double consumo) {
        super(nombre, id, consumo);
        this.accion = "";
        this.registrar = "";

        
    }
    
}
