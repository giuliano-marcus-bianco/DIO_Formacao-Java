package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAÍDA DOS ITENS");
    }

    void entregarIgredientes() {
        System.out.println("ENTREGANDO OS INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO GÁS");
    }
    
}
