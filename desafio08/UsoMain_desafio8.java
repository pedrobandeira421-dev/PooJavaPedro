package desafios_POO.desafio08;

// DESAFIO 08 — Cadastro de funcionário 




public class UsoMain_desafio8 {
    public static void main(String[] args) {
        Main_desafio8 funcionario = new Main_desafio8("Pedro Oliva", "Desenvolvedor software", 3500.0);

        System.out.println("=== DADOS INICIAIS ===");
        funcionario.mostrarDados();

        System.out.println("\n=== APLICANDO AUMENTO ===");
        funcionario.calcularAumento(15.0);

        System.out.println("\n=== DADOS DEPOIS DO AUMENTO ===");
        funcionario.mostrarDados();
    }
}
