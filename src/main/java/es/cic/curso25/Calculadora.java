package es.cic.curso25;

public class Calculadora extends Object {
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void noHagoNada() {
        total = 3;
    }
}
