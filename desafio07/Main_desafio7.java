package desafios_POO.desafio07;

// DESAFIO 07 — Loja de eletrônicos




public class Main_desafio7 {
    int codigo;
    String nome;
    double preco;
    int estoque;

    // construtor
    public Main_desafio7(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = (preco >= 0) ? preco : 0.0;
        this.estoque = (estoque >= 0) ? estoque : 0;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque de " + nome + ".");
        } else {
            System.out.println(" >>Erro: Quantidade para adicionar deve ser maior que zero");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println(" >>Erro: Quantidade de venda deve ser maior que zero");
        } else if (quantidade > this.estoque) {
            System.out.println(" >>Erro: Estoque insuficiente! Disponível em estoque: " + this.estoque);
        } else {
            this.estoque -= quantidade;
            double totalVenda = quantidade * this.preco;
            System.out.println("Venda realizada de " + quantidade + "x " + nome + " — Total: R$ " + totalVenda);
        }
    }


    public void consultarEstoque() {

        System.out.println("----------------------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque disponível: " + estoque + " unidades");
        System.out.println("Valor total do estoque: R$ " + calcularValorEstoque());
        System.out.println("----------------------------------------");
    }

    public double calcularValorEstoque() {
        return preco * estoque;
    }
}
