package desafios_POO.desafio10;

// DESAFIO 10 — Academia

public class Main_desafio10 {
    String nome;
    int idade;
    double peso;
    double altura;

    // construtor
    public Main_desafio10(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        if (altura <= 0) {
            return 0.0;
        }
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc <= 24.9) {
            return "Peso normal";
        } else if (imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public void mostrarDados() {
        System.out.println("----------------------------------------");
        System.out.println("Aluno(a): " + nome + " | Idade: " + idade + " anos");
        System.out.printf("Peso: %.1f kg | Altura: %.2f m%n", peso, altura);
        System.out.printf("IMC: %.2f%n", calcularIMC());
        System.out.println("Classificação: " + classificarIMC());
        System.out.println("----------------------------------------");
    }
}
