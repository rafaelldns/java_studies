package listas.lista3.ex2;

public class TestaTributavel {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1000);

        SeguroDeVida sv = new SeguroDeVida();

        System.out.println("Conta Corrente tributo: " + cc.calculaTributos());

        // ContaPoupanca não tem tributo
        System.out.println("Conta Poupança saldo: " + cp.obterSaldo());

        System.out.println("Seguro de Vida tributo: " + sv.calculaTributos());
    }
}
