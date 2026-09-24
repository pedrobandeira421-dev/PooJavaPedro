package desafios_POO.desafio01;

// DESAFIO 01 — Cantina da escola


public class Main_desafio1 {
    String nome;
    double preco;
    int quantidade;

    // construtor
    public Main_desafio1(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double Calcular_total() {
        if (preco * quantidade > 100) {
            return (preco * quantidade) * 0.9;
        } else {
            return preco * quantidade;
        }
    }

}