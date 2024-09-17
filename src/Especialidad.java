import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Especialidad {
    private String NombreEspecialidad;
    private String descripcion;
    private List<String> asignaturas;
    private int duracionSemestres;

    public Especialidad(String nombre, String descripcion, List<String> asignaturas, int duracionSemestres) {
        this.NombreEspecialidad = nombre;
        this.descripcion = descripcion;
        this.asignaturas = asignaturas;
        this.duracionSemestres = duracionSemestres;
    }

    public String getNombre() {
        return NombreEspecialidad;
    }

    public void setNombre(String nombre) {
        this.NombreEspecialidad = nombre;
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

    public void agregarAsignatura(String asignatura) {
        this.asignaturas.add(asignatura);
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "\nNombreEspecialidad='" + NombreEspecialidad  +
                "\ndescripcion='" + descripcion +
                "\nasignaturas=" + asignaturas +
                "\nduracionSemestres=" + duracionSemestres ;
    }

    public static List<Especialidad> crearEspecialidadesEjemplo() {
        List<Especialidad> especialidades = new ArrayList<>();
        return especialidades;
    }

    public void mostrarInformacion() {
        System.out.println("Especialidad: " + NombreEspecialidad);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Duración en semestres: " + duracionSemestres);
        System.out.println("Asignaturas:");
        for (String asignatura : asignaturas) {
            System.out.println("- " + asignatura);
        }
    }
    public static void agregarEspecialidad(List<Especialidad> especialidades, Scanner scanner) {
        System.out.println("\n--- Agregar Especialidad ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Duración (semestres): ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto
        especialidades.add(new Especialidad(nombre, descripcion, new ArrayList<>(), duracion));
        System.out.println("Especialidad agregada exitosamente.");
    }

    public static void mostrarEspecialidades(List<Especialidad> especialidades) {
        if (especialidades.isEmpty()) {
            System.out.println("No hay especialidades disponibles.");
        } else {
            System.out.println("\n--- Lista de Especialidades ---");
            for (Especialidad especialidad : especialidades) {
                System.out.println(especialidad);
            }
        }
    }
}