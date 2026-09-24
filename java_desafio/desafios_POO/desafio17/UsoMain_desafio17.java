package desafios_POO.desafio17;

import java.util.Scanner;

// DESAFIO 17 — Problema aberto: Cinema e Bilheteria (Uso)

public class UsoMain_desafio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main_desafio17 cinema = new Main_desafio17("CineTech Estação", 30);

        Main_desafio17.Filme filme1 = new Main_desafio17.Filme("Interestelar 2", "Ficção Científica", 160, 30.0);
        Main_desafio17.Filme filme2 = new Main_desafio17.Filme("Vingadores do Código", "Ação/Aventura", 140, 26.0);

        cinema.venderIngresso(filme1, 1, "INTEIRA");
        cinema.venderIngresso(filme1, 2, "MEIA");

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n===== BILHETERIA CINEMA =====");
            System.out.println("1 - Vender Ingresso");
            System.out.println("2 - Listar Ingressos Vendidos");
            System.out.println("3 - Exibir Relatório de Faturamento");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\nEscolha o filme:");
                    System.out.println("1 - " + filme1.titulo + " (R$ " + filme1.precoBase + ")");
                    System.out.println("2 - " + filme2.titulo + " (R$ " + filme2.precoBase + ")");
                    System.out.print("Opção: ");
                    int opFilme = scanner.nextInt();

                    Main_desafio17.Filme selecionado = (opFilme == 1) ? filme1 : filme2;

                    System.out.print("Número do assento (1 a 30): ");
                    int assento = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Tipo do ingresso (INTEIRA ou MEIA): ");
                    String tipo = scanner.nextLine();

                    cinema.venderIngresso(selecionado, assento, tipo);
                }
                case 2 -> cinema.listarIngressosVendidos();
                case 3 -> cinema.exibirRelatorioGeral();
                case 4 -> System.out.println("Fechando bilheteria do cinema. Até logo!");
                default -> System.out.println("Opção inválida! Digite um número de 1 a 4.");
            }
        }

        scanner.close();
    }
}
