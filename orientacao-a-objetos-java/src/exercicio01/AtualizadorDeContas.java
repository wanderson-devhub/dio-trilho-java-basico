package exercicio01;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas (double selic) {
        this.selic = selic;
    }

    public void roda (Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo final: " + c.getSaldo());
        saldoTotal += c.getSaldo();
        System.out.println();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
