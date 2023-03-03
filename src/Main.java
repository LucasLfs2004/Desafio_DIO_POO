import br.com.lucas.desafio.dominio.Curso;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso Java");
    curso1.setDescricao("descrição curso Java");
    curso1.setCargaHoraria(8);

    System.out.println(curso1);
  }
}