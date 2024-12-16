public abstract class Conta implements InterfaceConta {
    
    protected static final int AGENCIA_PADRAO = 1234;

    protected int agencia;  
    protected String numeroConta;  
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
    }

    
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    @Override
    public void trasnferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    protected void informacoesExtrato() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println("Conta: " + this.numeroConta);
        System.out.println(String.format("Saldo = %.2f", this.saldo));
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
