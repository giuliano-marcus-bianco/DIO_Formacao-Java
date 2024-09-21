import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite seu nome e sobrenome:");
        String nome = scanner.nextLine();

        System.out.println("Quanto você deseja depositar na conta? R$");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta no nosso banco. A sua agência é " + agencia + " e a sua conta é " + conta + ". Seu saldo é de R$" + saldo + " já está disponível para saque.");
    }
}
