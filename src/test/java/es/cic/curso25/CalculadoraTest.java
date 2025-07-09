package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();

        // Ejecuto
        cut.sumar(5.6);

        // Verifico
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
        cut.restar(10, 5);

        // verifico
        double valorActual = cut.getTotal();
        assertEquals(5, valorActual, 0.000001);

        cut.restar(10, 5);
        valorActual = cut.getTotal();

        assertEquals(5, valorActual, 0.000001);
    }
}
