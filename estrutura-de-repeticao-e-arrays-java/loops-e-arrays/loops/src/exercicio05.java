import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    /*
     *  Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
     *  Valide a entrada e permita repetir a operação.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.println("Informe a quantidade de habitantes da população A");
            double populacaoA = sc.nextDouble();

            System.out.println("Informe a taxa de crescimento anual");
            double taxaCrescA = sc.nextDouble();

            System.out.println("Informe a quantidade de habitantes da população B");
            double populacaoB = sc.nextDouble();

            System.out.println("Informe a taxa de crescimento anual");
            double taxaCrescB = sc.nextDouble();

            int anos;
            for (anos = 1; populacaoA <= populacaoB; anos++) {
                populacaoA *= taxaCrescA;

            }

            System.out.println("Quantidade de anos para ultrapassar: " + anos);

            System.out.println("\nDesejar repetir a operação? (Y/N)\n");
            resp = sc.next().charAt(0);

        } while (resp == 'Y' || resp == 'y');

        sc.close();

    }
}
