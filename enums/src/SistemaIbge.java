public class SistemaIbge {
    public static void main(String[] args) {
        
        // listando todos os estados
        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + " - " + uf.getNomeMaisculo());
        }

        // selecionando um estado
        EstadoBrasileiro df = EstadoBrasileiro.DISTRITO_FEDERAL;
        System.out.println(df.getSigla() + " - " + df.getNome() + " - " + df.getCodigoIbge());
    }
}
