import java.util.Scanner;

public class exercicio05 {
    /*  Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor
     *  PAR e os números IMPARES no vetor impar. Imprima os três vetores
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorNumeros = new int[20];
        int[] vetorPAR = new int[vetorNumeros.length];
        int[] vetorIMPAR = new int[vetorNumeros.length];

        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetorNumeros[i] = sc.nextInt();

            if(vetorNumeros[i] % 2 == 0){
                vetorPAR[i] = vetorNumeros[i];
            }

            if(vetorNumeros[i] % 2 != 0){
                vetorIMPAR[i] = vetorNumeros[i];
            }
        }

        System.out.println("\nTodos os números informados: ");
        for(int i = 0; i < vetorNumeros.length; i++){
                System.out.print(vetorNumeros[i] + " ");
        }

        System.out.println("\n=================================");
        System.out.println("\nVALORES PARES: ");
        for(int i = 0; i < vetorNumeros.length; i++){
            if (vetorPAR[i] != 0) {
                System.out.print(vetorPAR[i] + " ");
            }
        }

        System.out.println("\nVALORES IMPARES: ");
        for(int i = 0; i < vetorNumeros.length; i++){
            if (vetorIMPAR[i] != 0) {
                System.out.print(vetorIMPAR[i] + " ");
            }
        }


    }
}
