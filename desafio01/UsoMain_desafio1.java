package desafios_POO.desafio01;

// DESAFIO 01 — Cantina da escola

public class UsoMain_desafio1 {
    public static void main(String[] args) {
        Main_desafio1 produto1 = new Main_desafio1("pão", 1.5, 5);

        System.out.println(" --------------------------------- ");
        System.out.println("Produto: " + produto1.nome);
        System.out.println("Preço:  " + produto1.preco);
        System.out.println("Quantidade: " + produto1.quantidade);
        System.out.println("Total de Reais: " + produto1.Calcular_total());
    }
}