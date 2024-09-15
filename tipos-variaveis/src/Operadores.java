public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "LINGUAGEM" + " " + "JAVA";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1"; // 32
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + "1" + 1; // 211
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; // 1111
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; // 1111
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); // 13
        System.out.println(concatenacao);

        System.out.println("----------------------------------");

        int numero = 5;
        numero = -numero;

        System.out.println(-numero);
        System.out.println(numero);

        numero = -numero;
        System.out.println(-numero);
        System.out.println(numero);

        System.out.println("----------------------------------");

        numero = numero + 2;
        System.out.println(numero);

        numero = numero + 1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        System.out.println(numero++); // primeiro imprime e depois incrementa

        System.out.println(numero);

        System.out.println(++numero); // primeiro incrementa e depois imprime

        System.out.println(--numero); // primeiro decrementa e depois imprime

        System.out.println(numero--); // primeiro imprime e depois decrementa

        System.out.println(numero);

        boolean variavel = false;

        System.out.println(!variavel); // inverte o valor booleano na impressão

        System.out.println(variavel);

        variavel = !variavel; // inverte o valor booleano na variável

        System.out.println(variavel);

        System.out.println("----------------------------------");

        int a, b;

        a = 5;
        b = 7;

        String resultado = "";

        // EXEMPLO COM IF-ELSE

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        a = 3;
        b = 3;

        // EXEMPLO TERNÁRIO

        String resultadoTernario = a == b ? "verdadeiro" : "falso";

        System.out.println(resultadoTernario);

        System.out.println("----------------------------------");

        int numero1 = 1;
        int numero2 = 2;

        boolean trueFalse = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + trueFalse);

        trueFalse = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2? " + trueFalse);

        trueFalse = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? " + trueFalse);

        trueFalse = numero1 < numero2;

        System.out.println("numero1 é menor que numero2? " + trueFalse);

        String nome1 = "Giuliano";
        String nome2 = new String("Giuliano");

        System.out.println("nome1 é igual a nome2? " + nome1 == nome2);
        System.out.println("nome1 tem o mesmo conteúdo de nome2? " + nome1.equals(nome2));

        System.out.println("----------------------------------");

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("condicao1 e condicao2 sao verdadeiras");
        } else {
            System.out.println("pelo menos uma das condicoes nao e verdadeira");
        }

        if (condicao1 || condicao2) {
            System.out.println("condicao1 ou condicao2 sao verdadeiras");
        } else {
            System.out.println("nenhuma das condicoes e verdadeira");
        }

    }
}
