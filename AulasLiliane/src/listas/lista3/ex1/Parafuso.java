package listas.lista3.ex1;

public class Parafuso extends Parte {
    float comprimento;
    float diametro;

    public Parafuso(int codigo, String nome, String descricao, float valor,
                    float comprimento, float diametro) {
        super(codigo, nome, descricao, valor);
        this.comprimento = comprimento;
        this.diametro = diametro;
    }

    @Override
    public float calculaValor() {
        // exemplo: valor proporcional ao tamanho
        return valor * comprimento * diametro;
    }

    @Override
    public String toString() {
        return "Parafuso [codigo=" + codigo +
                ", nome=" + nome +
                ", descricao=" + descricao +
                ", valor=" + valor +
                ", comprimento=" + comprimento +
                ", diametro=" + diametro + "]";
    }
}
