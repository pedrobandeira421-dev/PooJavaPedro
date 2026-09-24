package desafios_POO.desafio12;

import java.util.Scanner;

// DESAFIO 12 — Caixa eletrônico (Uso)

public class UsoMain_desafio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main_desafio12 conta = new Main_desafio12("Pedro Henrique", 500.0);

        int opcao = 0;
        do {
            System.out.println("\n========== AUTOATENDIMENTO 24H ==========");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o valor a depositar: R$ ");
                    double dep = scanner.nextDouble();
                    conta.depositar(dep);
                }
                case 2 -> {
                    System.out.print("Informe o valor a sacar: R$ ");
                    double saq = scanner.nextDouble();
                    conta.sacar(saq);
                }
                case 3 -> conta.consultarSaldo();
                case 4 -> System.out.println("Encerrando sessão. Obrigado por usar nosso caixa eletrônico!");
                default -> System.out.println("Opção inválida! Escolha uma opção de 1 a 4.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
