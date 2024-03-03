package Revisão.Aula02.ExerciciosAvulsos;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


class IdadePessoa {
    String nome;
    int idade;

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void verificaIdade(){
        if (this.idade >= 18){
            System.out.println("É maior de idade");
        }else{
            System.out.println("Não é maior de idade");
        }
    }
}

class TestaIdadePessoa{
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Jefferson");
        idadePessoa.setIdade(17);
        System.out.println(idadePessoa.getIdade());
        System.out.println(idadePessoa.getNome());
        idadePessoa.verificaIdade();
    }
}

class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public void aplicarDesconto(double valorPercentual){
        this.preco = this.preco - (this.preco*(valorPercentual/100));
    }
}

class TestaProduto{
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Arroz 5kg");
        produto.setPreco(19.90);
        System.out.println(produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println(produto.getPreco());
    }
}

class Aluno1 {
    private String nome;
    private double notas;
    private int numNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNotas(double notas) {
        this.notas += notas;
        numNotas++;
    }
    public String getNome() {
        return nome;
    }
    public double getNotas() {
        return notas;
    }
    public double calcularMedia(){
        return notas/numNotas;
    }
}

class TestaAluno{
    public static void main(String[] args) {
        Aluno1 aluno = new Aluno1();
        aluno.setNome("Jefferson");
        aluno.setNotas(10);
        aluno.setNotas(9);
        aluno.setNotas(8);

        System.out.println(aluno.calcularMedia());
    }
}

class Livro{
    private String titulo;
    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void exibeDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor " + this.autor);
    }
}

class TestaLivro{
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Paulo Vieira");
        livro.setTitulo("O poder da ação");

        livro.exibeDetalhes();
    }
}