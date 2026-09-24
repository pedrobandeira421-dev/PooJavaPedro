package desafios_POO.desafio06;

// DESAFIO 06 — Sistema de notas de uma turma (Uso)

public class UsoMain_desafio6 {
    public static void main(String[] args) {
        Main_desafio6 aluno1 = new Main_desafio6("Ana", 101);
        Main_desafio6 aluno2 = new Main_desafio6("Bruno", 102);
        Main_desafio6 aluno3 = new Main_desafio6("Carlos", 103);
        Main_desafio6 aluno4 = new Main_desafio6("Daniela", 104);
        Main_desafio6 aluno5 = new Main_desafio6("Eduardo", 105);

        System.out.println("===== MÉDIAS DA TURMA (VARARGS) =====");
        aluno1.exibirResumo(8.0, 9.0, 7.5);
        aluno2.exibirResumo(6.0, 5.5, 7.0, 8.0);
        aluno3.exibirResumo(9.5, 10.0);
        aluno4.exibirResumo(4.0, 6.0, 5.0);
        aluno5.exibirResumo(7.0, 8.0, 8.5, 9.0, 9.5);
    }
}
