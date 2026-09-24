package desafios_POO.desafio14;

// DESAFIO 14 — Sistema de cursos

public class Main_desafio14 {

    public static class Curso {
        String nome;
        int cargaHoraria;

        public Curso(String nome, int cargaHoraria) {
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
        }
    }

    String nome;
    int matricula;
    Curso curso;

    // construtor
    public Main_desafio14(String nome, int matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("----------------------------------------");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso.nome);
        System.out.println("Carga Horária: " + curso.cargaHoraria + " horas");
        System.out.println("----------------------------------------");
    }
}
