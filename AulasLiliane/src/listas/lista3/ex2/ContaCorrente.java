package listas.lista3.ex2;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return saldo * 0.01; // 1% do saldo
    }
}
