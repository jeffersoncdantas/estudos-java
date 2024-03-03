package Revisão.Aula02.ExerciciosAvulsos;

public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}

class TesteAluno {
    public static void main(String[] args) {
    
        Aluno aluno = new Aluno();
        aluno.nome = "Jefferson";
        aluno.idade = 20;
        aluno.exibeInformacoes();
    }

}
