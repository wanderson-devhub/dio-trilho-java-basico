package exercicio01;

public class ContaCorrente extends Conta{

    //Método reescrito para atribuir uma taxa dupla toda vez que atualizar.
    @Override
    public void  atualiza (double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public void deposita (double valor) {
        this.saldo += valor - 0.10;
    }
}
