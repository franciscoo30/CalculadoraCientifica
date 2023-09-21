import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculadora1Test {

    @Test
    public void testDividir() {
        assertEquals(2.0, Calculadora1.dividir(6.0, 3.0));
        assertThrows(ArithmeticException.class, () -> Calculadora1.dividir(6.0, 0.0));
    }

    @Test
    public void testPotencia() {
        assertEquals(16.0, Calculadora1.potencia(2.0, 4.0));
    }

    @Test
    public void testMayorEntreDosNumeros() {
        assertEquals(5.0, Calculadora1.mayorEntreDosNumeros(3.0, 5.0));
        assertEquals(7.0, Calculadora1.mayorEntreDosNumeros(7.0, 4.0));
    }

    @Test
    public void testMenorEntreDosNumeros() {
        assertEquals(3.0, Calculadora1.menorEntreDosNumeros(3.0, 5.0));
        assertEquals(4.0, Calculadora1.menorEntreDosNumeros(7.0, 4.0));
    }

    @Test
    public void testPorcentaje() {
        assertEquals(20.0, Calculadora1.porcentaje(10.0, 200.0));
    }
}