package parte7.vasquez.app.repositorio;

import parte7.vasquez.app.modelo.BaseEntity;

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
    public T porId(int id) {
        T cli = null;
        for (T c : dataSource){
            if (c.getId() == id) {
                cli = c;
                return cli;
            }
        }
        return cli;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(int id) {
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
