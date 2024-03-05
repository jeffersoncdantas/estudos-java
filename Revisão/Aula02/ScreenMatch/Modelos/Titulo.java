package Revisão.Aula02.ScreenMatch.Modelos;

import com.google.gson.annotations.SerializedName;
import Revisão.Aula02.ScreenMatch.Excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo>{

    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public Titulo(TituloOmdb meTituloOmdb){
        this.nome = meTituloOmdb.title();
        if (meTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano");
        }
        this.anoDeLancamento = Integer.valueOf(meTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meTituloOmdb.runtime().substring(0,2));
    }

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }



    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    @Override
    public int compareTo(Titulo outroTitulo){
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", duracaoEmMinutos="
                + duracaoEmMinutos + "]";
    }

    
}
