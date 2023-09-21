import static org.junit.jupiter.api.Assertions.*;

class Calculadora3Test {

    @org.junit.jupiter.api.Test
    void calcularPerimetroCuadrado() {
        int valorEsperado = 16;
        int resultado = Calculadora3.calcularPerimetroCuadrado(4);
        assertEquals(valorEsperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularAreaCuadrado() {
        int valorEsperado = 25;
        int resultado = Calculadora3.calcularAreaCuadrado(5);
        assertEquals(valorEsperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularPerimetroRectangulo() {
        int valorEsperado = 16;
        int resultado = Calculadora3.calcularPerimetroRectangulo(4, 4);
        assertEquals(valorEsperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularAreaRectangulo() {
        int valorEsperado = 20;
        int resultado = Calculadora3.calcularAreaRectangulo(4, 5);
        assertEquals(valorEsperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularPerimetroCirculo() {
        double valorEsperado = 31.41592653589793;
        double resultado = Calculadora3.calcularPerimetroCirculo(5);
        assertEquals(valorEsperado, resultado, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void calcularAreaCirculo() {
        double valorEsperado = 78.53981633974483;
        double resultado = Calculadora3.calcularAreaCirculo(5);
        assertEquals(valorEsperado, resultado, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void calcularVolumenEsfera() {
        double valorEsperado = 113.09733552923255;
        double resultado = Calculadora3.calcularVolumenEsfera(3);
        assertEquals(valorEsperado, resultado, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void calcularPerimetroCubo() {
        double valorEsperado = 24;
        double resultado = Calculadora3.calcularPerimetroCubo(2);
        assertEquals(valorEsperado, resultado, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void calcularAreaCubo() {
        double valorEsperado = 54;
        double resultado = Calculadora3.calcularAreaCubo(3);
        assertEquals(valorEsperado, resultado, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void calcularVolumenCubo() {
        double valorEsperado = 27;
        double resultado = Calculadora3.calcularVolumenCubo(3);
        assertEquals(valorEsperado, resultado, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void calcularVolumenCono() {
        double valorEsperado = 25.132741228718345;
        double resultado = Calculadora3.calcularVolumenCono(2, 2);
        assertEquals(valorEsperado, resultado, 0.0001);
    }
}
