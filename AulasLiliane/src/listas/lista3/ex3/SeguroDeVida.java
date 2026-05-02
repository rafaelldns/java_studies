package listas.lista3.ex3;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42; // valor fixo
    }
}
