package desafios_POO.desafio15;

import java.util.Scanner;

// DESAFIO 15 — Sistema de estacionamento completo


public class UsoMain_desafio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main_desafio15 estacionamento = new Main_desafio15(10);

        estacionamento.registrarEntrada("ABC-1111", "Civic", 8);
        estacionamento.registrarEntrada("XYZ-2222", "Corolla", 10);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n===== GESTÃO DE ESTACIONAMENTO =====");
            System.out.println("1 - Registrar entrada");
            System.out.println("2 - Registrar saída");
            System.out.println("3 - Consultar veículo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a placa: ");
                    String placa = scanner.nextLine().toUpperCase();
                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite a hora de entrada (0 a 23): ");
                    int entrada = scanner.nextInt();
                    estacionamento.registrarEntrada(placa, modelo, entrada);
                }
                case 2 -> {
                    System.out.print("Digite a placa do veículo para saída: ");
                    String placa = scanner.nextLine().toUpperCase();
                    System.out.print("Digite a hora atual de saída (0 a 23): ");
                    int saida = scanner.nextInt();
                    estacionamento.registrarSaida(placa, saida);
                }
                case 3 -> {
                    System.out.print("Digite a placa para consultar: ");
                    String placa = scanner.nextLine().toUpperCase();
                    estacionamento.consultarVeiculo(placa);
                }
                case 4 -> System.out.println("Encerrando o sistema de estacionamento.");
                default -> System.out.println("Opção inválida! Digite de 1 a 4.");
            }
        }

        scanner.close();
    }
}
