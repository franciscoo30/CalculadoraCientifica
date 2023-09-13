public class Calculadora1 {
    public static void main (String [] args){
        System.out.println(esMayor(3,5));
        System.out.println(esMenor(3,5));
        System.out.println(elevar(2,6));
        System.out.println(calcularPorcentaje(30,50));
    }
    public static int esMayor(int a, int b){
        return Math.max(a, b);
    }
    public static int esMenor(int a, int b){
        return Math.min(a, b);
    }
    public static double elevar(double a, double b){
        return Math.pow(a, b);
    }
    public static double calcularPorcentaje(double a, double b){
        double resultado = (a * b) / 100;
        return resultado;
    }
}
