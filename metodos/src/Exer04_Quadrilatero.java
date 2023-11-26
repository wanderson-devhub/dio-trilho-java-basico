public class Exer04_Quadrilatero {
    //Esse método aborda a sobrecarga, que é utilizar o mesmo nome do método, porém, adicionando várias listas de paramêtros.

    public static void quadrilatero (double lado) {
        System.out.println("Área do quadrado: " + (lado * lado));
    }

    public static void quadrilatero (double base, double altura) {
        System.out.println("Área do retângulo: " + (base * altura));
    }

    public static void quadrilatero (double baseMaior, double baseMenor, double altura) {
        double area = (baseMaior + baseMenor) * altura / 2;
        System.out.println("Área do trapézio: " + area);
    }

    public static void quadrilatero (float diagonal1, float diagonal2) {
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}
