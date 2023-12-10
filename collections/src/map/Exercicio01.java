package map;

/*
    Dada a população estimada de alguns estados do nordeste brasileiro, faça:
    Estado = PE - população = 9.616.621
    Estado = AL - população = 3.351.543
    Estado = CE - população  = 9.187.103
    Estado = RN - população = 3.534.265
 */

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {

        Map<String, Integer> populacaoNordeste = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoNordeste.toString());

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165" + populacaoNordeste.put("RN", 3534165));
        System.out.println(populacaoNordeste.toString());

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        Set<Map.Entry<String, Integer>> populacaoNordeste1 = new HashSet<>();
        populacaoNordeste1.addAll(populacaoNordeste.entrySet());
        for(Map.Entry<String, Integer> populacoes : populacaoNordeste1) {
            if (!populacoes.getKey().equals("PB")) {
                populacaoNordeste.put("PB", 4039277);
            }
        }
        System.out.println(populacaoNordeste.toString());

        System.out.println("\nExibindo a população de PE: " + populacaoNordeste.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> populacaoNordeste2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoNordeste2.toString());

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoNordeste3 = new TreeMap<>(populacaoNordeste);
        System.out.println(populacaoNordeste3);

        System.out.println("\nExiba o estado com a menor população e sua quantidade: ");

        Integer menorQtdPopulacao = Collections.min(populacaoNordeste.values());
        Set<Map.Entry<String, Integer>> populacaoNordeste4 = new HashSet<>();
        populacaoNordeste4.addAll(populacaoNordeste.entrySet());
        String menorPopulacao;

        for (Map.Entry<String, Integer> populacoes : populacaoNordeste4) {
            if (populacoes.getValue().equals(menorQtdPopulacao)) {
                menorPopulacao = populacoes.getKey();
                System.out.println("Menor população " + menorPopulacao + " - " + menorQtdPopulacao);
            }
        }

        System.out.println("\nExiba o estado com a menor população e sua quantidade: ");

        Integer maiorQtdPopulacao = Collections.max(populacaoNordeste.values());
        String maiorPopulacao;
        for (Map.Entry<String, Integer> populacoes : populacaoNordeste.entrySet()) {
            if (populacoes.getValue().equals(maiorQtdPopulacao)) {
                maiorPopulacao = populacoes.getKey();
                System.out.println("Menor população " + maiorPopulacao + " - " + maiorQtdPopulacao);
            }
        }

        System.out.println("\nExiba a soma da população desses estados: ");
        Iterator<Integer> iterator = populacaoNordeste.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + soma / populacaoNordeste.size());

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoNordeste.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(populacaoNordeste.toString());

        System.out.println("Apague os dicionário de estados");
        populacaoNordeste.clear();

        System.out.println("Confira se o dicionário está vazio: " + populacaoNordeste.isEmpty());

    }

}
