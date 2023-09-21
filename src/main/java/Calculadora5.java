import java.text.DecimalFormat;

public class Calculadora5 {

    public static void main(String[] args) {
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 5.0;
        double y2 = 7.0;

        // Para calcular la ecuación de la recta se necesita la pendiente y luego aplicar la formula,
        // para identificar la pendiente se debe restar el punto "y" final y el punto "y" inicial y dividirlo entre el punto "x" final y el punto "x" inicial
        // luego se aplica la formula "y" inicial menos el producto entre la pendiente y el punto "x" inicial
        String ecuacion = calcularEcuacionRecta(x1, y1, x2, y2);
        System.out.println("La ecuación de la recta es: " + ecuacion);
    }

    public static String calcularEcuacionRecta(double x1, double y1, double x2, double y2) {
        double m = calcularPendiente(x1, y1, x2, y2);
        double b = calcularInterseccion(x1, y1, m);
        return "Y = " + formatearNumero(m) + "X + " + formatearNumero(b);
    }

    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return 0.0;
        }
        return (y2 - y1) / (x2 - x1);
    }

    public static double calcularInterseccion(double x, double y, double m) {
        return y - (m * x);
    }

    public static String formatearNumero(double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(numero);
    }
}
