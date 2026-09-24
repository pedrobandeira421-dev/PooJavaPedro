package desafios_POO.desafio10;

// DESAFIO 10 — Academia (Uso)

public class UsoMain_desafio10 {
    public static void main(String[] args) {
        Main_desafio10 aluno1 = new Main_desafio10("Lucas", 22, 52.0, 1.75);
        Main_desafio10 aluno2 = new Main_desafio10("Camila", 28, 62.0, 1.68);
        Main_desafio10 aluno3 = new Main_desafio10("Rodrigo", 35, 85.0, 1.75);
        Main_desafio10 aluno4 = new Main_desafio10("Marcos", 40, 105.0, 1.72);

        System.out.println("===== AVALIAÇÃO FÍSICA - ACADEMIA =====");
        aluno1.mostrarDados();
        aluno2.mostrarDados();
        aluno3.mostrarDados();
        aluno4.mostrarDados();
    }
}
