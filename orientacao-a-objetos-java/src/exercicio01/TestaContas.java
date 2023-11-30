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

        AtualizadorDeContas  adc = new AtualizadorDeContas(0.01);

        adc.roda(conta);
        adc.roda(contaCorrente);
        adc.roda(contaPoupanca);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
