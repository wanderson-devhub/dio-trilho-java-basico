import java.util.Random;

public class exer01 {
    /*
     * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0- 9. Após isso determine o maior número
     * da matriz e a sua posição (linha, coluna).
     */
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        int maior = 0;
        int lin = 0;
        int col = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    lin = i;
                    col = j;
                }
            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Na linha " + (lin + 1) + " da coluna: " + (col + 1));

    }

}
