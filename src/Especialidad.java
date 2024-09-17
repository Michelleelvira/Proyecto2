import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Especialidad {
    private String nombreEspecialidad;
    private String descripcion;
    private List<String> asignaturas;
    private int duracionSemestres;

    // Constructor
    public Especialidad(String nombre, String descripcion, List<String> asignaturas, int duracionSemestres) {
        this.nombreEspecialidad = nombre;
        this.descripcion = descripcion;
        this.asignaturas = asignaturas;
        this.duracionSemestres = duracionSemestres;
    }

    // Getters y Setters
    public String getNombre() {
        return nombreEspecialidad;
    }

    public void setNombre(String nombre) {
        this.nombreEspecialidad = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getDuracionSemestres() {
        return duracionSemestres;
    }

    public void setDuracionSemestres(int duracionSemestres) {
        this.duracionSemestres = duracionSemestres;
    }

    // Metodo para agregar una asignatura a la especialidad
    public void agregarAsignatura(String asignatura) {
        this.asignaturas.add(asignatura);
    }

    // Metodo para mostrar información de la especialidad
    public void mostrarInformacion() {
        System.out.println("Especialidad: " + nombreEspecialidad);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Duración en semestres: " + duracionSemestres);
        System.out.println("Asignaturas:");
        for (String asignatura : asignaturas) {
            System.out.println("- " + asignatura);
        }
    }

    // Sobreescritura del metodo toString para mostrar la información de la especialidad
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Especialidad: ").append(nombreEspecialidad).append("\n")
                .append("Descripción: ").append(descripcion).append("\n")
                .append("Duración en semestres: ").append(duracionSemestres).append("\n")
                .append("Asignaturas: ");

        if (asignaturas.isEmpty()) {
            sb.append("No hay asignaturas registradas.");
        } else {
            for (String asignatura : asignaturas) {
                sb.append("\n- ").append(asignatura);
            }
        }

        return sb.toString();
    }

    // Metodo estático para agregar una especialidad
    public static Especialidad agregarEspecialidad(Scanner scanner) {
        System.out.println("\n--- Agregar Especialidad ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Duración (semestres): ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        // Crear y devolver la nueva especialidad
        return new Especialidad(nombre, descripcion, new ArrayList<>(), duracion);
    }
}