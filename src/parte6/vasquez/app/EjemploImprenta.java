package parte6.vasquez.app;

import parte6.vasquez.app.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("Renzo","Vasquez"),"Ing. Software","Es demasiado gosu xd.");
        cv.addExperiencias("Java").addExperiencias("C#").addExperiencias("Base de Datos");

        Libro libro = new Libro(new Persona("Pepito Don Cirilo","Gago"), "Las excusas del placer.",Genero.DRAMA);
        libro.addPagina(new Pagina("Te pones mamado como JD."))
                .addPagina(new Pagina("Buscas a la ex JD."))
                .addPagina(new Pagina("La enamoras."))
                .addPagina(new Pagina("Le entierras tu JD."));

        Informe informe = new Informe(new Persona("Juan diego flores","Jara"),
                new Persona("Lizu","Style"), "Estudios en conservación de esperma.");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
