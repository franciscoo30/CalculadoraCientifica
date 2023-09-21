import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculadora2Test {

    @Test
    public void test_aIgualCero() {
        // Caso extremo: a = 0
        try {
            Assertions.assertThrows(ArithmeticException.class, () -> Calculadora2.calcularCuadratica(1.0, 2.0, 3.0));
        }catch (Exception e){
            System.out.println("No se puede calcular la raiz de un numero negativo");
        }
    }

    @Test
    // Caso extremo: discriminante = 0
    public void testDiscriminanteCero(){
        double[] raices = Calculadora2.calcularCuadratica(1.0, -2.0, 1.0);
        Assertions.assertArrayEquals(new double[]{1.0, 1.0}, raices, 0.0001);
    }

    @Test
    public void testDiscriminantePositivo(){
        double[] raices = Calculadora2.calcularCuadratica(1.0, -5.0, 6.0);
        Assertions.assertArrayEquals(new double[]{3.0, 2.0}, raices, 0.0001);
    }
    @Test
    // caso extremo: discriminante negativo
    public void testDiscriminanteNegativo(){
        try {
            Assertions.assertThrows(ArithmeticException.class, () -> Calculadora2.calcularCuadratica(1.0, 1.0, 1.0));
        }catch (Exception e){
            System.out.println("No se puede calcular la raiz de un numero negativo");
        }
    }
}