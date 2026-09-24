package desafios_POO.desafio17;

// DESAFIO 17 — Problema aberto: Cinema e Bilheteria

public class Main_desafio17 {

    public static class Filme {
        String titulo;
        String genero;
        int duracaoMinutos;
        double precoBase;

        public Filme(String titulo, String genero, int duracaoMinutos, double precoBase) {
            this.titulo = titulo;
            this.genero = genero;
            this.duracaoMinutos = duracaoMinutos;
            this.precoBase = precoBase;
        }

        public void mostrarInfo() {
            System.out.printf("Filme: %s | Gênero: %s | Duração: %d min | Valor base: R$ %.2f%n",
                    titulo, genero, duracaoMinutos, precoBase);
        }
    }

    public static class Ingresso {
        Filme filme;
        int numeroAssento;
        String tipo;

        public Ingresso(Filme filme, int numeroAssento, String tipo) {
            this.filme = filme;
            this.numeroAssento = numeroAssento;
            this.tipo = tipo.toUpperCase();
        }

        public double calcularPrecoFinal() {
            if (tipo.equalsIgnoreCase("MEIA")) {
                return filme.precoBase * 0.50;
            } else {
                return filme.precoBase;
            }
        }

        public void exibirIngresso() {
            System.out.printf("Assento: #%02d | Filme: %-20s | Tipo: %-7s | Preço: R$ %.2f%n",
                    numeroAssento, filme.titulo, tipo, calcularPrecoFinal());
        }
    }

    String nomeCinema;
    Ingresso[] ingressosVendidos;
    int totalVendidos;

    // construtor
    public Main_desafio17(String nomeCinema, int capacidadeSala) {
        this.nomeCinema = nomeCinema;
        this.ingressosVendidos = new Ingresso[capacidadeSala];
        this.totalVendidos = 0;
    }

    public boolean venderIngresso(Filme filme, int assento, String tipo) {
        if (totalVendidos >= ingressosVendidos.length) {
            System.out.println("Sessão lotada! Não há mais assentos disponíveis.");
            return false;
        }

        for (int i = 0; i < totalVendidos; i++) {
            if (ingressosVendidos[i].numeroAssento == assento) {
                System.out.println("Assento #" + assento + " já está ocupado!");
                return false;
            }
        }

        Ingresso novoIngresso = new Ingresso(filme, assento, tipo);
        ingressosVendidos[totalVendidos++] = novoIngresso;
        System.out.printf("Ingresso vendido com sucesso para assento #%02d! Valor: R$ %.2f%n",
                assento, novoIngresso.calcularPrecoFinal());
        return true;
    }

    public double calcularFaturamentoTotal() {
        double total = 0.0;
        for (int i = 0; i < totalVendidos; i++) {
            total += ingressosVendidos[i].calcularPrecoFinal();
        }
        return total;
    }

    public void listarIngressosVendidos() {
        if (totalVendidos == 0) {
            System.out.println("Nenhum ingresso vendido ainda.");
            return;
        }
        System.out.println("\n========== INGRESSOS VENDIDOS (" + nomeCinema + ") ==========");
        for (int i = 0; i < totalVendidos; i++) {
            ingressosVendidos[i].exibirIngresso();
        }
    }

    public void exibirRelatorioGeral() {
        System.out.println("\n----------------------------------------");
        System.out.println("Cinema: " + nomeCinema);
        System.out.println("Total de ingressos vendidos: " + totalVendidos + "/" + ingressosVendidos.length);
        System.out.printf("Faturamento total acumulado: R$ %.2f%n", calcularFaturamentoTotal());
        System.out.println("----------------------------------------");
    }
}
