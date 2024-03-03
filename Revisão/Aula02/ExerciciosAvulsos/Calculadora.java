package Revisão.Aula02.ExerciciosAvulsos;

public class Calculadora {
    
    double dobroNumero(double num){
        return num*2;
    }
}

class TesteCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobroNumero(10));
    }
}
