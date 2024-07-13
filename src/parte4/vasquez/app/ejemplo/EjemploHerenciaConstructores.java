package parte4.vasquez.app.ejemplo;

import parte4.vasquez.app.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en común del tipo Persona: ");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno)persona).getInstitucion());
            System.out.println("Nota Matemática: " + ((Alumno)persona).getNotaMate());
            System.out.println("Nota Historia: " + ((Alumno)persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno)persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional)persona).getPais());
            }
            System.out.println("---------Sobre escritura promedio-------------");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("----------------------");
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor)persona).getAsignatura());
        }

        System.out.println("---------Sobre escritura saludar-------------");
        System.out.println(persona.saludar());

        System.out.println("----------------------");
    }


}
