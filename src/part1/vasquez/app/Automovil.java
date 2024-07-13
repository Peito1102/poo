package part1.vasquez.app;

public class Automovil {

        private String fabricante;
        private String modelo;
        private String color;
        private Motor motor;
        private Estanque estanque;
        private Persona persona;
        private Rueda [] ruedas;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getCilindrada() {
        return motor;
    }

    public void setCilindrada(Motor motor) {
        this.motor = motor;
    }

    public Estanque getCapacidadEstanque() {
        return this.estanque;
    }

    public void setCapacidadEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public String detalle() {
            StringBuilder sb = new StringBuilder();
            sb.append(fabricante);
            sb.append("\n" + modelo);
            sb.append("\n" + color);
            sb.append("\n" + motor.getCilindrada());

            return sb.toString();
        }

        public String acelerar(int rpm){
            return fabricante + " acelerando a " + rpm + "rpm";
        }

        public String frenar(){
            return fabricante + " " + modelo + " frenando!";
        }

        public String acelerarFrenar(int rpm) {
            String acelerar = acelerar(rpm);
            String frenar = frenar();
            return acelerar + "\n" + frenar;
        }

        public float calcularConsumo(int km, float porcentBencina) {
            return  km/(estanque.getCapacidad()*porcentBencina);
        }

        public float calcularConsumo(int km, int porcentBencina) {
            return  km/(estanque.getCapacidad()*(porcentBencina/100f));
        }
}
