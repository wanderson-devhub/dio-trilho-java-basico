package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("\n---\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n---\tOrdem Natural (Nome) \t---");
        Collections.sort(meusGatos);
        //Aqui será organizado pelo o nome dos gatos, então se houver nomes parecidos eles virão um após ao outro.
        System.out.println(meusGatos);

    }
}

//Para em ordem naturail na classe deve implementar o método Comparable
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato (String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() { return nome;}

    public Integer getIdade() { return idade; }

    public String getCor() { return cor; }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //Com a implementação acima, isso obriga a sobscrever o método CompareTo
    //O método compareTo retorna um int, que então vai ser organizado na ordem.
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    /*
     * a- Quando o retorno for 0 quer dizer que o gato que está sendo comparado com outro gato dentro da lista, está
     * dizendo que ambos tem nomes iguais.
     * b- Se der 1 é porque o gato que está sendo comparado deve ficar depois, nesse caso é maior do que o gato do comparativo.
     * c- Se o resultado desse retorno der -1 quer dizer que o gato(nome) está comparado, o efeito de comparação é menor
     * do que o gasto que está comparado
     */

}