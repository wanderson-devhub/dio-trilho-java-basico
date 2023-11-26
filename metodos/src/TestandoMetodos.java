public class TestandoMetodos {
    public static void main (String[] args) {

        System.out.println("Testando a calculadora: ");
        Exer01_Calculadora.soma(5, 3);
        Exer01_Calculadora.subtracao(10, 5);
        Exer01_Calculadora.multiplicacao(7, 5);
        Exer01_Calculadora.divisao(7, 64.5);

        System.out.println("Testando a mensagem de bom dia, boa tarde e boa noite.");
        Exer02_Mensagem.mostrarMensagem(5);
        Exer02_Mensagem.mostrarMensagem(15);
        Exer02_Mensagem.mostrarMensagem(19);
        Exer02_Mensagem.mostrarMensagem(27);

        System.out.println("Testando o empréstimo");
        Exer03_Emprestimo.calcularValorFinal(800, Exer03_Emprestimo.getDuasParcelas());
        Exer03_Emprestimo.calcularValorFinal(900, Exer03_Emprestimo.getTresParcelas());
        Exer03_Emprestimo.calcularValorFinal(500, 5);

    }
}
