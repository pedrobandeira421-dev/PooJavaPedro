package desafios_POO.desafio15;

// DESAFIO 15 — Sistema de estacionamento completo

public class Main_desafio15 {

    public static class Veiculo {
        String placa;
        String modelo;
        int horaEntrada;

        public Veiculo(String placa, String modelo, int horaEntrada) {
            this.placa = placa;
            this.modelo = modelo;
            this.horaEntrada = horaEntrada;
        }
    }

    Veiculo[] veiculos;
    int quantidade;

    // construtor
    public Main_desafio15(int capacidade) {
        this.veiculos = new Veiculo[capacidade];
        this.quantidade = 0;
    }

    public boolean registrarEntrada(String placa, String modelo, int horaEntrada) {
        if (quantidade >= veiculos.length) {
            System.out.println("Estacionamento lotado! Não há vagas disponíveis.");
            return false;
        }
        for (int i = 0; i < quantidade; i++) {
            if (veiculos[i].placa.equalsIgnoreCase(placa)) {
                System.out.println("Veículo de placa " + placa + " já está registrado no pátio.");
                return false;
            }
        }
        veiculos[quantidade] = new Veiculo(placa, modelo, horaEntrada);
        quantidade++;
        System.out.println("Veículo " + modelo + " (" + placa + ") estacionado com sucesso às " + horaEntrada + "h!");
        return true;
    }

    public double registrarSaida(String placa, int horaSaida) {
        int index = -1;
        for (int i = 0; i < quantidade; i++) {
            if (veiculos[i].placa.equalsIgnoreCase(placa)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Veículo de placa " + placa + " não encontrado no pátio.");
            return -1;
        }

        Veiculo v = veiculos[index];
        int permanencia = horaSaida - v.horaEntrada;
        if (permanencia < 0) {
            System.out.println("Erro: Hora de saída menor que hora de entrada.");
            return -1;
        }
        if (permanencia == 0) {
            permanencia = 1;
        }

        double valor = calcularValor(permanencia);

        for (int i = index; i < quantidade - 1; i++) {
            veiculos[i] = veiculos[i + 1];
        }
        veiculos[quantidade - 1] = null;
        quantidade--;

        System.out.printf("Saída confirmada! Veículo %s (%s) permaneceu %d hora(s). Total a pagar: R$ %.2f%n",
                v.modelo, v.placa, permanencia, valor);
        return valor;
    }

    public double calcularValor(int horas) {
        if (horas <= 0) return 0.0;
        if (horas > 8) return 50.0;
        return 10.0 + (horas - 1) * 5.0;
    }

    public void consultarVeiculo(String placa) {
        for (int i = 0; i < quantidade; i++) {
            if (veiculos[i].placa.equalsIgnoreCase(placa)) {
                System.out.println("----------------------------------------");
                System.out.println("Veículo localizado:");
                System.out.println("Placa: " + veiculos[i].placa);
                System.out.println("Modelo: " + veiculos[i].modelo);
                System.out.println("Hora de entrada: " + veiculos[i].horaEntrada + "h");
                System.out.println("----------------------------------------");
                return;
            }
        }
        System.out.println("Veículo de placa " + placa + " não está no estacionamento.");
    }
}
