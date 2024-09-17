import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {
    // atributos de mi clase alumnos
    private String numeroControl;
    private String nombre;
    private int edad;
    private double promedio;
    private String carrera;
    private String correoInstitucional;


    public Alumno(String numeroControl, String nombre, int edad, double promedio, String carrera, String correoInstitucional) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.carrera = carrera;
        this.correoInstitucional = correoInstitucional;
    }

    // Getters y Setters
    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public void mostrarInfo() {
        System.out.println("Número de Control: " + numeroControl);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Carrera: " + carrera);
        System.out.println("Correo Institucional: " + correoInstitucional);
    }

    @Override
    public String toString() {
        return "Alumno" +
                "numeroControl='" + numeroControl +
                "\nnombre='" + nombre +
                "\n edad=" + edad +
                "\n promedio=" + promedio +
                "\n carrera='" + carrera +
                " \ncorreoInstitucional='" + correoInstitucional ;

    }

    public static List<Alumno> crearAlumnosEjemplo() {
        List<Alumno> alumnos = new ArrayList<>();
        return alumnos;
    }

    public static void agregarAlumno(List<Alumno> alumnos, Scanner scanner) {
        System.out.println("\n--- Agregar Alumno ---");
        System.out.print("Número de Control: ");
        String numControl = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Promedio: ");
        double promedio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        alumnos.add(new Alumno(numControl, nombre, edad, promedio, carrera, correo));
        System.out.println("Alumno agregado exitosamente.");
    }
    public static void mostrarAlumnos(List<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos disponibles.");
        } else {
            System.out.println("\n--- Lista de Alumnos ---");
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }
}