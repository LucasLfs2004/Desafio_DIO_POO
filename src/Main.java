import br.com.lucas.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso Java");
    curso1.setDescricao("descrição curso Java");
    curso1.setDocente("Camila");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JS");
    curso2.setDescricao("descricao curso JS");
    curso2.setDocente("Leonardo");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de java");
    mentoria.setDescricao("Descrição de mentoria Java");
    mentoria.setDocente("Camila");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);


    Dev lucasDev = new Dev();
    lucasDev.setNome("Lucas");
    lucasDev.inscreverBootcamp(bootcamp);

    System.out.println("##### Aluno: " + lucasDev.getNome() + " #####");
    System.out.println("Conteúdos Inscritos: " + lucasDev.getConteudosInscritos());
    lucasDev.progredir();
    lucasDev.progredir();
    lucasDev.progredir();
    System.out.println("Conteúdos Inscritos: " + lucasDev.getConteudosInscritos());
    System.out.println("Conteúdos concluídos: " + lucasDev.getConteudosConcluidos());
    System.out.println("XP: " + lucasDev.calcularTotalXp());
    System.out.println(lucasDev.andamentoBootcamp());

    System.out.println("\n--------------------------------------\n");

    Dev joelmaDev = new Dev();
    joelmaDev.setNome("Joelma");
    joelmaDev.inscreverBootcamp(bootcamp);
    System.out.println("##### Aluno: " + joelmaDev.getNome() + " #####");
    System.out.println("Conteúdos Inscritos: " + joelmaDev.getConteudosInscritos());
    joelmaDev.progredir();
    System.out.println("Conteúdos Inscritos: " + joelmaDev.getConteudosInscritos());
    System.out.println("Conteúdos concluídos: " + joelmaDev.getConteudosConcluidos());
    System.out.println("XP: " + joelmaDev.calcularTotalXp());
    System.out.println(joelmaDev.andamentoBootcamp());

  }
}