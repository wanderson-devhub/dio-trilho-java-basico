import java.util.Scanner;

public class exercicio01 {
    /*
     * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
     * pedindo até que o usuário informe um valor válido.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota (0 à 10)");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor invalido! \nDigite novamente...");
            nota = sc.nextInt();
        }

        sc.close();
    }
}
