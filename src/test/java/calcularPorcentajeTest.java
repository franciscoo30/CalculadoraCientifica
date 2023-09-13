import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class calcularPorcentajeTest {
    @Test
    void calcularPorcentajeTestEsperado() {
        double resultado = Calculadora1.calcularPorcentaje(50, 20);
        assertEquals(10, resultado, 0.0001);
    }

    @Test
    void calcularPorcentajeTest0() {
        double resultado = Calculadora1.calcularPorcentaje(100, 0);
        assertEquals(0, resultado, 0.0001);

    }
}
