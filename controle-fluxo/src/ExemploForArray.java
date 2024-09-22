public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "GIULIANO", "VITOR", "THIAGO", "RUDOLPH" };

        // Usando a forma convencional
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice " + i + " é " + alunos[i]);
        }

        // Usando a forma abrieviada (for each)
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
