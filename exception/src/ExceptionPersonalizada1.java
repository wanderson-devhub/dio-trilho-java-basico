import javax.swing.*;

public class ExceptionPersonalizada1 {
    public static void main(String[] args) {
        int[] numerador = {4, 12, 8, 10};
        int[] denominador = {2, 4, 2, 2, 8};

        boolean continueLooping = true;
        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                    int resultado = numerador[i] / denominador[i];
                    System.out.println(resultado);

            } catch (DivisaoNaoExataException e) {
                // Exceção específica
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro na divisão: " + e.getMessage());
            } catch (ArithmeticException e) {
                // Exceção aritmética
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro aritmético: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                // Exceção de índice fora do limite
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro de índice: " + e.getMessage());
            }

            if (numerador[i] > denominador.length) {
                System.exit(0);
            }
        }


        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception {
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}