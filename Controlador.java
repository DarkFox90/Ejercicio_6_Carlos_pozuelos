import java.util.ArrayList;
import java.util.Collections;

public class Controlador {
    private ArrayList<Equipo> equipos;
    private Vista vista;

    public Controlador() {
        this.equipos = new ArrayList<>();
        this.vista = new Vista();
    }

    //aqui se inicializan los 10 equipos diferentes
    public void init() {
        equipos.add(new Dron(1, "Dron Meteorologico", 85.0, "datos meteorologicos", "tamaño de la tierra"));
        equipos.add(new Estacion(2, "Estacion rocosa", 12.0, "toma fotografías", "la fauna presente"));
        equipos.add(new Sensor(3, "Sensor termico", 3.5, "la temperatura ambiente", "envía datos a la base de datos de temperaturas"));
        equipos.add(new Dron(4, "Dron fotografico", 90.0, "fotografías del lugar", "la cantidad de cultivos"));
        equipos.add(new Estacion(5, "Estacion acuatica", 10.0, "da agua a los animales", "la hidratación de los animales"));
        equipos.add(new Sensor(6, "Sensor de movimiento", 4.2, "el movimiento de personas", "toma fotografías de las personas que pasan"));
        equipos.add(new Dron(7, "Dron Profesional", 60.0, "la calidad de los cultivos", "la salud de cada cultivo mediante camaras"));
        equipos.add(new Estacion(8, "Estacion de riego", 15.0, "riega las plantas", "la calidad de hidratacion"));
        equipos.add(new Sensor(9, "Sensor de sismos", 3.2, "el movimiento de la tierra", "alerta si hay un sismo"));
        equipos.add(new Dron(10, "Dron de riego", 110.0, "cuantas plantas regó", "cuanta agua necesita cada planta"));
    }

    public void sistema() {
        int salir = 4;
        int opcion = 0;

        while (opcion != salir) {
            vista.menu();
            String entrada = vista.pedirOpcion(0);

            //intenta convertir la entrada a numero, si el usuario escribe otra cosa asigna 0 para evitar cualquiqer error
            try {
                opcion = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    vista.listarEquipo(equipos); //lista los equipos en desorden
                    break;
                case 2:
                    String option = vista.pedirOpcion(0);
                    vista.buscarEquipo(equipos, option);
                    break;
                case 3:
                    ArrayList<Equipo> copia = new ArrayList<>(equipos); //crea una copia del arraylist original para modificarla en orden de menor a mayor consumo
                    Collections.sort(copia);
                    vista.listarEquipo(copia);
                    break;
                case 4:
                    vista.mostrarMensaje("gracias por utilizar el programa");
                    break;
                default:
                    vista.mostrarMensaje("opcion invalida");
            }
        }
    }
}
