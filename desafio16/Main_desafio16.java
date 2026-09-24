package desafios_POO.desafio16;

// DESAFIO 16 — Sistema escolar completo


public class Main_desafio16 {

    public static class Curso {
        String nome;
        int cargaHoraria;

        public Curso(String nome, int cargaHoraria) {
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
        }

        public void mostrarDados() {
            System.out.println("Curso: " + nome + " | Carga Horária: " + cargaHoraria + "h");
        }
    }


    public static class Disciplina {
        String nome;
        int cargaHoraria;

        public Disciplina(String nome, int cargaHoraria) {
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
        }

        public void mostrarDados() {
            System.out.println("Disciplina: " + nome + " | Carga Horária: " + cargaHoraria + "h");
        }
    }


    public static class Professor {
        String nome;
        String especialidade;

        public Professor(String nome, String especialidade) {
            this.nome = nome;
            this.especialidade = especialidade;
        }

        public void mostrarDados() {
            System.out.println("Professor: " + nome + " | Especialidade: " + especialidade);
        }
    }


    public static class Aluno {
        String nome;
        int matricula;
        Curso curso;

        public Aluno(String nome, int matricula, Curso curso) {
            this.nome = nome;
            this.matricula = matricula;
            this.curso = curso;
        }

        public void mostrarDados() {
            System.out.println("Matrícula: " + matricula + " | Aluno: " + nome +
                    " | Curso: " + (curso != null ? curso.nome : "Sem curso"));
        }
    }




    public Aluno[] alunos = new Aluno[20];
    public int totalAlunos = 0;

    public Curso[] cursos = new Curso[10];
    public int totalCursos = 0;

    public Disciplina[] disciplinas = new Disciplina[20];
    public int totalDisciplinas = 0;

    public Professor[] professores = new Professor[10];
    public int totalProfessores = 0;

    public boolean cadastrarCurso(String nome, int cargaHoraria) {
        if (totalCursos < cursos.length) {
            cursos[totalCursos++] = new Curso(nome, cargaHoraria);
            return true;
        }
        return false;
    }

    public boolean cadastrarDisciplina(String nome, int cargaHoraria) {
        if (totalDisciplinas < disciplinas.length) {
            disciplinas[totalDisciplinas++] = new Disciplina(nome, cargaHoraria);
            return true;
        }
        return false;
    }

    public boolean cadastrarProfessor(String nome, String especialidade) {
        if (totalProfessores < professores.length) {
            professores[totalProfessores++] = new Professor(nome, especialidade);
            return true;
        }
        return false;
    }

    public boolean cadastrarAluno(String nome, int matricula, Curso curso) {
        if (totalAlunos < alunos.length) {
            alunos[totalAlunos++] = new Aluno(nome, matricula, curso);
            return true;
        }
        return false;
    }

    public Curso buscarCurso(String nome) {
        for (int i = 0; i < totalCursos; i++) {
            if (cursos[i].nome.equalsIgnoreCase(nome)) {
                return cursos[i];
            }
        }
        return null;
    }

    public void listarAlunos() {
        if (totalAlunos == 0) {
            System.out.println("   Nenhum aluno cadastrado   ");
            return;
        }
        System.out.println("\n========== ALUNOS CADASTRADOS ==========");
        for (int i = 0; i < totalAlunos; i++) {
            alunos[i].mostrarDados();
        }
    }

    public void listarCursos() {
        if (totalCursos == 0) {
            System.out.println("   Nenhum curso cadastrado ");
            return;
        }
        System.out.println("\n========== CURSOS DISPONIVEIS ==========");
        for (int i = 0; i < totalCursos; i++) {
            cursos[i].mostrarDados();
        }
    }
}
