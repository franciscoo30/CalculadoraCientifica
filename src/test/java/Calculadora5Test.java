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

}
