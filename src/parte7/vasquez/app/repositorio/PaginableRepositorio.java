package parte7.vasquez.app.repositorio;

import parte7.vasquez.app.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
