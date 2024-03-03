package Revisão.Aula01;

import java.util.Random;
import java.util.Scanner;

class Revisao {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Olá, me chamo Jefferson");
        soma();
        subtracao();
        

        //Comparação de String, utiliza o metodo equals
        String senha = "12345";if(senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else  {
            System.out.println("Senha incorreta.");
        }

        /*O método equalsIgnoreCase(), é usado para que a comparação de 
        Strings desconsidere as letras maiúsculas e minúsculas. Utilizando apenas 
        o equals, as String “alura” e "Alura” seriam consideradas diferentes.*/

        //Método Text Block
        String mensagem = """
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;

        System.out.println(mensagem);

        //String Formatted
        String nome = "Jefferson";
        int idade = 23;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais \n", nome, idade, valor);
        String mensagem2 = """
                  Me chamo, %s!
                  Eu tenho %d anos
                  E hoje gastei %.2f reais
                  """.formatted(nome, idade, valor);
        System.out.println(mensagem2);

    }

    public static void soma() {
        int soma = 10 + 5;
        System.out.println("Soma " + soma);
    }

    public static void subtracao() {
        int subtracao = 10 - 5;
        System.out.println("Subtração " + subtracao);
    }
}

class ConverterTemperaturas {
    public static void main(String[] args) {
        int celsius = 32;
        int fahrenheit;
        double conversao = (celsius * 1.8) + 32;
        fahrenheit = (int)conversao;
        System.out.printf("A temperatura Celsius de %d para Fahrenheit é de: %d", celsius, fahrenheit);
    }
}

class Media{
    public static void main(String[] args){
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 9.5;
        double nota2 = 8.5;
        double media = (nota1+nota2)/2;
        System.out.printf("A média do aluno é: %.2f", media);
    }
}

class Casting{
    public static void main(String[] args){
        //Declare uma variável do tipo double e uma variável do tipo int. 
        //Faça o casting da variável double para int e imprima o resultado.
        double var1 = 5.6;
        int var2 = 7;
        int soma = var2 + (int)var1;
        System.out.println(soma);
    }
}

class Concatenar{
    public static void main(String[] args) {
        char letra = 'a';
        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). 
        Atribua valores a essas variáveis e concatene-as em uma mensagem. */
        String palavra = "Teste";
        String mensagem = letra + palavra;
        System.out.println(mensagem);
    }
}

class Multiplicacao{
    public static void main(String[] args){
        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). 
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/
        double precoProduto = 20.59;
        int quantidade = 4;
        double total = precoProduto * quantidade;
        System.out.printf("O preço total é: R$ %.2f", total);
    }
}

class ConversaoDolar{
    public static void main(String[] args) {
        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. 
        Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em 
        dólares para reais e imprima o resultado formatado. */
        double valorEmDolares = 50.75;
        double cotacaoDolar = 4.94;
        double conversaoReais = valorEmDolares * cotacaoDolar;
        System.out.printf("O valor da cotação em Real é R$ %.2f", conversaoReais);
    }
}

class Desconto{
    public static void main(String[] args) {
        /*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, 
        representando o preço original de um produto. Em seguida, declare uma variável do tipo double 
        percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). 
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/
        double precoOriginal = 50.75;
        double percentualDesconto = 10;
        double valorDoDesconto = precoOriginal * (percentualDesconto/100);
        double precoFinal = precoOriginal - valorDoDesconto;
        System.out.printf("Preço original: R$ %.2f, com desconto de R$ %.2f, valor final de R$ %.2f", precoOriginal, valorDoDesconto, precoFinal);
    }
}

class SwitchCase{
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}

class Advinhacao{
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int numberUsuario = 0;
        int count = 0;

        while (count < 5) {
            System.out.println("Digite um valor aleatório: ");
            numberUsuario = leitura.nextInt();
            if (numberUsuario == number){
                System.out.println("Parabens você acertou");
                break;
            } else if (numberUsuario > number) {
                System.out.println("O numero é maior que o digitado");
            } else if (numberUsuario < number){
                System.out.println("O numero é menor que o digitado");
            }
            count++;
        }
        leitura.close();
    }
}

class PositivoNegativo{
    public static void main(String[] args) {
        /*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, 
        exiba "Número positivo", caso contrário, exiba "Número negativo". */
        Scanner leitura = new Scanner(System.in);
        System.out.println(("Digite um numero: "));
        int num = leitura.nextInt();
        if (num >= 0){
            System.out.println("O numero digitado é positivo");
        } else {
            System.out.println("O numero digitado é negativo");
        }
        leitura.close();
    }
}

class Numeros{
    public static void main(String[] args) {
        /*Peça ao usuário para inserir dois números inteiros. Compare os números e 
        imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior. */
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num1 = leitura.nextInt();
        System.out.print("Digite um segundo numero inteiro: ");
        int num2 = leitura.nextInt();

        if (num1 == num2){
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println("Os numeros são diferentes");
            if (num1 > num2){
                System.out.printf("O %d é maior que o %d", num1, num2);
            } else {
                System.out.printf("O %d é maior que o %d", num2, num1);
            }
        }
    leitura.close();
    }
}

class CalculosMenu{
    /*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e 
    "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da 
    área com base na opção selecionada. */
    public static void main(String[] args) {
        String menu = """
                Digite o numero correspondente as opções:
                1- Calcular a área do quadrado
                2- Calcular a área do círculo
                3- Sair
                """;
        int escolha;
        Scanner leitura = new Scanner(System.in);

        do{
            System.out.println(menu);
            escolha = leitura.nextInt();

            if (escolha == 1){
                System.out.print("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2){
                System.out.print("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio; 
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3){
                System.out.println("Saindo do sistema!");
            } else {
                System.out.println("Opção inválida");
            }

        } while (escolha != 3);
        leitura.close();
    }
}
class Tabuada{
    public static void main(String[] args){
        /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero para fazer a tabuada: ");
        int num = leitura.nextInt();
        for (int i=1; i<=10; i++){
            
            System.out.printf("%d x %d = %d\n", i, num, (i*num));
        }
        leitura.close();
    }
}

class ParImpar{
    /*Crie um programa que solicite ao usuário a entrada de um número inteiro. 
    Verifique se o número é par ou ímpar e exiba uma mensagem correspondente. */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = leitura.nextInt();

        if (num%2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        leitura.close();
    }
}

class Fatorial{
    /*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leitura.nextInt();
        int fatorial = 1;
        for (int i = num; i>0; i--){
            if (i>1){
                System.out.printf("%d x ", i);
            } else {
                System.out.print(i);
            }
            fatorial *= i;
        }
        System.out.printf(" = %d", fatorial);
        leitura.close();
    }    
}