package desafios_POO.desafio11;

// DESAFIO 11 — Aplicativo de transporte



public class UsoMain_desafio11 {
    public static void main(String[] args) {
        System.out.println("===== SIMULADOR DE CORRIDAS =====");

        Main_desafio11 corridaCurta = new Main_desafio11("Pedrão", 8.0);
        corridaCurta.mostrarResumo();

        System.out.println();

        Main_desafio11 corridaLonga = new Main_desafio11("Gabriel", 26.0);
        corridaLonga.mostrarResumo();
    }
}
