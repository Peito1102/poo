package parte8.vasquez.app.genericsclass;

import part1.vasquez.app.Main;

import java.util.ArrayList;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);
        System.out.println();

        Camion<Maquinaria> trasporteMaquinaria = new Camion<>(3);
        trasporteMaquinaria.add(new Maquinaria("Bulldozer"));
        trasporteMaquinaria.add(new Maquinaria("Grua Orquilla"));
        trasporteMaquinaria.add(new Maquinaria("Perforadora"));

        imprimirCamion(trasporteMaquinaria);

        System.out.println();

        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Mitsubishi"));
        transporteAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transporteAuto);

    }

    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T t : camion) {
            System.out.println(t);
        }
    }

}
