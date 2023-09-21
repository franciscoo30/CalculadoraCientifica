public class Calculadora4 {
    public static void main(String[] args) {

        double[] solucion = resolverSistemaEcuaciones(3, 2, 4, 5, 2, 4);
        imprimirSolucion(solucion);

    }


    public static double[] resolverSistemaEcuaciones(double A, double B, double C, double D, double E, double F) {
        double x;
        double y;


        x = (C * E - B * F) / (A * E - B * D);


        y = (A * F - C * D) / (A * E - B * D);

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



