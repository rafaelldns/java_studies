package listas.lista3.ex3;

public class GerenciadorDeImpostoDeRenda {
    private double total;

    public void adicionar(Tributavel t) {
        this.total += t.getValorImposto();
    }

    public double getTotal() {
        return total;
    }
}
