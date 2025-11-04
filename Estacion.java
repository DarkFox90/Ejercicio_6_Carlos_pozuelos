public class Estacion extends Equipo implements IAccionable, IRegistrable, Imedible {
    private String accion;
    private String registrar;

    public Estacion(int id, String nombre, double consumo, String accion, String registrar) {
        super(nombre, id, consumo); //super para obtener los atributos de Equipo
        this.accion = accion;
        this.registrar = registrar; 
    }

    //interfaces de accion, medir y registrar para hacer herencia multiple de metodos
    @Override
    public String Accion() {
        return "Esta estación realiza la siguiente accion: " + accion;
    }

    @Override
    public String mide() {
        return "Esta estación mide el tamaño del campo";
    }

    @Override
    public String registra() {
        return "Esta estación registra: " + registrar;
    }

     @Override
    public String toString() {
        return "Estacion ID= " + id
             + " | Nombre = " + nombre
             + " | Consumo = " + consumo + "W"
             + " | Accion = " + accion
             + " | Registra = " + registrar;
    }
}
