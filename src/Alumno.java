
import java.util.Scanner;

public class Alumno {
    private String numControl;
    private String nombre;
    private int edad;
    private double promedio;
    private String carrera;
    private String correo;

    // Constructor
    public Alumno(String numControl, String nombre, int edad, double promedio, String carrera, String correo) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.carrera = carrera;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Número de Control: " + numControl +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nPromedio: " + promedio +
                "\nCarrera: " + carrera +
                "\nCorreo: " + correo;
    }

    // Métdo para agregar un alumno
    public static Alumno agregarAlumno(Scanner scanner) {
        System.out.println("\n--- Agregar Alumno ---");
        System.out.print("Número de Control: ");
        String numControl = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Promedio: ");
        double promedio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        return new Alumno(numControl, nombre, edad, promedio, carrera, correo);
    }
}
