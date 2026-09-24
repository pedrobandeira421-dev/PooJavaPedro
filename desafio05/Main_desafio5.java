package desafios_POO.desafio05;

// DESAFIO 05 — Estacionamento


public class Main_desafio5 {
    String placa;
    String modelo;
    int horas;

    // construtor
    public Main_desafio5(String placa, String modelo, int horas) {
        this.placa = placa;
        this.modelo = modelo;
        this.horas = horas;
    }

    public double calcularValor() {
        if (horas <= 0) {
            return 0.0;
        }
        if (horas > 8) {
            return 50.0;
        }
        return 10.0 + (horas - 1) * 5.0;
    }

    public void mostrarDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Horas estacionado: " + horas + "h");
        System.out.println("Valor a pagar: R$ " + calcularValor());
    }
}
