package Revisão.Aula02.ScreenMatch.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Revisão.Aula02.ScreenMatch.Modelos.Filme;
import Revisão.Aula02.ScreenMatch.Modelos.Serie;
import Revisão.Aula02.ScreenMatch.Modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeTres = new Filme("DigVille", 2003);
        filmeTres.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeTres);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        lista.forEach(filme -> System.out.println(filme.getNome()));
        lista.forEach(System.out::println);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            } 
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sendler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
