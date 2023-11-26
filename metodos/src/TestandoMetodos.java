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
        Exer03_Emprestimo.calcularValorFinal(1000, Exer03_Emprestimo.getDuasParcelas());
        Exer03_Emprestimo.calcularValorFinal(1000, Exer03_Emprestimo.getTresParcelas());
        Exer03_Emprestimo.calcularValorFinal(1000, 5);

        System.out.println("Testando o quadrilatero");
        Exer04_Quadrilatero.quadrilatero(4);
        Exer04_Quadrilatero.quadrilatero(14d, 19d);
        Exer04_Quadrilatero.quadrilatero(24, 9, 15);
        Exer04_Quadrilatero.quadrilatero(5f, 5f);

        System.out.println("Testando o quadrilatero com return");
        System.out.println(Exer05_Quadrilatero.quadrilatero2(7) + "\n" +
        Exer05_Quadrilatero.quadrilatero2(6d, 6d) + "\n" +
        Exer05_Quadrilatero.quadrilatero2(14, 9, 15) + "\n" +
        Exer05_Quadrilatero.quadrilatero2(6f, 6f));

    }
}
