public abstract class Equipo implements java.lang.Comparable<Equipo> { //clase abstracta que implementa Comparable para hacer la comparacion de consumo electrico
    //atributos protegidos para que las clases hijas las puedan utilizar
    protected int id;
    protected String nombre;
    protected double consumo;

    public Equipo(String nombre, int id, double consumo) {
        this.nombre = nombre;
        this.id = id;
        this.consumo = consumo;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getConsumo() {
        return consumo;
    }

    //permite ordenar los equipos por consumo cuando se utiliza Collections.sort(), de menor a mayor consumo
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
