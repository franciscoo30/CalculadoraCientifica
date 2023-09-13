import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testDividir() {
        Assertions.assertEquals(2.0, Calculadora.dividir(6.0, 3.0));
        Assertions.assertThrows(ArithmeticException.class, () -> Calculadora.dividir(6.0, 0.0));
    }

    @Test
    public void testPotencia() {
        Assertions.assertEquals(16.0, Calculadora.potencia(2.0, 4.0));
    }

    @Test
    public void testMayorEntreDosNumeros() {
        Assertions.assertEquals(5.0, Calculadora.mayorEntreDosNumeros(3.0, 5.0));
        Assertions.assertEquals(7.0, Calculadora.mayorEntreDosNumeros(7.0, 4.0));
    }

    @Test
    public void testMenorEntreDosNumeros() {
        Assertions.assertEquals(3.0, Calculadora.menorEntreDosNumeros(3.0, 5.0));
        Assertions.assertEquals(4.0, Calculadora.menorEntreDosNumeros(7.0, 4.0));
    }

    @Test
    public void testPorcentaje() {
        Assertions.assertEquals(20.0, Calculadora.porcentaje(10.0, 200.0));
    }
}