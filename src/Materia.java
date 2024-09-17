import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Materia {
    private String nombre;
    private String profesor;
    private String modalidad;
    private String horario;
    private static List<Materia> materias = new ArrayList<>();
    private List<Grupo> grupos = new ArrayList<>();


    public Materia(String nombre, String profesor, String modalidad, String horario) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.modalidad = modalidad;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public String getModalidad() {
        return modalidad;
    }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "\nnombre='" + nombre +
                "\nprofesor='" + profesor +
                "\nmodalidad='" + modalidad +
                "\nhorario='" + horario ;
    }

    public void mostrarDetalles() {
        System.out.println("Materia: " + nombre);
        System.out.println("Profesor: " + profesor);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("Horario: " + horario);

    }


    public static List<Materia> crearMateriasPorDefecto() {
        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Cálculo Integral", "Mario Martinez Cano", "Presencial", "8:00 - 9:00 AM"));
        materias.add(new Materia("Química", "Andrea Lagunes Soto", "Presencial", "10:00 - 11:00 AM"));
        materias.add(new Materia("Física", "Andres Lopez Hernandez", "Presencial", "1:00 - 2:00 PM"));
        materias.add(new Materia("Programación", "Senén Juarez Tinoco", "Presencial", "12:00 - 1:00 PM"));
        return materias;
    }
    public static void agregarMateria(List<Materia> materias, Scanner scanner) {
        System.out.println("\n--- Agregar Materia ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Profesor: ");
        String profesor = scanner.nextLine();
        System.out.print("Modalidad: ");
        String modalidad = scanner.nextLine();
        System.out.print("Horario: ");
        String horario = scanner.nextLine();
        materias.add(new Materia(nombre, profesor, modalidad, horario));
        System.out.println("Materia agregada exitosamente.");
    }
    public static void mostrarMaterias(List<Materia> materias) {
        if (materias.isEmpty()) {
            System.out.println("No hay materias disponibles.");
        } else {
            System.out.println("\n--- Lista de Materias ---");
            for (Materia materia : materias) {
                System.out.println(materia);
            }
        }
    }
    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
        grupo.getMaterias().add(this);
    }


}