package set;

import java.util.*;

/*
 Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
 Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
 a) Ordem de inserção;
 b) Ordem natural(nome);
 c) IDE;
 d) Ano de criação e nome;
 e) Nome, ano de criação e IDE;
 Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Set<LinguagemFav> minhasLinguagensFav = new HashSet<>();
        minhasLinguagensFav.add(new LinguagemFav("Java", 1995, "IntelliJ"));
        minhasLinguagensFav.add(new LinguagemFav("Kotlin", 2011, "Android Studio"));
        minhasLinguagensFav.add(new LinguagemFav("C#", 2002, "Visual Studio"));

        System.out.println("\n--------\tOrdem de Inserção\t--------");
        Set<LinguagemFav> minhasLinguagensFav1 = new LinkedHashSet<>(Arrays.asList(new LinguagemFav("Java", 1995, "IntelliJ"),
                new LinguagemFav("Kotlin", 2011, "Android Studio"),
                new LinguagemFav("C#", 2002, "Visual Studio")
                )
        );

        for (LinguagemFav linguagem : minhasLinguagensFav1) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFav> minhasLinguagensFav2 = new TreeSet<>(minhasLinguagensFav);
        for (LinguagemFav linguagem : minhasLinguagensFav2) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem IDE\t--------");
        Set<LinguagemFav> minhasLinguagensFav3 = new TreeSet<LinguagemFav>(new ComparatorIde1());
        minhasLinguagensFav3.addAll(minhasLinguagensFav);
        for (LinguagemFav linguagem : minhasLinguagensFav3) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFav> minhasLinguagensFav4 = new TreeSet<LinguagemFav>(new ComparatorAnoCriacaoNome());
        minhasLinguagensFav4.addAll(minhasLinguagensFav);
        for (LinguagemFav linguagem : minhasLinguagensFav4) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFav> minhasLinguagensFav5 = new TreeSet<LinguagemFav>(new ComparatorNomeAnoCriacaoIDE());
        minhasLinguagensFav5.addAll(minhasLinguagensFav);
        for (LinguagemFav linguagem : minhasLinguagensFav5) System.out.println(linguagem);

    }
}



class LinguagemFav implements Comparable<LinguagemFav> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFav(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFav linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFav that = (LinguagemFav) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

}

class ComparatorIde1 implements Comparator<LinguagemFav> {
    @Override
    public int compare(LinguagemFav lf1, LinguagemFav lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFav> {
    @Override
    public int compare(LinguagemFav lf1, LinguagemFav lf2) {
        int anoCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if(anoCriacao != 0) return anoCriacao;

        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoCriacaoIDE implements Comparator<LinguagemFav> {
    @Override
    public int compare(LinguagemFav lf1, LinguagemFav lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        if (nome != 0) return nome;

        int anoCriacao = lf1.anoDeCriacao.compareTo(lf2.anoDeCriacao);
        if (anoCriacao != 0) return anoCriacao;

        return lf1.ide.compareToIgnoreCase(lf2.ide);

    }
}