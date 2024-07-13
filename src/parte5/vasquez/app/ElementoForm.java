package parte5.vasquez.app;

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;
    abstract public String dibujarHtml();

    public ElementoForm() {
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
}
