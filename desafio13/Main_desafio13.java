package desafios_POO.desafio13;

// DESAFIO 13 — Sistema de pedidos (Objeto dentro de outro objeto)


public class Main_desafio13 {

    public static class Produto {
        String nome;
        double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    }

    int numero;
    String cliente;
    Produto produto;
    int quantidade;

    // construtor
    public Main_desafio13(int numero, String cliente, Produto produto, int quantidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }



    
    public double calcularSubtotal() {
        return produto.preco * quantidade;
    }

    public double calcularDesconto() {
        double subtotal = calcularSubtotal();
        if (subtotal < 100.0) {
            return 0.0;
        } else if (subtotal < 200.0) {
            return subtotal * 0.05;
        } else {
            return subtotal * 0.10;
        }
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDesconto();
    }

    public void mostrarDados() {
        System.out.println("----------------------------------------");
        System.out.println("Pedido Nº: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Produto: " + produto.nome + " (R$ " + produto.preco + " cada)");
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Subtotal: R$ %.2f%n", calcularSubtotal());
        System.out.printf("Desconto: R$ %.2f%n", calcularDesconto());
        System.out.printf("Total a pagar: R$ %.2f%n", calcularTotal());
        System.out.println("----------------------------------------");
    }
}
