package parte7.vasquez.app.modelo;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Cliente(int id, String nombre, String apellido) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(){
        this.id = ++ultimoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}