package Revisão.Aula02.ExerciciosAvulsos;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Titulo Musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void setAvaliacao(int avaliacao){
        this.avaliacao += avaliacao;
        numAvaliacoes++;
    }

    double mediaAvaliacao(){
        return avaliacao/numAvaliacoes;
    }
    
}

class TesteMusica {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.titulo = "Cant Hold Us";
        musica.artista = "Pentatonix";
        musica.anoDeLancamento = 2012;
        musica.setAvaliacao(10);
        musica.setAvaliacao(8);
        musica.setAvaliacao(9);
        musica.exibeFichaTecnica();
        System.out.println(musica.mediaAvaliacao());
    }
}