package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // preparo
        Calculadora cut = new Calculadora();

        // ejecuto
        cut.sumar(5.6);

        // verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);

        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {
        Calculadora cut = new Calculadora();

        // ejecuto
        cut.restar(5.6);

        // verifico
        double valorActual = cut.getTotal();
        assertEquals(-5.6, valorActual, 0.000001);
    }

    @Test
    public void testMultiplicar() {
        Calculadora cut = new Calculadora();
        cut.sumar(4);

        cut.multiplicar(3);
        double valorActual = cut.getTotal();
        assertEquals(12, valorActual, 0.000001);
    }

    @Test
    public void testDividir() {
        // preparo
        Calculadora cut = new Calculadora();
        cut.sumar(4);

        // ejecuto
        cut.dividir(2);

        // verifico
        double valorActual = cut.getTotal();
        assertEquals(2, valorActual, 0.000001);
    }
}
