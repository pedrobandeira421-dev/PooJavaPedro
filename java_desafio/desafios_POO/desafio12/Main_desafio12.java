package desafios_POO.desafio12;

// DESAFIO 12 — Caixa eletrônico

public class Main_desafio12 {
    String titular;
    double saldo;

    // construtor
    public Main_desafio12(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = (saldoInicial >= 0) ? saldoInicial : 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação cancelada: O valor para depósito deve ser maior que zero.");
        } else {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f efetuado com sucesso!%n", valor);
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação cancelada: O valor para saque deve ser maior que zero.");
        } else if (valor > this.saldo) {
            System.out.printf("Operação cancelada: Saldo insuficiente! Saldo atual: R$ %.2f%n", this.saldo);
        } else {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
        }
    }

    public void consultarSaldo() {
        System.out.println("----------------------------------------");
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
        System.out.println("----------------------------------------");
    }
}
