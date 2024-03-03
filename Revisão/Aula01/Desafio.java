package Revisão.Aula01;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeCliente = "Jefferson";
        String tipoConta = "Corrente";
        double saldoConta = 2000;
        int entrada;
        Scanner scanner = new Scanner(System.in);
        String inicializacao = """
                *************************************
                Dados Iniciais do Cliente:

                Nome: %s
                Tipo Conta: %s
                Saldo Inicial: R$ %.2f
                *************************************
                """.formatted(nomeCliente, tipoConta, saldoConta );
        String menu = """
                Operações: 

                1- Consultar Saldos
                2- Receber Valor
                3- Transferir Valor
                4- Sair

                Digite a opção deseja:  
                """;
        System.out.println(inicializacao);
        do{
            System.out.print(menu);
            entrada = scanner.nextInt();
            if (entrada==1){
                System.out.printf("Saldo em conta: R$ %.2f\n", saldoConta);
            } else if (entrada == 2){
                System.out.print("Insira o valor que esta recebendo");
                int novoValor = scanner.nextInt();
                saldoConta += novoValor;
                System.out.printf("Novo saldo em conta: R$ %.2f\n", saldoConta);
            } else if (entrada == 3){
                System.out.print("Digite o valor que deseja trasferir: ");
                int valorTr = scanner.nextInt();
                if (valorTr > saldoConta){
                    System.out.println("Saldo insuficiente\n");
                    System.out.printf("Saldo em conta: R$ %.2f\n", saldoConta);
                } else {
                    saldoConta -= valorTr;
                }
                System.out.printf("Transferência Realizada. Novo saldo em conta: R$ %.2f\n", saldoConta);
            } else if (entrada == 4){
                System.out.println("Saindo do Sistema\n");
            } else {
                System.out.println("Opção Inválida\n");
            }
        } while (entrada != 4);    
        scanner.close();   
    }
    
}
