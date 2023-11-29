import java.util.Scanner;

public class exer03 {
    /*
     * Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz
     * criada e encontre a quantidade de números pares, a quantidade de números ímpares.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz3x3 = new int[3][3];

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                System.out.println("Digite os valores da linha " + (i + 1) + ": ");
                matriz3x3[i][j] = sc.nextInt();
            }
        }

        int valoresPar = 0;
        int valoresImpar = 0;

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                if (matriz3x3[i][j] % 2 == 0) {
                    valoresPar++;
                }
                if (matriz3x3[i][j] % 2 != 0) {
                    valoresImpar++;
                }
            }
        }

        System.out.println("Matriz 3x3: ");
        for (int[] linha : matriz3x3) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de valores pares: " + valoresPar);
        System.out.println("Quantidade de valores impares: " + valoresImpar);
    }
}
