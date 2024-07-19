package parte7.vasquez.app.repositorio;

import parte7.vasquez.app.modelo.Cliente;

import java.util.ArrayList;
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
            if (cli.getId() == id) {
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
        return null;
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return null;
    }
}
