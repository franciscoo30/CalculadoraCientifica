import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class esMenorTest {
    @Test
    void testEsMenorEsperado() {
        int resultado = Calculadora1.esMenor(5, 10);
        assertEquals(5, resultado);
    }
    @Test
    void testEsMenorTrue() {
        int resultado = Calculadora1.esMenor(5, 10);
        assertTrue(resultado == 5);
    }
}
