package desafios_POO.desafio06;

// DESAFIO 06 — Sistema de notas de uma turma

public class Main_desafio6 {
    String nome;
    int matricula;

    // construtor
    public Main_desafio6(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularMedia(double... notas) {
        if (notas.length == 0) {
            return 0.0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void exibirResumo(double... notas) {
        double media = calcularMedia(notas);
        System.out.printf("Matrícula: %d | Nome: %-10s | Média: %.2f%n", matricula, nome, media);
    }
}
