package listas.lista3.ex1;

public abstract class Parte {
    int codigo;
    String nome;
    String descricao;
    float valor;

    public Parte(int codigo, String nome, String descricao, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract float calculaValor();

    @Override
    public abstract String toString();
}