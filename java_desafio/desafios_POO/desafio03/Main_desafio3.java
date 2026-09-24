package desafios_POO.desafio03;

// DESAFIO 03 — Caixa da lanchonete

public class Main_desafio3 {
    String nome_cliente;
    String produto;
    int quantidade;
    double preco_unitario;

    // construtor
    public Main_desafio3 (String nome_cliente, String produto, int quantidade, double preco_unitario) {
        this.nome_cliente = nome_cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
    }

    double calcularSubtotal() {
        return quantidade * preco_unitario;
    }

    double calcularDesconto() {
        if (calcularSubtotal() < 50) {
            return 0;
        } else if (calcularSubtotal() >= 50 && calcularSubtotal() < 100) {
            return calcularSubtotal() * 0.05;
        } else {
            return calcularSubtotal() * 0.10;
        }
    }

    double calcularTotal() {
        return calcularSubtotal() - calcularDesconto();
    }

    void mostrar_dados() {
        System.out.println("Nome do cliente: " + nome_cliente);
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: " + preco_unitario);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Desconto: " + calcularDesconto());
        System.out.println("Total: " + calcularTotal());
    }
}
