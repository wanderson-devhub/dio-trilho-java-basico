package exercicio01;

public class ContaPoupanca extends Conta{

    //Método reescrito para atribuir uma taxa tripla toda vez que atualizar.
    public void atualiza (double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
