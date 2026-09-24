package desafios_POO.desafio07;

// DESAFIO 07 — Loja de eletrônicos (Uso)

public class UsoMain_desafio7 {
    public static void main(String[] args) {
        Main_desafio7 teclado = new Main_desafio7(101, "Teclado Mecânico RGB", 250.0, 10);
        
        teclado.consultarEstoque();
        
        System.out.println("\n--- Realizando vendas ---");
        teclado.vender(3);
        teclado.vender(8);
        
        System.out.println("\n--- Adicionando estoque ---");
        teclado.adicionarEstoque(5);
        
        System.out.println("\n--- Estoque atualizado ---");
        teclado.consultarEstoque();
    }
}
