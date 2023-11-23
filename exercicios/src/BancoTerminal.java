public class BancoTerminal {
    public static void main(String[] args) {

        //Programa que simula uma operação de saque.
        double saldo = 15.0;
        double valorSolicitado = 22.0;
        //If para verificar se o saldo é maior que o valor solicitado, caso for true o controle de fuxo será executado.
        if(saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;

        //Se não atender a primeira condição, irá mostrar a seguinte mensagem.
        } else {
            System.out.println("Saldo insuficiente");
        }
        //Essa saida indica o valor alterado ou mantido, dependendo do valor solicitado.
        System.out.println("Valor do saldo: " + saldo);

    }
}
