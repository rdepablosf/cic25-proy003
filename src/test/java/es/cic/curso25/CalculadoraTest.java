package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testLanzar() {
        Calculadora c = new Calculadora();
        Calculadora d = c;
        c.setTotal(3);

        double valorActual = c.getTotal();

    }


}
