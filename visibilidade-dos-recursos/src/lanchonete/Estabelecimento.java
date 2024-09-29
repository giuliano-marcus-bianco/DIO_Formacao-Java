package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estar disponíveis para toda a aplicação
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.fritarIngredientesDoLanche();
        cozinheiro.montarLanche();
        cozinheiro.prepararLanche();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaNoLiquidificador();
        cozinheiro.prepararVitamina();

        // aões que o estabelecimento precisa ter ciência
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarVitaminaNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        // ações que não precisam estar disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();

        // aões que somento o pacote cozinha precisa conhecer (default)
        almoxarife.entregarIgredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheNaCozinha();
        atendente.recebrPagamento();
        atendente.servirMesa();
        // aões que somento o pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        // não deveria, mas o estabelecimento ainda não definiu normas de atendimento
        cliente.pegarPedidoNoBalcao();
        // esta ação é sigilos, por isso ela deve ser privada
        cliente.consultarSaldoAplicativo();

        // já pensou os clientes ouvindo que o gás acabou?
        cozinheiro.pedirParaTrocarGas(almoxarife);
        cozinheiro.pedirParaTrocarGas(atendente);

    }    
}
