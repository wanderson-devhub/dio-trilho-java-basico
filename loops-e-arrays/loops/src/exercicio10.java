import java.util.Scanner;

public class exercicio10 {
    //Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido
    // por eles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        if(numero1 < numero2) {
            do {
                System.out.println(numero1++);
            } while (numero1 < numero2);

        } else if (numero1 > numero2) {
            do {
                System.out.println(numero1--);
            } while (numero1 > numero2);
        }

    }
}
