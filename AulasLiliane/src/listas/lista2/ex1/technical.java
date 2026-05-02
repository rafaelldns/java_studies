package listas.lista2.ex1;

class technical extends assistent{
    private double bonus;

    public technical(String nome, double salario, int matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual() {
        return (salario + bonus) * 12;
    }
}
