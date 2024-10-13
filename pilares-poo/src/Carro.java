public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("carro ligado");
    }
    
    private void confereCombustivel() {
        System.out.println("conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("confere se câmbio está em P");
    }
    
}
