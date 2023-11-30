package exercicio01;

public class TestaContas {
    public static void main(String[] args) {

        Conta conta = new Conta();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        conta.deposita(1000);
        contaCorrente.deposita(1000);
        contaPoupanca.deposita(1000);

        conta.atualiza(0.01);
        contaCorrente.atualiza(0.01);
        contaPoupanca.atualiza(0.01);

        System.out.println(conta.getSaldo());
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());

    }
}
