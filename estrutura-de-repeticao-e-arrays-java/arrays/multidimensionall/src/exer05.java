import java.util.Scanner;

public class exer05 {
    /*
     * Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, dia e hora
     * (só 8 horas por dia).
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][][] compromissos = new String[12][31][24];

       boolean sair = false;
       while (!sair) {
           System.out.println("Digite 1 para adicionar um compromisso.");
           System.out.println("Digite 2 para verificar um compromisso.");
           System.out.println("Digite 0 para sair.");
           byte opcao = scan.nextByte();

           if (opcao == 1) {

               boolean mesValido = false;
               int mes = 0;
               while(!mesValido) {
                   System.out.println("Digite mês do compromisso: ");
                   mes = scan.nextInt();
                   if (mes > 0 && mes <= 12) {
                       mesValido = true;
                   } else {
                       System.out.println("Mês inválido digite novamente!");
                   }
               }

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
                   if (hora >= 0 && hora <= 8) {
                       horaValida = true;
                   } else {
                       System.out.println("Horá inválida, tente novamente!");
                   }
               }

               mes--;
               dia--;
               System.out.println("Me informe o compromisso: ");
               compromissos[mes][dia][hora] = scan.next();

           } else if (opcao == 2) {

               boolean mesValido = false;
               int mes = 0;
               while(!mesValido) {
                   System.out.println("Digite mês do compromisso: ");
                   mes = scan.nextInt();
                   if (mes > 0 && mes <= 12) {
                       mesValido = true;
                   } else {
                       System.out.println("Mês inválido digite novamente!");
                   }
               }

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
                   if (hora >= 0 && hora <= 8) {
                       horaValida = true;
                   } else {
                       System.out.println("Hora inválida, tente novamente!");
                   }
               }

               mes--;
               dia--;
               System.out.println("Seu compromisso é: ");
               System.out.println(compromissos[mes][dia][hora]);

           } else if (opcao == 0) {
               sair = true;
           } else {
               System.out.println("Operação inválida, tente novamente!");
           }
           System.out.println();
       }

    }
}
