package desafios_POO.desafio05;

// DESAFIO 05 — Estacionamento


public class UsoMain_desafio5 {
    public static void main(String[] args) {
        Main_desafio5 v1 = new Main_desafio5("PEDR001", "Civic", 1);
        v1.mostrarDados();
        System.out.println("----------------------------------------");

        Main_desafio5 v2 = new Main_desafio5("WASD323", "Corolla", 4);
        v2.mostrarDados();
        System.out.println("----------------------------------------");

        Main_desafio5 v3 = new Main_desafio5("MMNNN32", "Renegade", 9);
        v3.mostrarDados();
    }
}
