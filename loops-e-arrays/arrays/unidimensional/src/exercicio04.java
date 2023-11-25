import java.util.Scanner;

public class exercicio04 {
    //Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letra = new char[10];

        for(int i = 0; i < letra.length; i++){
            System.out.println("Digite uma letra: ");
            letra[i] = sc.next().charAt(0);
        }

        System.out.println("\nConsoantes: ");
        for(int i = 0; i < letra.length; i++){
            if(letra[i] != 'a' &&
               letra[i] != 'e' &&
               letra[i] != 'i' &&
               letra[i] != 'o' &&
               letra[i] != 'u'){

                System.out.println(letra[i]);
            }

        }
    }
}
