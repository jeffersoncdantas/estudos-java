package Revisão;

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