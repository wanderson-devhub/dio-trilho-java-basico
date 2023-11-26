import java.util.Scanner;

public class exercicio07 {
    //Faça um programa que leia 5 números e informe o maior número.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int maiorNumero = 0;

        while(cont <= 5){
            System.out.println("Digite o número " + cont + "º ");
            int numero = sc.nextInt();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            cont++;
        }

        System.out.println("Maior numero: " + maiorNumero);

    }
}
