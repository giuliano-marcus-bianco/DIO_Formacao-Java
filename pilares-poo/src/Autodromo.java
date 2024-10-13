public class Autodromo {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        
        ferrari.setChassi("12345");
        ferrari.ligar();

        Moto ducati = new Moto();
        ducati.setChassi("09876");
        ducati.ligar();

        Veiculo coringa1 = ferrari;

        Veiculo coringa2 = ducati;

        System.out.println("Ligando Veiculo coringa1:");
        coringa1.ligar();
        System.out.println("Ligando Veiculo coringa2:");
        coringa2.ligar();
    }
}
