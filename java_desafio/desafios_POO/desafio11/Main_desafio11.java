package desafios_POO.desafio11;

// DESAFIO 11 — Aplicativo de transporte

public class Main_desafio11 {
    String passageiro;
    double distancia;

    // construtor
    public Main_desafio11(String passageiro, double distancia) {
        this.passageiro = passageiro;
        this.distancia = (distancia >= 0) ? distancia : 0.0;
    }

    public double calcularValor() {
        double valor = 5.0 + (distancia * 2.50);
        if (distancia > 20.0) {
            valor *= 0.90;
        }
        return valor;
    }

    public void mostrarResumo() {
        System.out.println("----------------------------------------");
        System.out.println("Passageiro: " + passageiro);
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        if (distancia > 20.0) {
            System.out.println("Desconto: 10% aplicado (acima de 20 km)");
        } else {
            System.out.println("Desconto: Nenhum");
        }
        System.out.printf("Valor total da corrida: R$ %.2f%n", calcularValor());
        System.out.println("----------------------------------------");
    }
}
