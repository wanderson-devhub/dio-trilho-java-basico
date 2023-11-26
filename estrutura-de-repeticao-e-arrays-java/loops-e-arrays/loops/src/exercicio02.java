import java.util.Scanner;

public class exercicio02 {
    /* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
     * mostrando uma mensagem de erro e voltando a pedir as informações.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        do {
            System.out.println("Erro, os caracteres devem ser diferente!\n");

            System.out.print("Usuário: ");
            usuario = sc.nextLine();

            System.out.print("Senha: ");
            senha = sc.nextLine();
        }while (usuario.equals(senha));

        sc.close();
    }
}
