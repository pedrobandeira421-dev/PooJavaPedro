
package desafios_POO.desafio02;


// DESAFIO 02 — Boletim do aluno

public class Main_desafio2 {
    String nome;
    int matricula;
    double nota;

    // construtor
    public Main_desafio2 (String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = calcular_media(nota1, nota2, nota3);
    }

    double calcular_media(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    String verificar_aprovacao() {
        if (nota >= 6) {
            return "Aprovado";
        } else if (nota >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
    

    void mostrar_dados() {
        System.out.println(" --------------------------------- ");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
        System.out.println(" --------------------------------- ");
        System.out.println("Situação: " + verificar_aprovacao());
        System.out.println(" --------------------------------- ");
    }
}
