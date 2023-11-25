import java.util.Scanner;

public class exercicio03 {
    /* Faça um programa que leia e valide as seguintes informações:
     *  Nome: maior que 3 caracteres;
     *  Idade: entre 0 e 150;
     *  Salário: maior que zero;
     *  Sexo: 'f' ou 'm';
     *  Estado Civil: 's', 'c', 'v', 'd';
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        double salario = 0.0;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("Informe seu nome: ");
            nome = sc.nextLine();

            if (nome.length() <= 3) {
                System.out.println("O nome deve ser maior que 3 caracteres.");
            }
        } while (nome.length() <= 3);

        do {
            System.out.println("\nInforme sua idade: ");
            idade = sc.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("A idade deve está entre 0 e 150.");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("\nInforme seu salário: ");
            salario = sc.nextDouble();

            if (salario < 0) {
                System.out.println("Sálario deve ser maior que 0.");
            }

        } while (salario < 0);


        System.out.println("Seu sexo('m' ou 'f'): ");
        sexo = sc.next().charAt(0);

        System.out.println("Estado civil?\n's' - solteiro \n'c'- casado \n'v' - viuvo(a) \n'd' - divorciado(a)");
        estadoCivil = sc.next().charAt(0);

        sc.close();

    }
}
