import java.util.Scanner;

public class exer03 {
    //Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        double soma = 0, media = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];

        }

        media = soma / notas.length;

        System.out.printf("Média total: %.1f", media);

    }
}
