public class ContaCorrente extends Conta {
    
    private static int SEQUENCIAL = 1111;
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.numeroConta = SEQUENCIAL++ + "-C";
    }
    
    public void imprimirExtrato() {
        System.out.println("=== EXTRATO DA CONTA CORRENTE ===");
        super.informacoesExtrato();         
    }
}
