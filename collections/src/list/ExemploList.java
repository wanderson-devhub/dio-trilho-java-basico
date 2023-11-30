package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();

        notas.add(10d);
        notas.add(9.5);
        notas.add(5.0);
        notas.add(7d);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(6.0);

        System.out.println(notas.toString());

        System.out.println("Posição da nota 7d: " + notas.indexOf(7d));

        System.out.println("Adicionando na lista a nota 8.0 na posição 4");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substituindo a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Conferindo se a nota 4.0 está na lista: " + notas.contains(4.0));

        /* System.out.println("Mostrando todas as notas em que foram informados: ");
         * for (double nota : notas) System.out.println(nota);
         */


        System.out.println("Exibindo a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exibindo menor nota: " + Collections.min(notas));
        System.out.println("Exibindo maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibindo soma dos valores: " + soma);

        System.out.println("Exibindo média dos valores: " + soma / notas.size());

        System.out.println("Removendo a nota 2.0");
        notas.remove(2.0d);
        System.out.println(notas);

        System.out.println("Removendo a posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Removendo e exibindo notas menores que 7 da lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando todos os valores da lista");
        notas.clear();

        System.out.println(notas);

        System.out.println("Conferindo se a lista está vazia: " + notas.isEmpty());

        //Exercicios
        System.out.println();
        List<Double> notas2 = new LinkedList<Double>();
        System.out.println("Criando uma lista chamada notas2");
        notas2.add(5d);
        notas2.add(9.0);
        notas2.add(7.0);
        notas2.add(8.0);

        System.out.println(notas2);

        System.out.println("Mostrando a primeira nota da nova lista sem remover: " + notas2.get(0));

        notas2.remove(5.0d);
        System.out.println("Mostrando a primeira nota da nova lista removida: " + notas2.get(0));
    }

}
