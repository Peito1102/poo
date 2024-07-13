package parte4.vasquez.app;

public class Alumno extends Persona {
    private String institucion;
    private double notaMate;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre,apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre,apellido,edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaCastellano, double notaMate, double notaHistoria) {
        super(nombre,apellido,edad);
        this.institucion = institucion;
        this.notaCastellano = notaCastellano;
        this.notaMate = notaMate;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        return "Hola que tal, soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio() {
        return (notaHistoria + notaCastellano + notaMate)/3;
    }

    @Override
    public String toString() {
        return  super.toString() + "\ninstitucion='" + institucion + '\'' +
                ", notaMate=" + notaMate +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio: " + this.calcularPromedio();
    }
}
