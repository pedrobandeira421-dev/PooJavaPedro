package desafios_POO.desafio04;

// DESAFIO 04 — Conta bancária

public class Main_desafio4 {
    String titular;
    int numero;
    double saldo;

    // construtor
    public Main_desafio4(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial não pode ser negativo. Saldo definido como R$ 0,00.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Não é permitido depósito com valor negativo ou zero.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Não é permitido saque com valor negativo ou zero.");
        } else if (valor > this.saldo) {
            System.out.println("Erro: Saldo insuficiente. Saldo disponível: R$ " + this.saldo);
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }
    }

    public void consultarSaldo() {
        System.out.println("----------------------------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Conta número: " + numero);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("----------------------------------------");
    }
}
