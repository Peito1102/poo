package parte8.vasquez.app.generics;

import parte7.vasquez.app.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres","Lujan"));

        //Cliente andres = (Cliente) clientes.iterator().next();
        Cliente andres = clientes.get(0);

        Cliente[] clientesArr = {new Cliente("Andres","Lujan"),
                new Cliente("Kinteka","Carrion")};

        Integer[] enteros = {1,2,3};

        List<Cliente> clientes2 = fromArrayToList(clientesArr);
        List<Integer> enteros2 = fromArrayToList(enteros);

        clientes2.forEach(System.out::println);
        System.out.println();
        enteros2.forEach(System.out::println);
        System.out.println();

        List<String> nombres = fromArrayToList(new String[]{"JD","PEPITO","CAJITA"}, enteros);
        System.out.println();
        nombres.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T [] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T [] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

}
