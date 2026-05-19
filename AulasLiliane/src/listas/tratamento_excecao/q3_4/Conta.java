package listas.tratamento_excecao.q3_4;

public class Conta {
    private double saldo;
    private double limite;

    public void deposita(double valor) { this.saldo += valor; }
    public void setLimite(double limite) { this.limite = limite; }

    public void saca(double valor) throws ContaExcecao {
        if (valor > this.saldo) {
            throw new ContaExcecao("Saldo insuficiente para o saque.", this.saldo);
        }
        this.saldo -= valor;
    }
}
