import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class esMayorTest {
    @Test
    void testEsMayorEsperado() {
        int resultado = Calculadora1.esMayor(5, 10);
        assertEquals(10, resultado);
    }
    @Test
    void testEsMayorTrue() {
        int resultado = Calculadora1.esMayor(5, 10);
        assertTrue(resultado == 10);
    }
}