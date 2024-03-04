package Revisão.Aula02.ScreenMatch.Principal;

import java.util.ArrayList;

import Revisão.Aula02.ScreenMatch.Calculos.CalculadoraDeTempo;
import Revisão.Aula02.ScreenMatch.Calculos.FiltroRecomendacao;
import Revisão.Aula02.ScreenMatch.Modelos.Episodio;
import Revisão.Aula02.ScreenMatch.Modelos.Filme;
import Revisão.Aula02.ScreenMatch.Modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme "+ meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //System.out.println(meuFilme.somaDasAvaliacoes);
        //meuFilme.somaDasAvaliacoes = 10;

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost "+ lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeTres = new Filme("DigVille", 2003);
        filmeTres.setDuracaoEmMinutos(200);
        filmeTres.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeTres);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da Lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    } 
}
