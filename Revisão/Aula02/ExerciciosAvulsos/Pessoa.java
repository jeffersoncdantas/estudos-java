package Revisão.Aula02.ExerciciosAvulsos;

public class Pessoa {

    void helloWorld(){
        System.out.println("Olá mundo!");
    }
    
}

class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.helloWorld();
    }
}