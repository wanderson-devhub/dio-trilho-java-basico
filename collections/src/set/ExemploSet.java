package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Conferindo se a nota 5 está no conjunto: " + notas.contains(5d));

        System.out.println("Exibindo maior nota: " + Collections.min(notas));
        System.out.println("Exibindo menor nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        System.out.println("Exibindo a média dos valores: " + soma / notas.size());

        System.out.println("Removendo a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Removendo as notas menores que 7 e exibindo a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exibindo todas as notas em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        //Obs: criando um Arrays.asList(); também funciona.
        System.out.println(notas2);

        System.out.println("Colocando as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagando todos os valores das notas: ");
        notas.clear();

        System.out.println("Conferindo se notas está vazio: " + notas.isEmpty());
        System.out.println("Conferindo se notas2 está vazio: " + notas2.isEmpty());
        System.out.println("Conferindo se notas3 está vazio: " + notas3.isEmpty());

    }
}
