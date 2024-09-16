import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombre;
    private String nivel;
    private List<Materia> materias;
    private static List<Grupo> grupos = new ArrayList<>();

    public Grupo(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", nivel='" + nivel + '\'' +
                ", materias=" + materias +
                '}';
    }

    public void mostrarDetalles() {
        System.out.println("Grupo: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Materias: ");
        if (materias.isEmpty()) {
            System.out.println("No hay materias asignadas.");
        } else {
            for (Materia materia : materias) {
                System.out.println("- " + materia);
            }
        }
    }

    public static void agregarGrupo(String nombre, String nivel) {
        Grupo nuevoGrupo = new Grupo(nombre, nivel);
        grupos.add(nuevoGrupo);
        System.out.println("Grupo agregado exitosamente: " + nombre);
    }

    public static void mostrarGrupos() {
        if (grupos.isEmpty()) {
            System.out.println("No hay grupos disponibles.");
        } else {
            for (Grupo grupo : grupos) {
                grupo.mostrarDetalles();
            }
        }
    }
}
