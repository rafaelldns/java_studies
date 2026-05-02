package listas.lista3.ex1;

public class Item {
    Parte parte;
    int quantidade;

    public Item(Parte parte, int quantidade) {
        this.parte = parte;
        this.quantidade = quantidade;
    }

    public float calculaValor() {
        return parte.calculaValor() * quantidade;
    }

    @Override
    public String toString() {
        return "Item [parte=" + parte.toString() +
                ", quantidade=" + quantidade +
                ", valorTotal=" + calculaValor() + "]";
    }
}