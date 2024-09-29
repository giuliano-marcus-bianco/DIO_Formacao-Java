package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }

    public void adicionarVitaminaNoBalcao() {
        System.out.println("ADICIONANDO SUCO NA BALCÃO");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarVitaminaNoBalcao();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO INGREDIENTES DO LANCHE");
    }

    private void fritarIngredientesDoLanche() {
        System.out.println("FRITANDO OS INGREDIENTES DO LANCHE");
    }

    private void montarLanche() {
        System.out.println("MONTANDO O LANCHE");
    }

    private void prepararLanche() {
        selecionarIngredientesLanche();
        fritarIngredientesDoLanche();
        montarLanche();

        System.out.println("PREPARANDO LANCHE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO INGREDIENTES PARA A VITAMINA");
    }

    private void baterVitaminaNoLiquidificador() {
        System.out.println("BATENDO OS INGREDIENTES DA VITAMINA NO LIQUIDIFICADOR");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }


    private void prepararVitamina() {
        selecionarIngredientesVitamina();
        lavarIngredientes();
        baterVitaminaNoLiquidificador();

        System.out.println("A VITAMINA ESTÁ PRONTA!");
    }

    
    // com o método trocarGas em modo default no pacote atendimento, não é mais possível acessar ele aqui, no pacote cozinha
    private void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIgredientes();
    }

}
