package desafios_POO.desafio14;

// DESAFIO 14 — Sistema de cursos


public class UsoMain_desafio14 {
    public static void main(String[] args) {
        Main_desafio14.Curso cursoJava = new Main_desafio14.Curso("Desenvolvimento de Software Java", 1200);
        Main_desafio14.Curso cursoRedes = new Main_desafio14.Curso("Redes e Infraestrutura Cloud", 1000);

        Main_desafio14 aluno1 = new Main_desafio14("Pedro Silva", 202601, cursoJava);
        Main_desafio14 aluno2 = new Main_desafio14("Amanda Rocha", 202602, cursoRedes);

        System.out.println("===== REGISTRO DE MATRÍCULAS ESCOLARES =====");
        aluno1.mostrarDados();
        aluno2.mostrarDados();
    }
}
