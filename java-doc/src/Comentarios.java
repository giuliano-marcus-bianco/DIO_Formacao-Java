public class Comentarios {
    
    public static void main(String[] args) {        
        // Olá, eu sou um comentário em uma única linha
        
        /* Olá,
        * Eu sou um comentario
        * que posso ser mais detalhadod
        * quando necessário
        */
    }
    
    /** 
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */
    public void metodo() {

    }
    
    /*
    * Este método é um exemplo de má prática
    * com abreviação dos nomes das variáveis
    * com a finalidade somar ou  multiplicar
    * dois números
    */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { // M = multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
    
    /* Para gerar a documentação das classes, no terminal execute o comando abaixo:
    
    javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
    
    */

}
