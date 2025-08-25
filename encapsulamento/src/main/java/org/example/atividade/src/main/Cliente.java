package main;

public class Cliente {
    private String nome;
    private int idade;
    private Pedido pedido;

    public Cliente(String nome, int idade, Pedido pedido) {
        this.nome = nome;
        this.idade = idade;
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pedido=" + pedido +
                '}';
    }
}


