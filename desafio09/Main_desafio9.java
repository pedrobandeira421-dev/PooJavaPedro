package desafios_POO.desafio09;

// DESAFIO 09 — Biblioteca escolar


public class Main_desafio9 {
    String titulo;
    String autor;
    int codigo;
    boolean disponivel;

    // construtor
    public Main_desafio9(String titulo, String autor, int codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            this.disponivel = false;
            System.out.println("Empréstimo realizado com sucesso: '" + titulo + "'.");
        } else {
            System.out.println("Atenção: O livro '" + titulo + "' já está emprestado no momento");
        }
    }

    public void devolver() {
        if (!disponivel) {
            this.disponivel = true;
            System.out.println("Devolução realizada com sucesso: '" + titulo + "'.");
        } else {
            System.out.println("Atenção: O livro '" + titulo + "' já está disponível na biblioteca");
        }
    }


    
    public void mostrarDados() {
        System.out.println("----------------------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Situação: " + (disponivel ? "DISPONÍVEL" : "EMPRESTADO"));
        System.out.println("----------------------------------------");
    }
}
