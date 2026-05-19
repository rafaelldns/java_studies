package listas.excecao_personalizada;

class ProdutoEsgotadoException extends Exception {
    public ProdutoEsgotadoException(String msg) { super(msg); }
}

class QuantidadeInvalidaException extends RuntimeException {
    public QuantidadeInvalidaException(String msg) { super(msg); }
}

class ControleEstoque {
    private int estoqueAtual;
    public ControleEstoque(int estoqueInicial) { this.estoqueAtual = estoqueInicial; }

    public void adicionarEstoque(int quantidade) {
        if (quantidade < 0) throw new QuantidadeInvalidaException("Quantidade negativa inválida: " + quantidade);
        estoqueAtual += quantidade;
        System.out.println(quantidade + " itens adicionados. Estoque: " + estoqueAtual);
    }

    public void comprar() throws ProdutoEsgotadoException {
        if (estoqueAtual == 0) throw new ProdutoEsgotadoException("Produto esgotado.");
        estoqueAtual--;
        System.out.println("Compra realizada. Estoque restante: " + estoqueAtual);
    }
}
