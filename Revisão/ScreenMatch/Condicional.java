package Revisão.ScreenMatch;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2020;
        boolean incluidoNoPlano = true;
        //double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano && tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");

        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
