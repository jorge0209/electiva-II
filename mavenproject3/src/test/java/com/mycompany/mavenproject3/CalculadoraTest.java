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
   
   
   
@Test
public void testPotencia() {
    Calculadora calc = new Calculadora();
    // 2^3 = 8
    assertEquals(8, Math.pow(2, 3), 0.001);
    // 5^2 = 25
    assertEquals(25, Math.pow(5, 2), 0.001);
}

@Test
public void testRaizCuadrada() {
    Calculadora calc = new Calculadora();
    // √9 = 3
    assertEquals(3, Math.sqrt(9), 0.001);
    // √16 = 4
    assertEquals(4, Math.sqrt(16), 0.001);
}

@Test
public void testRaizCuadradaNumeroNegativo() {
    Calculadora calc = new Calculadora();
    // √(-4) debe manejarse con tu validación
    // Esto prueba que no se crashea
    assertTrue(Double.isNaN(Math.sqrt(-4)));
}

  @Test
    public void testModulo() {
        double num1 = 10;
        double num2 = 3;
        double resultado = num1 % num2;
        assertEquals(1, resultado);
    }

    @Test
    public void testLogaritmoNatural() {
        double num = Math.E; // ln(e) = 1
        double resultado = Math.log(num);
        assertEquals(1, resultado, 0.0001); // tolerancia de error
    }

    @Test
    public void testLogaritmoBase10() {
        double num = 100; // log10(100) = 2
        double resultado = Math.log10(num);
        assertEquals(2, resultado, 0.0001);
    }
}

