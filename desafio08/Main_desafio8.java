package desafios_POO.desafio08;

// DESAFIO 08 — Cadastro de funcionário


public class Main_desafio8 {
    String nome;
    String cargo;
    double salario;

    // construtor
    public Main_desafio8(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = (salario >= 0) ? salario : 0.0;
    }

    public void mostrarDados() {
        System.out.println("----------------------------------------");
        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário mensal: R$ %.2f%n", salario);
        System.out.printf("Salário anual (12x): R$ %.2f%n", calcularSalarioAnual());
        System.out.println("----------------------------------------");
    }

    public void calcularAumento(double percentual) {
        if (percentual > 0) {
            double aumento = this.salario * (percentual / 100.0);
            this.salario += aumento;
            System.out.printf("Aumento de %.1f%% aplicado (+R$ %.2f). Novo salário: R$ %.2f%n", percentual, aumento, this.salario);
        } else {
            System.out.println("Percentual de aumento inválido");
        }
    }


    public double calcularSalarioAnual() {
        return salario * 12;
    }
}
