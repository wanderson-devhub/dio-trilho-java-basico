package map;

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("\n---\tOrdem aleatória\t---");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Hawking, Setphen", new Livro ("Uma Breve História do Tempo", 255));
            put(" Duhigg, Charles", new Livro ("O Poder do Hábito", 408));
            put(" Harari, Yubal Noah", new Livro ("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n---\tOrdem Inserção\t---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" Hawking, Setphen", new Livro ("Uma Breve História do Tempo", 255));
            put(" Duhigg, Charles", new Livro ("O Poder do Hábito", 408));
            put(" Harari, Yubal Noah", new Livro ("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livros : meusLivros1.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("\n---\tOrdem alfabética autores\t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livros : meusLivros2.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("\n---\tOrdem alfabética nomes dos livros\t---");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNomesLivros());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livros : meusLivros3)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("\n---\tOrdem número de página\t---");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livros : meusLivros4)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome() + " - " +
                    livros.getValue().getPaginas());
    }

}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNomesLivros implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorNumeroPagina implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> lp1, Map.Entry<String, Livro> lp2) {
        return Integer.compare(lp1.getValue().getPaginas(), lp2.getValue().getPaginas());
    }
}