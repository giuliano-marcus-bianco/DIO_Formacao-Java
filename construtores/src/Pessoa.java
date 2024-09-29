public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // método construtor
    // o nome deve ser identico ao nome da classe
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // é possível ter mais de um construtor
    public Pessoa() {
        super();
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // mas a recomendação é ter apenas um construtor sem atributos e outro com os atributos que sejam minimamente necessários

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
