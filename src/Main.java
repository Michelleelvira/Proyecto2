import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Especialidad> especialidades = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    menuEspecialidad(); // Llama al submenú de especialidad
                    break;
                case 2:
                    menuAlumnos(); // Espacio para el submenú de alumnos
                    break;
                case 3:
                    menuCatedraticos(); // Espacio para el submenú de catedráticos
                    break;
                case 4:
                    menuMaterias(); // Espacio para el submenú de materias
                    break;
                case 5:
                    menuGrupo(); // Espacio para el submenú de grupo
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while (opcion != 6);
    }

    // Menú principal
    private static void mostrarMenuPrincipal() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Especialidad");
        System.out.println("2. Alumnos");
        System.out.println("3. Catedráticos");
        System.out.println("4. Materias");
        System.out.println("5. Grupo");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
    }

    // Submenú de Especialidad
    private static void menuEspecialidad() {
        int opcion;

        do {
            mostrarMenuEspecialidad();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarEspecialidad();
                    break;
                case 2:
                    mostrarEspecialidades();
                    break;
                case 3:
                    modificarEspecialidad();
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    // Menú Especialidad
    private static void mostrarMenuEspecialidad() {
        System.out.println("\n--- Menú de Especialidad ---");
        System.out.println("1. Agregar Especialidad");
        System.out.println("2. Mostrar Especialidades");
        System.out.println("3. Modificar Especialidad");
        System.out.println("4. Regresar al Menú Principal");
        System.out.print("Elige una opción: ");
    }

    // Métodos para manejar especialidades (agregar, mostrar, modificar) ya implementados
    private static void agregarEspecialidad() {
        System.out.print("Ingrese el nombre de la especialidad: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese una descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese la duración en semestres: ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        List<String> asignaturas = new ArrayList<>();
        String asignatura;

        // Ciclo para agregar asignaturas a la especialidad
        do {
            System.out.print("Ingrese una asignatura (o 'salir' para finalizar): ");
            asignatura = scanner.nextLine();
            if (!asignatura.equalsIgnoreCase("salir")) {
                asignaturas.add(asignatura);
            }
        } while (!asignatura.equalsIgnoreCase("salir"));

        Especialidad nuevaEspecialidad = new Especialidad(nombre, descripcion, asignaturas, duracion);
        especialidades.add(nuevaEspecialidad);

        System.out.println("Especialidad agregada exitosamente.");
    }

    private static void mostrarEspecialidades() {
        if (especialidades.isEmpty()) {
            System.out.println("No hay especialidades registradas.");
        } else {
            System.out.println("\n--- Especialidades Registradas ---");
            for (Especialidad especialidad : especialidades) {
                especialidad.mostrarInformacion();
                System.out.println(); // Espacio entre especialidades
            }
        }
    }

    private static void modificarEspecialidad() {
        if (especialidades.isEmpty()) {
            System.out.println("No hay especialidades registradas para modificar.");
            return;
        }

        System.out.println("\n--- Modificar Especialidad ---");
        mostrarEspecialidades();

        System.out.print("Seleccione el número de la especialidad a modificar (0 para cancelar): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        if (index > 0 && index <= especialidades.size()) {
            Especialidad especialidad = especialidades.get(index - 1);

            System.out.print("Ingrese el nuevo nombre (actual: " + especialidad.getNombre() + "): ");
            String nuevoNombre = scanner.nextLine();
            if (!nuevoNombre.isEmpty()) {
                especialidad.setNombre(nuevoNombre);
            }

            System.out.print("Ingrese la nueva descripción (actual: " + especialidad.getDescripcion() + "): ");
            String nuevaDescripcion = scanner.nextLine();
            if (!nuevaDescripcion.isEmpty()) {
                especialidad.setDescripcion(nuevaDescripcion);
            }

            System.out.print("Ingrese la nueva duración en semestres (actual: " + especialidad.getDuracionSemestres() + "): ");
            int nuevaDuracion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            especialidad.setDuracionSemestres(nuevaDuracion);

            System.out.println("Especialidad modificada exitosamente.");
        } else {
            System.out.println("Operación cancelada.");
        }
    }

    // Métodos de menú para otras secciones, pendientes de implementar
    private static void menuAlumnos() {
        System.out.println("Aquí irá el submenú de Alumnos.");
    }

    private static void menuCatedraticos() {
        System.out.println("Aquí irá el submenú de Catedráticos.");
    }

    private static void menuMaterias() {
        System.out.println("Aquí irá el submenú de Materias.");
    }

    private static void menuGrupo() {
        System.out.println("Aquí irá el submenú de Grupo.");
    }
}
