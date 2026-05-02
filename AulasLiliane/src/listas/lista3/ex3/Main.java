package listas.lista3.ex3;

public class Main {
    public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        ContaCorrente cc = new ContaCorrente(1000);
        SeguroDeVida sv = new SeguroDeVida();

        gerenciador.adicionar(cc);
        gerenciador.adicionar(sv);

        System.out.println("Total de impostos: " + gerenciador.getTotal());
    }
}
