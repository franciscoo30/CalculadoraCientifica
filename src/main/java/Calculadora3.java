public class Calculadora3 {
    public static void main(String[] args) {
        System.out.println(calcularVolumenEsfera(Math.cbrt(3)));
        System.out.println(calcularPerimetroCubo(2));
        System.out.println(calcularAreaCubo(3));
        System.out.println(calcularVolumenCubo(3));
        System.out.println(calcularVolumenCono(2,2));

    }

    public static int calcularPerimetroCuadrado(int lado) {
        int perimetro = (4 * lado);

        return perimetro;
    }

    public static int calcularAreaCuadrado(int lado) {
        int area = (lado * lado);

        return area;
    }

    public static int calcularPerimetroRectangulo(int largo, int ancho) {
        int perimetro = (2 * largo) + (2 * ancho);

        return perimetro;
    }

    public static int calcularAreaRectangulo(int largo, int ancho) {
        int area = (largo * ancho);

        return area;
    }

    public static double calcularPerimetroCirculo(double radio) {
        double pi = Math.PI;
        return (2 * pi * radio);
    }

    public static double calcularAreaCirculo(double radio) {
        double pi = Math.PI;

        return (pi * radio * radio);
    }

    public static double calcularVolumenEsfera(double radio){
        double pi = Math.PI;
        double potencia = Math.pow(radio, 3);

        return pi * potencia * 4 / 3;
    }

    public static double calcularPerimetroCubo(double lado){
        double perimetroCubo = 12 * lado;

        return perimetroCubo;
    }

    public static double calcularAreaCubo(double lado){
        double areaCubo = lado * lado * 6;

        return areaCubo;
    }

    public static double calcularVolumenCubo(double lado){
        double volumenCubo = Math.pow(lado, 3);

        return volumenCubo;
    }

    public static double calcularVolumenCono(double radio, double alto){
        double pi = Math.PI;

        return pi * radio * radio * alto * 1 / 3;
    }
}