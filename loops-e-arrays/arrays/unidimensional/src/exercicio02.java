import java.util.Scanner;

public class exercicio02 {
    //Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Informe o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextDouble();
        }

        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }



    }
}
