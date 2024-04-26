package org.example.tarefas.tarefa08.contaBancaria;

import java.util.Scanner;

public class ClasseTesteExecutavel {
    public static void main(String args[]) {
        ContaBancaria conta = new ContaBancaria();
        int opcao;
        do {
            System.out.println("Digite uma opção:\n 0 - Sair\n 1 - Sacar dinheiro\n 2 - Depositar dinheiro\n 3 - Conferir saldo\n");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            switch (opcao) {
                case  1: {
                    System.out.println("Digite o valor que deseja sacar:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                }
                case 2: {
                    System.out.println("Digite o valor que deseja depositar:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                }
                case 3: {
                    double saldo = conta.getSaldo();
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;
                }
                default: break;
            }
        } while (opcao != 0);

    }
}
