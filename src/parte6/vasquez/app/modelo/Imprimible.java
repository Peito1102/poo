package parte6.vasquez.app.modelo;

public interface Imprimible {
    /*el default es para que la funcion sea opcional
    para las clases que lo implementen pero necesitaras que la funcion tenga un cuerpo.*/
    default String imprimir(){
        return "Imprimiendo un valor por defecto.";
    };
}
