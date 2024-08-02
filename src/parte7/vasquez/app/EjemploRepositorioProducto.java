package parte7.vasquez.app;

import parte7.vasquez.app.modelo.Cliente;
import parte7.vasquez.app.modelo.Producto;
import parte7.vasquez.app.repositorio.CompletoRepositorio;
import parte7.vasquez.app.repositorio.Direccion;
import parte7.vasquez.app.repositorio.excepciones.AccesoDatoException;
import parte7.vasquez.app.repositorio.lista.ClienteListRepositorio;
import parte7.vasquez.app.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {
        try {
            CompletoRepositorio<Producto> repo = new ProductoListRepositorio();
            repo.crear(new Producto("mesa", 200.00));
            repo.crear(new Producto("ropero", 300.00));
            repo.crear(new Producto("silla", 50.00));
            repo.crear(new Producto("lampara", 20.00));

            List<Producto> productos = repo.listar();

            productos.forEach(System.out::println);

            System.out.println("\'Paginable\'");
            List<Producto> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);

            System.out.println("\'Orden\'");
            List<Producto> productosOrdenAsc = repo.listar("apellido", Direccion.DESC);
            productosOrdenAsc.forEach(System.out::println);

            System.out.println("\'Editar\'");
            Producto proAct = new Producto("lampara", 25.00);
            proAct.setId(3);
            repo.editar(proAct);
            Producto actualizado = repo.porId(3);
            System.out.println(actualizado);

            System.out.println("\'Eliminar\'");
            repo.eliminar(3);
            repo.listar().forEach(System.out::println);

            System.out.println("\'Total\'");
            System.out.println("Total de registos: " + repo.total());
        } catch (AccesoDatoException e) {
            System.out.println("Ta mal p :v");
        }
        
    }

}
