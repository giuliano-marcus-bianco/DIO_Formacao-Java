public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Roberto");

        
        Conta corrente1 = new ContaCorrente(cliente1);
        Conta corrente2 = new ContaCorrente(cliente2);

        corrente1.depositar(100);
        corrente1.trasnferir(25, corrente2);

        Conta poupanca = new ContaPoupanca(cliente1);

        corrente2.trasnferir(10, poupanca);

        corrente1.imprimirExtrato();
        corrente2.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
