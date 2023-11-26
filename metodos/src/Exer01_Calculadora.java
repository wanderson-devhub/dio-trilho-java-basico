public class Exer01_Calculadora {
    // Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.

    public static void soma (int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("Resultado da soma: " + resultado);
    }

    public static void subtracao (double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("Resultado da subtração: " + resultado);
    }

    public static void multiplicacao (double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("Resultado da multiplicação: " + resultado);
    }

    public static void divisao (double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("Resultado da divisão: " + resultado);
    }

}
