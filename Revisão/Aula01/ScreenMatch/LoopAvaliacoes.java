package Revisão.Aula01.ScreenMatch;

import java.util.Scanner;

public class LoopAvaliacoes {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliacao para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.printf("Media de avaliação: %.2f", (mediaAvaliacao/3));
        leitura.close();
    }
    
}
