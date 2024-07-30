package parte7.vasquez.app.repositorio;

import parte3.vasquez.app.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(int id);
    void crear(T t);
    void editar(T t);
    void eliminar(int id);
}
