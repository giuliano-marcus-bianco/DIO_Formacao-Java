package edu.giuliano.exemplo1;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("Olá, mundo!");

        String meuNome = "Giuliano";
        System.out.print(meuNome);

        int anoNascimento = 1991;
        System.out.print(anoNascimento);

        boolean maiorDeIdade = (2024 - 1991) > 18;
        System.out.print(maiorDeIdade);

        String primeiroNome = "Steve";
        String segundoNome = "Jobs";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
