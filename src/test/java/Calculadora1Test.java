import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculadora1Test {

    @Test
    public void testSumar(){
        assertEquals(9.0, Calculadora1.sumar(6.0, 3.0));
        assertEquals(0.0, Calculadora1.sumar(0.0, 0.0));
        assertEquals(-2.3, Calculadora1.sumar(2.0, -4.3));
        assertEquals(1.0000000002, Calculadora1.sumar(1.0000000001, 0.0000000001));
        assertEquals(30000000000000000000.0, Calculadora1.sumar(20000000000000000000.0, 10000000000000000000.0));
    }

    @Test
    public void testRestar(){
        assertEquals(3.0, Calculadora1.restar(6.0, 3.0));
        assertEquals(0.0, Calculadora1.restar(0.0, 0.0));
        assertEquals(6.3, Calculadora1.restar(2.0, -4.3));
        assertEquals(1.0, Calculadora1.restar(1.0000000001, 0.0000000001));
    }
    @Test
    public void testMultiplicar(){
        assertEquals(18.0, Calculadora1.multiplicar(6.0, 3.0));
        assertEquals(0.0, Calculadora1.multiplicar(0.0, 0.0));
        assertEquals(-10.234, Calculadora1.multiplicar(2.38, -4.3));
        assertEquals(0.00000010000001, Calculadora1.multiplicar(1.0000001, 0.0000001));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, Calculadora1.dividir(6.0, 3.0));
        assertThrows(ArithmeticException.class, () -> Calculadora1.dividir(6.0, 0.0));
        assertEquals(-2.0, Calculadora1.dividir(-6.0, 3.0));
        assertThrows(ArithmeticException.class, () -> Calculadora1.dividir(0.0, 0.0));
    }

    @Test
    public void testPotencia() {
        assertEquals(16.0, Calculadora1.potencia(2.0, 4.0));
        assertEquals(1.0, Calculadora1.potencia(2.0, 0.0));
        assertEquals(1.0, Calculadora1.potencia(0.0, 0.0));
    }

    @Test
    public void testMayorEntreDosNumeros() {
        assertEquals(5.0, Calculadora1.mayorEntreDosNumeros(3.0, 5.0));
        assertEquals(7.0, Calculadora1.mayorEntreDosNumeros(7.0, 4.0));
    }

    @Test
    public void testMenorEntreDosNumeros() {
        assertEquals(3.0, Calculadora1.menorEntreDosNumeros(3.0, 5.0));
        assertEquals(-4.0, Calculadora1.menorEntreDosNumeros(7.0, -4.0));
    }

    @Test
    public void testPorcentaje() {
        assertEquals(20.0, Calculadora1.porcentaje(10.0, 200.0));
        assertEquals(5.0, Calculadora1.porcentaje(5.0, 100.0));
        assertEquals(0.0, Calculadora1.porcentaje(0.0, 100.0));
    }
}