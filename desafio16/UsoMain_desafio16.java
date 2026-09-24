package desafios_POO.desafio16;
import java.util.Scanner;

// DESAFIO 16 — Sistema escolar completo





public class UsoMain_desafio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main_desafio16 escola = new Main_desafio16();


        escola.cadastrarCurso("Informatica", 1200);
        escola.cadastrarProfessor("Professor Adriano", "Banco de Dados e Java");
        escola.cadastrarDisciplina("POO em Java", 80);
        escola.cadastrarAluno("Pedro Oliva", 1001, escola.buscarCurso(" Informatica "));


        int opcao = 0;
        while (opcao != 7) {
            System.out.println("\n===== SISTEMA ESCOLAR TÉCNICO =====");
            System.out.println("1 - Cadastrar Curso");
            System.out.println("2 - Cadastrar Disciplina");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Cadastrar Aluno");
            System.out.println("5 - Mostrar Alunos");
            System.out.println("6 - Mostrar Cursos");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Curso:   ");
                    String nome = scanner.nextLine();
                    System.out.print("Carga Horária (horas):   ");
                    int ch = scanner.nextInt();
                    if (escola.cadastrarCurso(nome, ch)) {
                        System.out.println("Curso cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de cursos atingido  ");
                    }
                }
                case 2 -> {
                    System.out.print("Nome da Disciplina:   ");
                    String nome = scanner.nextLine();
                    System.out.print("Carga Horária (horas):   ");
                    int ch = scanner.nextInt();
                    if (escola.cadastrarDisciplina(nome, ch)) {
                        System.out.println("Disciplina cadastrada com sucesso!");
                    } else {
                        System.out.println("Limite de disciplinas atingido");
                    }
                }
                case 3 -> {
                    System.out.print("Nome do Professor:   ");
                    String nome = scanner.nextLine();
                    System.out.print("Especialidade:   ");
                    String esp = scanner.nextLine();
                    if (escola.cadastrarProfessor(nome, esp)) {
                        System.out.println("Professor cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de professores atingido");
                    }
                }
                case 4 -> {
                    System.out.print("Nome do Aluno:   ");
                    String nome = scanner.nextLine();
                    System.out.print("Matrícula:   ");
                    int mat = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do Curso do aluno:   ");
                    String nomeCurso = scanner.nextLine();
                    Main_desafio16.Curso curso = escola.buscarCurso(nomeCurso);
                    if (curso != null) {
                        escola.cadastrarAluno(nome, mat, curso);
                        System.out.println("Aluno matriculado com sucesso no curso " + curso.nome + "!");
                    } else {
                        System.out.println("Curso não encontrado! Cadastre o curso primeiro");
                    }
                }
                case 5 -> escola.listarAlunos();
                case 6 -> escola.listarCursos();
                case 7 -> System.out.println("Encerrando o sistema escolar...   ");
                default -> System.out.println("Opção inválida! Escolha entre 1 e 7");
            }
        }

        scanner.close();
    }
}
