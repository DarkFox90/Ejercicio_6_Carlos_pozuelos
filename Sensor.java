public class Sensor extends Equipo implements IAccionable, IRegistrable {
    private String registrar;
    private String accion;

    public Sensor(int id, String nombre, double consumo, String registrar, String accion) {
        super(nombre, id, consumo); //super para inicializar el constructor con los atributos de Equipo
        this.registrar = registrar; 
        this.accion = accion;
    }

    //interfaces de accion y registrar para hacer herencia multiple de metodos
    @Override
    public String Accion() {
        return "Este sensor detecta: " + accion;
    }

    @Override
    public String registra() {
        return "Este sensor registra: " + registrar;
    }

     @Override
    public String toString() {
        return "Sensor ID = " + id
             + " | Nombre = " + nombre
             + " | Consumo = " + consumo + "W"
             + " | Accion = " + accion
             + " | Registra = " + registrar;
    }

}

