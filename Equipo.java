public abstract class Equipo implements java.lang.Comparable<Equipo> {
    protected int id;
    protected String nombre;
    protected double consumo;

    public Equipo(String nombre, int id, double consumo) {
        this.nombre = nombre;
        this.id = id;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getConsumo() {
        return consumo;
    }

    @Override
    public int compareTo(Equipo e) {
        return Double.compare(this.consumo, e.consumo);
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Consumo: " + consumo + "W";
    }
}
