package desafios_POO.desafio04;
import java.util.Scanner;

// DESAFIO 04 — Conta bancária


public class UsoMain_desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main_desafio4 conta = new Main_desafio4("Pedro", 1001, 150.0);


        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n\n  ===== BANCO DIGITAL ===== ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("  Escolha uma opção:    ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                }
                case 2 -> {
                    System.out.print("Digite o valor para saque: R$ ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);
                }
                case 3 -> conta.consultarSaldo();
                case 4 -> System.out.println("Saindo do sistema bancário. Até logo!");
                default -> System.out.println("Opção inválida! Escolha entre 1 e 4");
            }
        }

        scanner.close();
    }
}
