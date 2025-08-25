package main;

public class Conta {
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoConta;
    private int saldoAtual;
    private int limiteDisponivel;

    public Conta(String banco, String agencia, String numeroConta, String tipoConta, int saldoAtual, int limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;


    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public int getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(int limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "conta{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", limiteDisponivel=" + limiteDisponivel +
                '}';
    }

}


