import java.util.Scanner;

public class exercicio11 {
    //Altere o programa anterior para mostrar no final a soma dos números.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        int soma = 0;
        if(numero1 <= numero2) {
            do {
                soma += numero1;
                System.out.println(numero1++);

            } while (numero1 < numero2);

        } else if (numero1 > numero2) {
            do {
                System.out.println(numero1--);
                soma += numero1;
            } while (numero1 > numero2);
        }

        System.out.println("Soma: " + soma);

    }
}
