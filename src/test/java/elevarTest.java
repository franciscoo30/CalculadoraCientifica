import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class elevarTest {
    @Test
    void elevarTestEsperado() {
        double resultado = Calculadora1.elevar(2, 3);
        assertEquals(8, resultado, 0.0001);
    }

    @Test
    void testNumerosNegativos() {
        double resultado = Calculadora1.elevar(-2, 3);
        assertEquals(-8, resultado, 0.0001);
    }
}
