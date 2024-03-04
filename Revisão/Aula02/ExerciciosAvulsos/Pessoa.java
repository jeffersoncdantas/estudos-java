package Revisão.Aula02.ExerciciosAvulsos;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade();
    }

    void helloWorld(){
        System.out.println("Olá mundo!");
    }
    
}

class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        pessoa1.setNome("Jefferson");
        pessoa1.setIdade(20);

        pessoa2.setNome("Angela");
        pessoa2.setIdade(40);

        pessoa3.setNome("Jose");
        pessoa3.setIdade(45);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        System.out.println("Size: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa da Lista: " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);

    }
}