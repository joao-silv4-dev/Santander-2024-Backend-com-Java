package dio.desafio.abstraindoBootcampUsandoPOO;

import java.time.LocalDateTime;
import java.time.Month;

import dio.desafio.abstraindoBootcampUsandoPOO.model.*;

public class App {
    public static void main(String[] args) {
        Atividade curso = new Curso("Curso de introdução a Java",
                "Curso básico de introdução a POO",
                2);
        Atividade curso2 = new Curso("Curso de especialização do Java",
                "Curso nivel intermediário/avançado de Java",
                5);

        Atividade mentoria = new Mentoria("Mentoria sobre Java",
                "Explicando o porquê Java é importante.",
                LocalDateTime.of(2026, Month.OCTOBER, 03, 4, 26));

        Bootcamp bootcamp = new Bootcamp("Bootcamp de java", "Curso de java");
        bootcamp.setAtividadesDoBootcamp(mentoria);
        bootcamp.setAtividadesDoBootcamp(curso);
        bootcamp.setAtividadesDoBootcamp(curso2);

        Dev joaoDev = new Dev("João");
        Dev brendaDev = new Dev("Brenda");

        joaoDev.adicionarBootcampInscrito(bootcamp);
        brendaDev.adicionarBootcampInscrito(bootcamp);

        joaoDev.progredir();
        joaoDev.progredir();
        brendaDev.progredir();

        System.out.println("========== CONTEUDOS INSCRITOS ============");
        System.out.println("===== João =====");
        System.out.println(joaoDev.getAtividadesInscritas());
        System.out.println("===== Brenda =====");
        System.out.println(brendaDev.getAtividadesInscritas());

        System.out.println("========== CONTEUDOS CONCLUIDOS ============");
        System.out.println("===== João =====");
        System.out.println(joaoDev.getAtividadesConcluidas());
        System.out.println("===== Brenda =====");
        System.out.println(brendaDev.getAtividadesConcluidas());

    }
}
