package Revisão.Aula02.ExerciciosAvulsos;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
    }

    int idadeCarro(){
        return 2024 - this.ano;
    }
    
}
class TesteCarro {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.ano = 2005;
        carro.cor = "Azul";
        carro.exibeFichaTecnica();
        System.out.println(carro.idadeCarro());
    }
}
