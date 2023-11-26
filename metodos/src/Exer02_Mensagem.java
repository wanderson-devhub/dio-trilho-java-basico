public class Exer02_Mensagem {
    // A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.

    public static void mostrarMensagem(int horaDoDia) {
        switch (horaDoDia) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Bom dia!");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Boa tarde");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Expressão inválida!");
                break;

        }
    }
}
