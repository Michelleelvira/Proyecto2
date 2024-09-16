import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private String profesor;
    private String modalidad;
    private String horario;
    private static List<Materia> materias = new ArrayList<>();


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
                "nombre='" + nombre + '\'' +
                ", profesor='" + profesor + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }

    public void mostrarDetalles() {

    }


    public static List<Materia> crearMateriasPorDefecto() {
        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Cálculo Integral", "Mario Martinez Cano", "Presencial", "8:00 - 9:00 AM"));
        materias.add(new Materia("Química", "Andrea Lagunes Soto", "Presencial", "10:00 - 11:00 AM"));
        materias.add(new Materia("Física", "Andres Lopez Hernandez", "Presencial", "1:00 - 2:00 PM"));
        materias.add(new Materia("Programación", "Senén Juarez Tinoco", "Presencial", "12:00 - 1:00 PM"));
        return materias;
    }
    public static void agregarMateria(String nombre, String profesor, String modalidad, String horario) {
        Materia nuevaMateria = new Materia(nombre, profesor, modalidad, horario);
        materias.add(nuevaMateria);
        System.out.println("Materia agregada exitosamente: " + nombre);
    }

    public static void mostrarMaterias() {
        for (Materia materia : materias) {
            materia.mostrarDetalles();
        }
    }

}