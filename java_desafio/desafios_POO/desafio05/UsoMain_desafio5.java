package desafios_POO.desafio05;

// DESAFIO 05 — Estacionamento (Uso)

public class UsoMain_desafio5 {
    public static void main(String[] args) {
        Main_desafio5 v1 = new Main_desafio5("ABC-1234", "Civic", 1);
        v1.mostrarDados();
        System.out.println("----------------------------------------");

        Main_desafio5 v2 = new Main_desafio5("XYZ-9876", "Corolla", 4);
        v2.mostrarDados();
        System.out.println("----------------------------------------");

        Main_desafio5 v3 = new Main_desafio5("KLM-5555", "Renegade", 9);
        v3.mostrarDados();
    }
}
