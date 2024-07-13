package parte6.vasquez.app.modelo;

import javax.imageio.ImageReader;

public class Pagina extends Hoja implements Imprimible {
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
