import br.com.omatheusdutra.desafio.dominio.*;


import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Iniciante");
        cursoJava.setDescricao("Neste curso, aprenda sobre o melhor da técnologia por trás da linguagem Java");
        cursoJava.setCargaHoraria(20);

        Curso cursoSpringBoot = new Curso();
        cursoSpringBoot.setTitulo("Curso Spring Boot");
        cursoSpringBoot.setDescricao("Aprenda sobre uma das maiores ferramentas do Java");
        cursoSpringBoot.setCargaHoraria(6);

        Mentoria mentoriaIntellij = new Mentoria();
        mentoriaIntellij.setTitulo("Mentoria IDE - Intellij");
        mentoriaIntellij.setDescricao("Aprenda os Atalhos, os Truques e Plugins para ser mais produtivo no Intellij");
        mentoriaIntellij.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Neste Bootcamp aprenda sobre Java e ainda mais!");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoSpringBoot);
        bootcampJava.getConteudos().add(mentoriaIntellij);

        System.out.println("---------------------------------------------------------------------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudoInscritos());
        devMatheus.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Matheus: " + devMatheus.getConteudoConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Renato: " + devRenato.getConteudoInscritos());
        devRenato.progredir();
        System.out.println("----- LISTA ATUALIZADA -----");
        System.out.println("Conteúdos Inscritos Renato: " + devRenato.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Renato: " + devRenato.getConteudoConcluidos());
        System.out.println("XP: " + devRenato.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------");

    }
}
