public class exercicio09 {
    //Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
    public static void main(String[] args) {

        int numeros = 0;
        for(int i = 1; numeros < 50; i++){
            numeros++;

            if(numeros % 2 != 0){
                System.out.println(numeros);
            }

        }

    }
}
