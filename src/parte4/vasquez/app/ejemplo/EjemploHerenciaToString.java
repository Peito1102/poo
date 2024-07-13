package parte4.vasquez.app.ejemplo;

import parte4.vasquez.app.Alumno;
import parte4.vasquez.app.AlumnoInternacional;
import parte4.vasquez.app.Persona;
import parte4.vasquez.app.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("JD","Flores",13,"Instituto Nacional");
        alumno.setNotaMate(5.5);
        alumno.setNotaCastellano(6.3);
        alumno.setNotaHistoria(4.9);
        alumno.setEmail("jd@hotmail.com");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(8.0);
        alumnoInt.setNotaMate(5.1);
        alumnoInt.setNotaCastellano(7.9);
        alumnoInt.setNotaHistoria(4.4);
        alumno.setEmail("peterG@hotmail.com");


        Profesor profe = new Profesor("Renzo","Vasquez","Matemáticas");
        profe.setEdad(37);
        profe.setEmail("renV@gmail.com");


        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getInstitucion());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getInstitucion() + " " + alumnoInt.getPais());

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profe);

    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
    }


}
