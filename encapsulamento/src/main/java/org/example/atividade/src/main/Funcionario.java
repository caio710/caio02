package main;

public class Funcionario {
    private String codigodofuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private int contabanco;

    public Funcionario(String codigodofuncionario, String nome, String endereco, String telefone, String email, int contabanco) {
        this.codigodofuncionario = codigodofuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contabanco = contabanco;
    }

    public String getCodigodofuncionario() {
        return codigodofuncionario;
    }

    public void setCodigodofuncionario(String codigodofuncionario) {
        this.codigodofuncionario = codigodofuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContabanco() {
        return contabanco;
    }

    public void setContabanco(int contabanco) {
        this.contabanco = contabanco;
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "codigodofuncionario='" + codigodofuncionario + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contabanco=" + contabanco +
                '}';
    }
}
