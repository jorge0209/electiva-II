package com.mycompany.mavenproject3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testRestar() {
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(6, 0));
    }
}
