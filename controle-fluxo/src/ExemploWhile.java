import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatório();

            if (valorDoce > mesada) {
                System.out.println("Esse doce custa R$" + valorDoce + ", mas só sobrou R$" + mesada + " da mesada de Joãozinho. Então ele não pode comprar esse doce.");
                break;
            }

            System.out.println("Doce no valor de R$" + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada = R$" + mesada);
        }

    private static double valorAleatório() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
