package parte7.vasquez.app.repositorio;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(int id);
    void crear(T cliente);
    void editar(T cliente);
    void eliminar(int id);
}
