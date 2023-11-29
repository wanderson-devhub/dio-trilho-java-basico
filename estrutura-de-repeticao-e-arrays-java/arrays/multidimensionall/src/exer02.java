import java.util.Random;

public class exer02 {
    /*
     * Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o
     * menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.
     */
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz10 = new int[10][10];

        for (int i = 0; i < matriz10.length; i++) {
            for (int j = 0; j < matriz10[i].length; j++) {
                matriz10[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz 10x10 completa: ");
        for (int[] linha : matriz10) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        int linha5 = 4;
        int maiorL5 = 0;
        int menorL5 = Integer.MAX_VALUE;

        for (int i = 0; i < matriz10[linha5].length; i++) {
            if(matriz10[linha5][i] > maiorL5) {
                maiorL5 = matriz10[linha5][i];
            }
            if (matriz10[linha5][i] < menorL5) {
                menorL5 = matriz10[linha5][i];
            }
        }

        System.out.println("\nMaior valor da linha 5: " + maiorL5 + "\nMenor valor da linha 5: " + menorL5);

        int col7 = 7;
        int maiorCol7 = 0;
        int menorCol7 = Integer.MAX_VALUE;

        for (int i = 0; i < matriz10.length; i++) {
            if(matriz10[i][col7] > maiorCol7) {
                maiorCol7 = matriz10[i][col7];
            }
            if (matriz10[i][col7] < menorCol7) {
                menorCol7 = matriz10[i][col7];
            }
        }

        System.out.println("\nMaior valor da coluna 7: " + maiorCol7 + "\nMenor valor da coluna 7: " + menorCol7);

    }
}
