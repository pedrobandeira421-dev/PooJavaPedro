package desafios_POO.desafio03;

// DESAFIO 03 — Caixa da lanchonete

public class UsoMain_desafio3 {
    public static void main(String[] args) {
        Main_desafio3 pedido1 = new Main_desafio3("Pedro", "Hambúrguer Especial", 3, 25.0);
        pedido1.mostrar_dados();

        System.out.println("----------------------------------------");

        Main_desafio3 pedido2 = new Main_desafio3("Maria", "Refrigerante", 2, 8.0);
        pedido2.mostrar_dados();
    }
}
