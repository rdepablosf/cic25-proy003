package es.cic.curso25;

public class Calculadora {
    private double total;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor) {
        total = total + valor;
    }

    public void restar(double a, double b) {
        total = a - b;
    }
}
