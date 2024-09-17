import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Alumno> alumnos = Alumno.crearAlumnosEjemplo();
        List<Materia> materias = Materia.crearMateriasPorDefecto();
        List<Especialidad> especialidades = Especialidad.crearEspecialidadesEjemplo();
        List<Catedraticos> catedraticos = Catedraticos.crearCatedraticosEjemplo();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Mostrar Alumnos");
            System.out.println("2. Agregar Alumno");
            System.out.println("3. Mostrar Materias");
            System.out.println("4. Agregar Materia");
            System.out.println("5. Mostrar Especialidades");
            System.out.println("6. Agregar Especialidad");
            System.out.println("7. Mostrar Catedráticos");
            System.out.println("8. Agregar Catedrático");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> Alumno.mostrarAlumnos(alumnos);
                case 2 -> {
                    Alumno.agregarAlumno(alumnos, scanner);
                    Alumno.mostrarAlumnos(alumnos);
                }
                case 3 -> Materia.mostrarMaterias(materias);
                case 4 -> {
                    Materia.agregarMateria(materias, scanner);
                    Materia.mostrarMaterias(materias);
                }
                case 5 -> Especialidad.mostrarEspecialidades(especialidades);
                case 6 -> {
                    Especialidad.agregarEspecialidad(especialidades, scanner);
                    Especialidad.mostrarEspecialidades(especialidades);
                }
                case 7 -> Catedraticos.mostrarCatedraticos(catedraticos);
                case 8 -> {
                    Catedraticos.agregarCatedratico(catedraticos, scanner);
                    Catedraticos.mostrarCatedraticos(catedraticos);
                }
                case 9 -> System.out.println("Saliendo");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 9);
    }

}