package exercicio01;

public class Conta {
    //Classe que possui um saldo, também os métodos para pegar saldo, depositar e sacar.
    protected double saldo;

    public void deposita (double valor) {
        this.saldo += valor;
    }

    public void saca (double valorSacar){
        this.saldo -= valorSacar;
    }

    public double getSaldo () {
        return this.saldo;
    }

    //Método que atualiza a conta de acordo com uma taxa percentual fornecida.
    public void atualiza (double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
