import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculadora5Test {

    @Test
    void calcularPendiente() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 7;

        double pendiente = Calculadora5.calcularPendiente(x1, y1, x2, y2);
        assertEquals(1.3333, pendiente, 0.0001);

        int x3 = 2;
        int y3 = 3;
        int x4 = 2;
        int y4 = 7;

        double pendienteIgualAX = Calculadora5.calcularPendiente(x3, y3, x4, y4);
        assertEquals(0.0, pendienteIgualAX, 0.0001);
    }

    @Test
    void calcularInterseccion() {
        double x = 2.0;
        double y = 3.0;
        double m = 1.3333;

        double interseccion = Calculadora5.calcularInterseccion(x, y, m);
        assertEquals(0.33340000000000014, interseccion, 0.0001);

        double x2 = 5.0;
        double y2 = 7.0;
        double m2 = 1.3333;

        double interseccion2 = Calculadora5.calcularInterseccion(x2, y2, m2);
        assertEquals(0.3335000000000008, interseccion2, 0.0001);
    }

    @Test
    void calcularEcuacionRecta() {
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 5.0;
        double y2 = 7.0;

        String ecuacion = Calculadora5.calcularEcuacionRecta(x1, y1, x2, y2);
        assertEquals("Y = 1,33X + ,33", ecuacion);

        double x3 = 2.0;
        double y3 = 3.0;
        double x4 = 2.0;
        double y4 = 7.0;

        String ecuacionIgualAX = Calculadora5.calcularEcuacionRecta(x3, y3, x4, y4);
        assertEquals("Y = ,00X + 3,00", ecuacionIgualAX);
    }
}
