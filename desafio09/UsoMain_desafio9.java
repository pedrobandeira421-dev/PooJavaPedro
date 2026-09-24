package desafios_POO.desafio09;

// DESAFIO 09 — Biblioteca escolar


public class UsoMain_desafio9 {
    public static void main(String[] args) {
        Main_desafio9 livro = new Main_desafio9("O Diário de Anne Frank", "Anne Frank", 352);

        System.out.println("=== CONSULTA INICIAL ===");
        livro.mostrarDados();

        System.out.println("\n=== TENTANDO EMPRESTAR ===");
        livro.emprestar();
        livro.mostrarDados();

        System.out.println("\n=== TENTANDO EMPRESTAR NOVAMENTE ===");
        livro.emprestar();

        System.out.println("\n=== DEVOLVENDO O LIVRO ===");
        livro.devolver();
        livro.mostrarDados();

        System.out.println("\n=== TENTANDO DEVOLVER NOVAMENTE ===");
        livro.devolver();
    }
}