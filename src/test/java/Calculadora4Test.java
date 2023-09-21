import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculadora4Test {

    @Test
    public void testResolverSistemaEcuaciones1() {
        double[] resultado = Calculadora4.resolverSistemaEcuaciones(3, 2, 4, 5, 2, 4);
        double[] esperado = {-0.0, 2.0};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testResolverSistemaEcuaciones2() {
        double[] resultado = Calculadora4.resolverSistemaEcuaciones(1, 1, 0, 3, -1, 4);
        double[] esperado = {1.0, -1.0};
        assertArrayEquals(esperado, resultado);
    }
}





