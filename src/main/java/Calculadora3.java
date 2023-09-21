public class Calculadora3 {
    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        try {
            System.out.println(calcularVolumenEsfera(Math.cbrt(3)));
            System.out.println(calcularPerimetroCubo(2));
            System.out.println(calcularAreaCubo(3));
            System.out.println(calcularVolumenCubo(3));
            System.out.println(calcularVolumenCono(2, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int calcularPerimetroCuadrado(int lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del cuadrado debe ser mayor que cero.");
        }
        return 4 * lado;
    }

    public static int calcularAreaCuadrado(int lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del cuadrado debe ser mayor que cero.");
        }
        return lado * lado;
    }

    public static int calcularPerimetroRectangulo(int largo, int ancho) {
        if (largo <= 0 || ancho <= 0) {
            throw new IllegalArgumentException("Tanto el largo como el ancho del rectángulo deben ser mayores que cero.");
        }
        return 2 * largo + 2 * ancho;
    }

    public static int calcularAreaRectangulo(int largo, int ancho) {
        if (largo <= 0 || ancho <= 0) {
            throw new IllegalArgumentException("Tanto el largo como el ancho del rectángulo deben ser mayores que cero.");
        }
        return largo * ancho;
    }

    public static double calcularPerimetroCirculo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio del círculo debe ser mayor que cero.");
        }
        double pi = Math.PI;
        return 2 * pi * radio;
    }

    public static double calcularAreaCirculo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio del círculo debe ser mayor que cero.");
        }
        double pi = Math.PI;
        return pi * radio * radio;
    }

    public static double calcularVolumenEsfera(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio de la esfera debe ser mayor que cero.");
        }
        double pi = Math.PI;
        double potencia = Math.pow(radio, 3);
        return (4.0 / 3.0) * pi * potencia;
    }

    public static double calcularPerimetroCubo(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del cubo debe ser mayor que cero.");
        }
        return 12 * lado;
    }

    public static double calcularAreaCubo(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del cubo debe ser mayor que cero.");
        }
        return 6 * lado * lado;
    }

    public static double calcularVolumenCubo(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del cubo debe ser mayor que cero.");
        }
        return Math.pow(lado, 3);
    }

    public static double calcularVolumenCono(double radio, double alto) {
        if (radio <= 0 || alto <= 0) {
            throw new IllegalArgumentException("Tanto el radio como la altura del cono deben ser mayores que cero.");
        }
        double pi = Math.PI;
        return (1.0 / 3.0) * pi * radio * radio * alto;
    }
}
