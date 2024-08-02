package parte7.vasquez.app.repositorio.lista;

import parte7.vasquez.app.modelo.Cliente;
import parte7.vasquez.app.modelo.Producto;
import parte7.vasquez.app.repositorio.AbstractListRepositorio;
import parte7.vasquez.app.repositorio.Direccion;
import parte7.vasquez.app.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractListRepositorio<Producto> {

    @Override
    public void editar(Producto producto) throws LecturaAccesoDatoException {
        Producto pro = porId(producto.getId());
        pro.setDescripcion(producto.getDescripcion());
        pro.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
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

    public static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }

        return resultado;
    }

}
