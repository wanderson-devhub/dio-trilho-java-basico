public class exercicio04 {
    /*
     * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e
     * que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e
     * escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,
     * mantidas as taxas de crescimento.
     */

    public static void main(String[] args) {

        double populacaoA = 80000;
        double populacaoB = 200000;
        double taxaCrescA = 3.0;
        double taxaCrescB = 1.5;
        int anos;

        for(anos = 1; populacaoA <= populacaoB; anos++) {
            populacaoA *= taxaCrescA;

        }

        System.out.println("Quantidade de anos para ultrapassar: " + anos);



    }

}
