public class Sensor extends Equipo implements IAccionable, IRegistrable {
    private String registrar;
    private String accion;

    public Sensor(int id, String nombre, double consumo, String registrar, String accion) {
        super(nombre, id, consumo);
        this.registrar = registrar; 
        this.accion = accion;
    }

    @Override
    public String Accion() {
        return "Este sensor detecta: " + accion;
    }

    @Override
    public String registra() {
        return "Este dron registra: " + registrar;
    }

     @Override
    public String toString() {
        return "Sensor ID=" + id
             + " | Nombre=" + nombre
             + " | Consumo=" + consumo + "W"
             + " | Accion=" + accion
             + " | Registrar=" + registrar;
    }

}

