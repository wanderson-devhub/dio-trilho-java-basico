import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Kotlin");
        curso2.setDescricao("Descrição curso Kotlin");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWanderson = new Dev();
        devWanderson.setNome("Wanderson");
        devWanderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Wanderson" + devWanderson.getConteudosInscritos());
        devWanderson.progredir();
        devWanderson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Wanderson" + devWanderson.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Wanderson" + devWanderson.getConteudosConcluidos());
        System.out.println("XP:" + devWanderson.calcularXp());

        System.out.println("-------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularXp());
    }
}
