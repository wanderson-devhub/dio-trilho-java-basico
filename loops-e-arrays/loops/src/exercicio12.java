import java.util.Scanner;

public class exercicio12 {
    //Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve
    // informar de qual numero ele deseja ver a tabuada.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe qual tabuada deseja visualizar: ");
        int escolhaDaTabuada = teclado.nextInt();

        System.out.println("Informe entre o número 1 a 10: ");
        int numeroDaTabuada = teclado.nextInt();

        for(int contador = 1; contador <= numeroDaTabuada; contador++){

            int resultado = escolhaDaTabuada * contador;
            System.out.println(escolhaDaTabuada +  " x " + contador + " = " + resultado);
        }

    }
}
