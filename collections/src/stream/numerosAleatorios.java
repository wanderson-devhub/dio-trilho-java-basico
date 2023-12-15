package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class numerosAleatorios {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        
        //Colocando dentro de uma variável:
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");

        //------------
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //.forEach(System.out::println);

        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");

        List<Integer> ListParesMaioresQueDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQueDois);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os números impares: ");
        //Não é um método de stream e sim de list, se fosse uma stream não iria alterar.
        numerosAleatoriosInteger.removeIf(i -> (i % 2 !=0));

        System.out.println(numerosAleatoriosInteger);





    }
}
