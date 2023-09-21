public class Calculadora4 {
    public static void main(String[] args) {
        double[] solucion = resolverSistemaEcuaciones("hola", "2", "4", "5", "2", "4");
        imprimirSolucion(solucion);
    }

    public static double[] resolverSistemaEcuaciones(String strA, String strB, String strC, String strD, String strE, String strF) {
        double x = Double.NaN;
        double y = Double.NaN;

        try {
            double A = Double.parseDouble(strA);
            double B = Double.parseDouble(strB);
            double C = Double.parseDouble(strC);
            double D = Double.parseDouble(strD);
            double E = Double.parseDouble(strE);
            double F = Double.parseDouble(strF);

            x = (C * E - B * F) / (A * E - B * D);
            y = (A * F - C * D) / (A * E - B * D);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("El sistema no tiene solución única.");
        } catch (NumberFormatException e) {
            System.err.println("Advertencia: Uno o más valores ingresados no son números válidos.");
        }

        double[] solucion = { x, y };
        return solucion;
    }

    public static void imprimirSolucion(double[] solucion) {
        double x = solucion[0];
        double y = solucion[1];

        System.out.println("La solución para x es: " + x);
        System.out.println("La solución para y es: " + y);
    }
}




