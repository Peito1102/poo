package parte8.vasquez.app.generics;

import parte7.vasquez.app.modelo.Cliente;
import parte7.vasquez.app.modelo.ClientePremium;

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

        List<ClientePremium> clientesPremiums = fromArrayToList(new ClientePremium[]{new ClientePremium("Jona","Iñoñan")});
        imprimirClientes(clientes);
        System.out.println();
        imprimirClientes(clientes2);
        System.out.println();
        imprimirClientes(clientesPremiums);

        System.out.println("Maximo de 1,4 y 9 :" + maximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.6 y 7.80 :" + maximo(3.9,11.6,7.80));
        System.out.println("Maximo de zanahoria, esparrago y alberja : " + maximo("zanahoria", "esparrago","alberja"));

    }

    public static <T> List<T> fromArrayToList(T [] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T [] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T [] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T [] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
