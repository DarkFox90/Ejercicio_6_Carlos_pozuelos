public class Dron extends Equipo implements Imedible, IRegistrable {
    private String registrar;
    private String medir;

    public Dron(int id, String nombre, double consumo, String registrar, String medir) {
        super(nombre, id, consumo);
        this.registrar = registrar; 
        this.medir = medir;
    }

    @Override
    public String mide() {
        return "Este dron mide el tamaño del campo";
    }

    @Override
    public String registra() {
        return "Este dron registra: " + registrar;
    }

     @Override
    public String toString() {
        return "Dron ID=" + id
             + " | Nombre=" + nombre
             + " | Consumo=" + consumo + "W"
             + " | mide=" + medir
             + " | Registrar=" + registrar;
    }
    
}