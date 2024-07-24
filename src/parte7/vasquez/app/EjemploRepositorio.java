package parte7.vasquez.app;

import parte7.vasquez.app.modelo.Cliente;
import parte7.vasquez.app.repositorio.ClienteListRepositorio;
import parte7.vasquez.app.repositorio.CrudRepositorio;
import parte7.vasquez.app.repositorio.Direccion;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        ClienteListRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Pepito", "Rojas"));
        repo.crear(new Cliente("Renzo", "Vasquez"));
        repo.crear(new Cliente("Raton", "Mendi"));
        repo.crear(new Cliente("Joel", "Aguilar"));

        List<Cliente> clientes = repo.listar();

        clientes.forEach(System.out::println);

        System.out.println("\'Paginable\'");
        List<Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("\'Orden\'");
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.DESC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("\'Editar\'");
        Cliente cliAct = new Cliente("Raton","Mendieta");
        cliAct.setId(3);
        repo.editar(cliAct);
        Cliente actualizado = repo.porId(3);
        System.out.println(actualizado);

        System.out.println("\'Eliminar\'");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);

    }

}
