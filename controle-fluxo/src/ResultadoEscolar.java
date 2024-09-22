public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 6;
        
        // Utilizando  condição encadeada
        if (nota >= 7) {
            System.err.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.err.println("Reprovado");
        }

        // Utilizando condição ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }    
}
