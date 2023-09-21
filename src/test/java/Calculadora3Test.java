import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Calculadora3Test {

    @Test
    void calcularPerimetroCuadrado() {
        int valorEsperado1 = 16;
        int resultado1 = Calculadora3.calcularPerimetroCuadrado(4);
        assertEquals(valorEsperado1, resultado1);

        int valorEsperado2 = 20;
        int resultado2 = Calculadora3.calcularPerimetroCuadrado(5);
        assertEquals(valorEsperado2, resultado2);
    }

    @Test
    void calcularAreaCuadrado() {
        int valorEsperado1 = 25;
        int resultado1 = Calculadora3.calcularAreaCuadrado(5);
        assertEquals(valorEsperado1, resultado1);

        int valorEsperado2 = 49;
        int resultado2 = Calculadora3.calcularAreaCuadrado(7);
        assertEquals(valorEsperado2, resultado2);
    }

    @Test
    void calcularPerimetroRectangulo() {
        int valorEsperado1 = 16;
        int resultado1 = Calculadora3.calcularPerimetroRectangulo(4, 4);
        assertEquals(valorEsperado1, resultado1);

        int valorEsperado2 = 22;
        int resultado2 = Calculadora3.calcularPerimetroRectangulo(5, 6);
        assertEquals(valorEsperado2, resultado2);
    }

    @Test
    void calcularAreaRectangulo() {
        int valorEsperado1 = 20;
        int resultado1 = Calculadora3.calcularAreaRectangulo(4, 5);
        assertEquals(valorEsperado1, resultado1);

        int valorEsperado2 = 30;
        int resultado2 = Calculadora3.calcularAreaRectangulo(3, 10);
        assertEquals(valorEsperado2, resultado2);
    }

    @Test
    void calcularPerimetroCirculo() {
        double valorEsperado1 = 31.41592653589793;
        double resultado1 = Calculadora3.calcularPerimetroCirculo(5);
        assertEquals(valorEsperado1, resultado1, 0.0001);

        double valorEsperado2 = 62.83185307179587;
        double resultado2 = Calculadora3.calcularPerimetroCirculo(10);
        assertEquals(valorEsperado2, resultado2, 0.0001);
    }

    @Test
    void calcularAreaCirculo() {
        double valorEsperado1 = 78.53981633974483;
        double resultado1 = Calculadora3.calcularAreaCirculo(5);
        assertEquals(valorEsperado1, resultado1, 0.0001);

        double valorEsperado2 = 314.1592653589793;
        double resultado2 = Calculadora3.calcularAreaCirculo(10);
        assertEquals(valorEsperado2, resultado2, 0.0001);
    }

    @Test
    void calcularVolumenEsfera() {
        double valorEsperado1 = 113.09733552923255;
        double resultado1 = Calculadora3.calcularVolumenEsfera(3);
        assertEquals(valorEsperado1, resultado1, 0.0001);

        double valorEsperado2 = 523.5987755982989;
        double resultado2 = Calculadora3.calcularVolumenEsfera(5);
        assertEquals(valorEsperado2, resultado2, 0.0001);
    }

    @Test
    void calcularPerimetroCubo() {
        double valorEsperado1 = 24;
        double resultado1 = Calculadora3.calcularPerimetroCubo(2);
        assertEquals(valorEsperado1, resultado1, 0.0001);

        double valorEsperado2 = 48;
        double resultado2 = Calculadora3.calcularPerimetroCubo(4);
        assertEquals(valorEsperado2, resultado2, 0.0001);
    }

    @Test
    void calcularAreaCubo() {
        double valorEsperado1 = 54;
        double resultado1 = Calculadora3.calcularAreaCubo(3);
        assertEquals(valorEsperado1, resultado1, 0.0001);

        double valorEsperado2 = 96;
        double resultado2 = Calculadora3.calcularAreaCubo(4);
        assertEquals(valorEsperado2, resultado2, 0.0001);
    }

    @Test
    void calcularVolumenCubo() {
        double valorEsperado1 = 27;
        double resultado1 = Calculadora3.calcularVolumenCubo(3);
        assertEquals(valorEsperado1, resultado1, 0.0001);

        double valorEsperado2 = 64;
        double resultado2 = Calculadora3.calcularVolumenCubo(4);
        assertEquals(valorEsperado2, resultado2, 0.0001);
    }

    @Test
    void calcularVolumenCono() {
        double valorEsperado1 = 25.132741228718345;
        double resultado1 = Calculadora3.calcularVolumenCono(2, 2);
        assertEquals(valorEsperado1, resultado1, 0.0001);

        double valorEsperado2 = 37.69911184307752;
        double resultado2 = Calculadora3.calcularVolumenCono(3, 4);
        assertEquals(valorEsperado2, resultado2, 0.0001);
    }
}
