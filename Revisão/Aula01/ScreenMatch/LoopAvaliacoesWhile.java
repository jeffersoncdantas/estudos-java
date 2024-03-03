package Revisão.Aula01.ScreenMatch;

import java.util.Scanner;

public class LoopAvaliacoesWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1){
            System.out.println("Digite a sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.printf("Media de avaliação: %.2f", (mediaAvaliacao/totalDeNotas));
        leitura.close();

    }
}