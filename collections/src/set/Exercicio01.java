package set;

import java.util.*;

public class Exercicio01 {

    /*
    Crie uma conjunto contendo as cores do arco-íris e:
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
    */

    public static void main(String[] args) {

        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> coresDoArcoIris = new HashSet<>();
        coresDoArcoIris.add("violeta");
        coresDoArcoIris.add("anil");
        coresDoArcoIris.add("azul");
        coresDoArcoIris.add("verde");
        coresDoArcoIris.add("amarelo");
        coresDoArcoIris.add("laranja");
        coresDoArcoIris.add("vermelho");
        System.out.println(coresDoArcoIris);

        System.out.println("\nExiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cores : coresDoArcoIris) System.out.println(cores);

        System.out.println("\nA quantidade de cores que o arco-íris tem: " + coresDoArcoIris.size());

        System.out.println("\nExiba as cores em ordem alfabética: ");
        Set<String> coresDoArcoIris2 = new TreeSet<>(coresDoArcoIris);
        System.out.println(coresDoArcoIris2);

        System.out.println("\nExiba as cores na ordem inversa da que foi informada ");
        Set<String> coresDoArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresDoArcoIris3);
        List<String> ordemInversa = new ArrayList<>(coresDoArcoIris3);
        Collections.reverse(ordemInversa);
        System.out.println(ordemInversa);

        System.out.println("\nExiba todas as cores que começam com a letra ”v”: ");
        for (String cores: coresDoArcoIris)
            if (cores.startsWith("v")) System.out.println(cores);

        System.out.println("\nRemova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresDoArcoIris.iterator();
        while (iterator2.hasNext())
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        System.out.println(coresDoArcoIris);

        System.out.println("\nLimpe o conjunto: ");
        coresDoArcoIris.clear();

        System.out.println("\nConfira se o conjunto está vazio: " + coresDoArcoIris.isEmpty());

    }

}