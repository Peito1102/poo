package parte7.vasquez.app.repositorio;

import parte7.vasquez.app.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, PaginableRepositorio, OrdenableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(int id) {
        Cliente cli = null;
        for (Cliente c : dataSource){
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(int id) {
        Cliente cli = this.porId(id);
        this.dataSource.remove(cli);
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {

        return dataSource.subList(desde,hasta);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort((a, b) -> {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    switch (campo) {
                        case "id" -> resultado = a.getId().compareTo(b.getId());
                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if (dir == Direccion.DESC) {
                    switch (campo) {
                        case "id" -> resultado = b.getId().compareTo(a.getId());
                        case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return resultado;
            });
        return dataSource;
    }
}
