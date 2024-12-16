public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 1111;
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.numeroConta = SEQUENCIAL++ + "-P";
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO DA CONTA POUPANÇA ===");
        super.informacoesExtrato();     
    }
}
