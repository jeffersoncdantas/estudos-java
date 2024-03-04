package Revisão.Aula02.ScreenMatch.Calculos;

import Revisão.Aula02.ScreenMatch.Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
