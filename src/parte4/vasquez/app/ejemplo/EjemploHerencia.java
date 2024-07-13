package parte4.vasquez.app.ejemplo;

import parte4.vasquez.app.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("JD");
        alumno.setApellido("Flores");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaMate(5.5);
        alumno.setNotaCastellano(6.3);
        alumno.setNotaHistoria(4.9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(8.0);
        alumnoInt.setNotaMate(5.1);
        alumnoInt.setNotaCastellano(7.9);
        alumnoInt.setNotaHistoria(4.4);


        Profesor profe = new Profesor();
        profe.setNombre("Renzo");
        profe.setApellido("Vasquez");
        profe.setAsignatura("Matemáticas");



        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getInstitucion());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getInstitucion() + " " + alumnoInt.getPais());
        System.out.println("Profesor " + profe.getAsignatura() + ": " + profe.getNombre() + " " + profe.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }



    }
}
