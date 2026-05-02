package listas.lista3.ex1;

public class Motor extends Parte {
    float potencia;
    float corrente;
    int rpm;

    public Motor(int codigo, String nome, String descricao, float valor,
                 float potencia, float corrente, int rpm) {
        super(codigo, nome, descricao, valor);
        this.potencia = potencia;
        this.corrente = corrente;
        this.rpm = rpm;
    }

    @Override
    public float calculaValor() {
        // exemplo: valor base * fator da potência
        return valor * potencia;
    }

    @Override
    public String toString() {
        return "Motor [codigo=" + codigo +
                ", nome=" + nome +
                ", descricao=" + descricao +
                ", valor=" + valor +
                ", potencia=" + potencia +
                ", corrente=" + corrente +
                ", rpm=" + rpm + "]";
    }
}
