package parte2.vasquez.app;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public float sumar(float x, float y) {
        return x + y;
    }

    public float sumar(int i, float j) {
        return i + j;
    }

    public float sumar(float i, int j) {
        return i + j;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int sumar(int... args) {
        int total = 0;
        for (int n : args) {
            total+= n;
        }
        return total;
    }

    public float sumar(float num, int... args) {
        float total = num;
        for (int n : args) {
            total+= n;
        }
        return total;
    }

}
