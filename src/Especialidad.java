import java.util.List;
    public class Especialidad {
        private String NombreEspecialidad;
        private String descripcion;
        private List<String> asignaturas;
        private int duracionSemestres;

        // Constructor
        public Especialidad(String nombre, String descripcion, List<String> asignaturas, int duracionSemestres) {
            this.NombreEspecialidad = nombre;
            this.descripcion = descripcion;
            this.asignaturas = asignaturas;
            this.duracionSemestres = duracionSemestres;
        }

        // Getters y Setters
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

        // Metodo para agregar una asignatura a la especialidad
        public void agregarAsignatura(String asignatura) {
            this.asignaturas.add(asignatura);
        }

        // Metodo para mostrar información de la especialidad
        public void mostrarInformacion() {
            System.out.println("Especialidad: " + NombreEspecialidad);
            System.out.println("Descripción: " + descripcion);
            System.out.println("Duración en semestres: " + duracionSemestres);
            System.out.println("Asignaturas:");
            for (String asignatura : asignaturas) {
                System.out.println("- " + asignatura);
            }
        }
    }

