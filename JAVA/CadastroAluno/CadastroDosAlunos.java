package CadastroAluno;

// import java.lang.reflect.Array;
import java.util.*;

public class CadastroDosAlunos {
  public static void main(String[] args) {
    escola();

  }

  public static void escola() {
    String nome, turma, materia;
    double nota1, nota2, media;
    int idade;

    Scanner entrada = new Scanner(System.in);
    Stack<Aluno> alunos = new Stack<>();

    for (int i = 0; i < 1; i++) {
      System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
      nome = entrada.next();
      System.out.println("Digite a idade do aluno " + (i + 1) + ": ");
      idade = entrada.nextInt();
      System.out.println("Digite a turma do aluno " + (i + 1) + ": ");
      turma = entrada.next();
      System.out.println("Digite a materia do aluno " + (i + 1) + ": ");
      materia = entrada.next();
      System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
      nota1 = entrada.nextDouble();
      System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
      nota2 = entrada.nextDouble();
      media = calcularMedia(nota1, nota2);

      alunos.push(new Aluno(nome, idade, turma, materia, nota1, nota2, media));

    }
    entrada.close();

    // Exibindo os alunos cadastrados
    System.out.println("\n--- Alunos cadastrados ---");
    for (Aluno a : alunos) {
      System.out.println("Nome: " + a.getNome() +
          ", Idade: " + a.getIdade() +
          ", Turma: " + a.getTurma() +
          ", Matéria: " + a.getMateria() +
          ", Média: " + a.getMedia());
    }
  }

  public static double calcularMedia(double nota1, double nota2) {
    double media = (nota1 + nota2) / 2;
    return media;
  }

  static class Aluno {
    String nome, materia, turma;
    int idade;

    // construtor
    public Aluno(String nome, int idade, String turma, String materia, double nota1, double nota2, double media) {
      this.nome = nome;
      this.idade = idade;
      this.turma = turma;
      this.materia = materia;
      this.nota1 = nota1;
      this.nota2 = nota2;
      this.media = media;
    }

    public String getNome() {
      return nome;
    }

    public int getIdade() {
      return idade;
    }

    public String getTurma() {
      return turma;
    }

    public String getMateria() {
      return materia;
    }

    public double getNota1() {
      return nota1;
    }

    public double getNota2() {
      return nota2;
    }

    public double getMedia() {
      return media;
    }

    double nota1, nota2, media;

  }

}