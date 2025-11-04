import java.util.ArrayList;

public class Controlador {
    private ArrayList<Equipo> equipos;
    private Vista vista;

    public Controlador() {
        this.equipos = new ArrayList<>();
        this.vista = new Vista();
    }

    public void init() {
        equipos.add(new Dron(301, "Dron Meteorologico", 85.0, "datos meteorologicos", "tamaño de la tierra"));
        equipos.add(new Estacion(102, "Estacion rocosa", 12.0, "toma fotografías", "la fauna presente"));
        equipos.add(new Sensor(201, "Sensor termico", 3.5, "la temperatura ambiente", "envía datos a la base de datos de temperaturas"));
        equipos.add(new Dron(302, "Dron fotografico", 90.0, "fotografías del lugar", "la cantidad de cultivos"));
        equipos.add(new Estacion(103, "Estacion acuatica", 10.0, "da agua a los animales", "la hidratación de los animales"));
        equipos.add(new Sensor(202, "Sensor de movimiento", 4.2, "el movimiento de personas", "toma fotografías de las personas que pasan"));
        equipos.add(new Dron(303, "Dron Profesional", 60.0, "la calidad de los cultivos", "la salud de cada cultivo mediante camaras"));
        equipos.add(new Estacion(104, "Estacion de riego", 15.0, "riega las plantas", "la calidad de hidratacion"));
        equipos.add(new Sensor(203, "Sensor de sismos", 3.2, "el movimiento de la tierra", "alerta si hay un sismo"));
        equipos.add(new Dron(304, "Dron de riego", 110.0, "cuantas plantas regó", "cuanta agua necesita cada planta"));
    }

    public void sistema() {
        int salir = 5;
        int opcion = 0;

        while (opcion != salir) {
            vista.menu();
            String entrada = vista.pedirOpcion(0);

            try {
                opcion = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    vista.listarEquipo(equipos);
                    break;
                case 2:
                    String option = vista.pedirOpcion(0);
                    vista.buscarEquipo(equipos, option);
                    break;
                case 3:
                    ArrayList<Equipo> copia = new ArrayList<>(equipos);
                    Collections.sort(copia);
                    vista.listarEquipo(copia);
                    break;
                case salir:
                    vista.mostrarMensaje("gracias por utilizar el programa");
                    break;
                default:
                    vista.mostrarMensaje("opcion invalida");
            }
        }
    }
}
