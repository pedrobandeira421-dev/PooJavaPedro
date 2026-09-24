package desafios_POO.desafio13;

// DESAFIO 13 — Sistema de pedidos (Uso)

public class UsoMain_desafio13 {
    public static void main(String[] args) {
        Main_desafio13.Produto mouse = new Main_desafio13.Produto("Mouse Óptico Sem Fio", 45.0);
        Main_desafio13.Produto fone = new Main_desafio13.Produto("Headset Gamer", 120.0);
        Main_desafio13.Produto monitor = new Main_desafio13.Produto("Monitor 24 Pol IPS", 650.0);

        System.out.println("===== PEDIDOS DA LOJA ONLINE =====\n");

        Main_desafio13 pedido1 = new Main_desafio13(1001, "Lucas Lima", mouse, 1);
        pedido1.mostrarDados();

        System.out.println();

        Main_desafio13 pedido2 = new Main_desafio13(1002, "Mariana Costa", fone, 1);
        pedido2.mostrarDados();

        System.out.println();

        Main_desafio13 pedido3 = new Main_desafio13(1003, "Pedro Alves", monitor, 1);
        pedido3.mostrarDados();
    }
}
