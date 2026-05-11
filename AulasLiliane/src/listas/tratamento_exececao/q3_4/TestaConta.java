package listas.tratamento_exececao.q3_4;

public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);

        try {
            minhaConta.saca(1000);
        } catch (ContaExcecao e) {
            System.out.println("Problema no saque: " + e.getMessage());
            System.out.println("Seu saldo disponível é: " + e.getSaldoAtual());
        }
    }
}
