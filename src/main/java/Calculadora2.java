public class Calculadora2 {
    public static double[] calcularCuadratica(double a, double b, double c){ //resuelve una ecuacion cuadratica de la forma ax^2 + bx + c = 0
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante < 0) {
            throw new ArithmeticException("No se puede calcular la raiz de un numero negativo");
        }
        double[] raices = new double[2];
        if (discriminante == 0) {
            raices[0] = -b / (2 * a);
            raices[1] = raices[0];
            return raices;
        }
        try{
            raices[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
            raices[1] = (-b - Math.sqrt(discriminante)) / (2 * a);

        }catch (Exception e){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return raices;
    }

}
