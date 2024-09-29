public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 35),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 33),
    MINAS_GERAIS("MG", "Minas Gerais", 31),
    ESPIRITO_SANTO("ES", "Espírito Santo", 32),
    DISTRITO_FEDERAL("DF", "Distrito Federal", 53);

    // atributos
    private String nome;
    private String sigla;
    private int codigoIbge;

    // construtor privado
    private EstadoBrasileiro(String sigla, String nome, int codigoIbge) {
        this.sigla = sigla;
        this.nome = nome;
        this.codigoIbge = codigoIbge;
    }

    // e os gets
    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public String getNomeMaisculo() {
        return nome.toUpperCase();
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    // não costuma ter set
    
}
