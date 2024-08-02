package parte7.vasquez.app.repositorio;

import parte7.vasquez.app.modelo.BaseEntity;
import parte7.vasquez.app.repositorio.excepciones.AccesoDatoException;
import parte7.vasquez.app.repositorio.excepciones.EscrituraAccesoDatoException;
import parte7.vasquez.app.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio<T extends BaseEntity> implements CompletoRepositorio<T> {

    protected List<T> dataSource;

    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException{
        if (id <= 0 || id == null) {
            throw new LecturaAccesoDatoException("Id inválido debe ser > 0.");
        }
        T cli = null;
        for (T c : dataSource){
            if (c.getId().equals(id)) {
                cli = c;
                return cli;
            }
        }
        if (cli == null) {
            throw new LecturaAccesoDatoException("No existe ese registro con ese id: " + id);
        }
        return cli;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException {
        if(t == null) {
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        }
        if (this.dataSource.contains(t)) {
            throw new EscrituraAccesoDatoException("Error el objeto con el id: "
                    + t.getId() + ", ya existe en el repositorio.");
        }
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        T t = this.porId(id);
        this.dataSource.remove(t);
    }

    @Override
    public List<T> listar(int desde, int hasta) {

        return dataSource.subList(desde,hasta);
    }

    @Override
    public int total() {
        return dataSource.size();
    }
}
