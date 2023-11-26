public class Exer05_Quadrilatero {
    //Modificando o exercício 04 para retornar valores.

    public static double quadrilatero2 (double lado) { return lado * lado; }

    public static double quadrilatero2 (double base, double altura) { return base * altura; }

    public static double quadrilatero2 (double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float quadrilatero2 (float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
}
