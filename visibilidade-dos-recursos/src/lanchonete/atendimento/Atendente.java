package lanchonete.atendimento;

public class Atendente {
    public void servirMesa() {
        System.out.println("SERVIDO MESA");
    }

    private void pegarLancheNaCozinha() {
        System.out.println("PEGANDO LANCHE NA COZINHA");
    }

    public void recebrPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO GÁS");
    }

    private void pegarPedidoNoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }
}
