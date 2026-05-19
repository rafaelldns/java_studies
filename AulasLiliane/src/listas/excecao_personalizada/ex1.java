package listas.excecao_personalizada;

class SaldoInsuficienteException extends Exception {
    private double saldoAtual;
    private double valorTentado;

    public SaldoInsuficienteException(double saldoAtual, double valorTentado) {
        super("Saque negado! Saldo: R$ " + saldoAtual + " | Tentativa: R$ " + valorTentado);
        this.saldoAtual = saldoAtual;
        this.valorTentado = valorTentado;
    }
}

class ContaBancaria {
    private double saldo;
    public ContaBancaria(double saldoInicial) { this.saldo = saldoInicial; }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
    }
}
