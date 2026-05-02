package listas.lista2.ex1;

class assistent  extends employee {
    protected int matricula;

    public assistent (String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Matrícula: " + matricula);
    }
}