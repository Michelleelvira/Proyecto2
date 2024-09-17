public class Alumno {
    // atributos de mi clase alumnos
    private String numeroControl;
    private String nombre;
    private int edad;
    private double promedio;
    private String carrera;
    private String correoInstitucional;

    // Constructores
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

    // Metodo para mostrar la info del alumno
    public void mostrarInfo() {
        System.out.println("Número de Control: " + numeroControl);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Carrera: " + carrera);
        System.out.println("Correo Institucional: " + correoInstitucional);
    }

    // tostring
    @Override
    public String toString() {
        return "Número de Control: " + numeroControl + ", Nombre: " + nombre + ", Edad: " + edad +
                ", Promedio: " + promedio + ", Carrera: " + carrera + ", CorreoInstitcional: " + correoInstitucional;
    }
}
