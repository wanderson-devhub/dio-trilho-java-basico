import java.util.Scanner;

public class exer04 {
    /*
     * Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter
     * 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa específica (compromisso agendado).
     * O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida
     * com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o
     * compromisso armazenado.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] compromissos = new String[31][24];

       boolean sair = false;
       while (!sair) {
           System.out.println("Digite 1 para adicionar um compromisso.");
           System.out.println("Digite 2 para verificar um compromisso.");
           System.out.println("Digite 0 para sair.");
           byte opcao = scan.nextByte();

           if (opcao == 1) {

               boolean diaValido = false;
               int dia = 0;
               while(!diaValido) {
                   System.out.println("Digite o dia do compromisso: ");
                   dia = scan.nextInt();
                   if (dia > 0 && dia <= 31) {
                       diaValido = true;
                   } else {
                       System.out.println("Dia inválido digite novamente!");
                   }
               }

               boolean horaValida = false;
               int hora = 0;
               while (!horaValida) {
                   System.out.println("Digite a hora do compromisso: ");
                   hora = scan.nextInt();
                   if (hora >= 0 && hora <= 24) {
                       horaValida = true;
                   } else {
                       System.out.println("Horá inválida, tente novamente!");
                   }
               }

               dia--;
               System.out.println("Me informe o compromisso: ");
               compromissos[dia][hora] = scan.next();

           } else if (opcao == 2) {
               boolean diaValido = false;
               int dia = 0;
               while(!diaValido) {
                   System.out.println("Digite o dia do compromisso: ");
                   dia = scan.nextInt();
                   if (dia >= 0 && dia <= 31) {
                       diaValido = true;
                   } else {
                       System.out.println("Dia inválido, tente novamente!");
                   }
               }

               boolean horaValida = false;
               int hora = 0;

               while (!horaValida) {
                   System.out.println("Digite a hora do compromisso: ");
                   hora = scan.nextInt();
                   if (hora >= 0 && hora <= 24) {
                       horaValida = true;
                   } else {
                       System.out.println("Hora inválida, tente novamente!");
                   }
               }
               dia--;
               System.out.println("Seu compromisso é: ");
               System.out.println(compromissos[dia][hora]);

           } else if (opcao == 0) {
               sair = true;
           } else {
               System.out.println("Operação inválida, tente novamente!");
           }
           System.out.println();
       }

    }
}
