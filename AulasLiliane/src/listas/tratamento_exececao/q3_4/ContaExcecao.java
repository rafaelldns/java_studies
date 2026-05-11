package listas.tratamento_exececao.q3_4;

public class ContaExcecao extends Exception {
    private double saldoAtual;

    public ContaExcecao(String mensagem, double saldo) {
        super(mensagem);
        this.saldoAtual = saldo;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
