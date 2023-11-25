import java.util.Scanner;

public class exercicio08 {
    //Faça um programa que leia 5 números e informe a soma e a média dos números.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;
        int soma = 0;
        int media = 0;

        while(cont <= 5){
            System.out.println("Digite o número " + cont + "º ");
            int numero = sc.nextInt();

            soma += numero;
            cont++;
        }

        media = soma / 5;
        System.out.println("Soma: " + soma + "\nMédia: " + media);
    }
}
