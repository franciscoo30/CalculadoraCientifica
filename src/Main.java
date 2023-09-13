import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public static int primerNumero() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        int numero1 = reader.nextInt();
        return numero1;
    }
    public static int segundoNumero() {
        Scanner reader = new Scanner(System.in);
        int numero2 = reader.nextInt();
        System.out.println("Escriba el segundo numero");
        return numero2;
    }
    public static void mayorNumero(int numero1,int numero2) {
        System.out.println("El mayor de los dos números es " + Math.max(numero1, numero2));
    }
    public static void menorNumero(int numero1,int numero2) {
        System.out.println("El menor de los dos números es " + Math.min(numero1, numero2));
    }
    public static void potenciaDosNumeros(int numero1,int numero2) {
        System.out.println("La potencia del primer numero elevado por el segundo numero es " + Math.pow(numero1, numero2));
    }
    public void calcularPorcentaje(double porcent, double numero){
        double resultado;
        resultado = (porcent / 100) * numero;
        System.out.println("El porcentaje "+ porcent +" del numero "+ numero +" es " +resultado);
    }
}