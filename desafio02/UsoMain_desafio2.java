package desafios_POO.desafio02;

// DESAFIO 02 — Boletim do aluno

public class UsoMain_desafio2 {
    public static void main(String[] args) {
        Main_desafio2 aluno1 = new Main_desafio2("Pedro", 123456, 7.0, 8.0, 9.0);
        aluno1.mostrar_dados();
        System.out.println(aluno1.nome);
        
    }
}
