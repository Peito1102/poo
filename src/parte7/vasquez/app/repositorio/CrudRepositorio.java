package parte7.vasquez.app.repositorio;

import parte7.vasquez.app.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(int id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(int id);
}
