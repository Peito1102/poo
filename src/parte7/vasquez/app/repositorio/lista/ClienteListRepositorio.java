package parte7.vasquez.app.repositorio.lista;

import parte7.vasquez.app.modelo.Cliente;
import parte7.vasquez.app.repositorio.AbstractListRepositorio;
import parte7.vasquez.app.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    ordenar(campo,a,b);
                } else if (dir == Direccion.DESC) {
                    ordenar(campo,b,a);
                }
                return resultado;
            });
        return listaOrdenada;
    }

    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }

        return resultado;
    }

}
