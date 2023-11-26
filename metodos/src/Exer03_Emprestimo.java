public class Exer03_Emprestimo {

    /*
     * Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
     * Defina arbitrariamente as faixas que influenciam nos valores.
     */

    public static int getDuasParcelas() { return 2; }

    public static int getTresParcelas() { return 3; }

    public static double getTaxaDuasParcelas() { return 0.3; }

    public static double getTaxaTresParcelas() { return 0.45; }

    public static void calcularValorFinal (double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final para o emprestimo de duas parcelas R$: " + valorFinal);

        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final para o emprestimo de três parcelas R$: " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
