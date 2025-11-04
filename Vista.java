import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    private Scanner sc;

    public Vista() {
        sc = new Scanner(System.in);
    }

    //inicializacion de menú
    public void menu() {
        System.out.println("=== Catálogo de Equipos agronomos ===");
        System.out.println("1) Listar equipos (orden actual)");
        System.out.println("2) Buscar equipo (ID o nombre)");
        System.out.println("3) Listar por consumo (menor a mayor)");
        System.out.println("5) Salir");
        System.out.print("Seleccione una opción: ");
    }

    //metodo que utiliza scanner para pedir una opcion
    public String pedirOpcion(int opcion) {
        return sc.nextLine();
    }

    //metodo que lista los equipos sin importar el orden
    public void listarEquipo(ArrayList<Equipo> equipos) {
        if (equipos == null || equipos.isEmpty()) { //si no hay equipos o equipos está vacio devuelve un mensaje de error
            System.out.println("no hay equipos disponibles");
            return;
        }
        for (Equipo e : equipos) {
            System.out.println(e.toString()); //por cada equipo en Equipos muestra la información con toString()
        }
    }

    //metodo para buscar equipos 
    public void buscarEquipo(ArrayList<Equipo> equipos, String busqueda) {

        if (equipos == null || equipos.isEmpty()) {
            System.out.println("no hay equipos disponibles"); //si equipos está vacío retorna que no hay equipos disponibles
            return;
        }

        if (busqueda == null || busqueda.isBlank()) {
            System.out.println("debe ingresar que tipo de busqueda desea(nombre/id)"); // si el usuario no ingresa ni un numero ni ningun nombre devuelve que debe de buscar por id o nombre
            return;
        }

        boolean encontrado = false;

        //intenta convertir la busqueda a un numero por si el usuario ingresa el id
        //si no se logra con esto, se ignora la excecpción y se busca por nombre el equipo deseado
        int idBuscado = -1;
        try {
            idBuscado = Integer.parseInt(busqueda.trim());
        } catch (NumberFormatException e) {
            //como no es un numero se mantiene la busqueda por nombre
        }

        //for loop que recorre equipos y verifica con boolean si el geID coincide con el idBuscado o el nombre que el usuario ingresa
        for (Equipo e : equipos) {
            boolean coincideID = (e.getId() == idBuscado);
            boolean coincideNombre = e.getNombre().equalsIgnoreCase(busqueda);

            //si coincide nombre O Id devuelve el equipo buscado y cambia encontrado a true para finalizar el loop
            if(coincideID || coincideNombre) {
                System.out.println(e.toString());
                encontrado = true;
            }
        }

        //si no encuentra ningun equipo por id o nombre devuelve el mensaje
        if (!encontrado) {
            System.out.println("no se encontro ningun equipo");
        }
        
    }

    //metodo helper para mostrar un mensaje en controlador
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
