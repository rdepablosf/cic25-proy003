package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testLanzar() {
        Calculadora c = new Calculadora();
        Calculadora d = c;
        c.total = 3;
        c = new Calculadora();
        c.total = 4.5;
    }

        @Test
    public void testLanzar2() {
        Calculadora c = new Calculadora();
        Calculadora d = new Calculadora();

        c.total = 5;
        d.total = 5;

        c = d;

    }

}
