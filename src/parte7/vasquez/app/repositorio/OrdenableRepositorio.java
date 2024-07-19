package parte7.vasquez.app.repositorio;

import parte7.vasquez.app.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo,Direccion dir);

}
