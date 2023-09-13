public class Calculadora {
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }

    public static double restar(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }

    public static double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public static double mayorEntreDosNumeros(double num1, double num2){
        return Math.max(num1, num2);
    }

    public static double menorEntreDosNumeros(double num1, double num2){
        return Math.min(num1, num2);
    }

    public static double porcentaje(double porcentaje, double num){
        return (porcentaje * num) / 100;
    }
}
