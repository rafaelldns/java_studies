package listas.lista2.ex1;

class administrative extends assistent {
    private String turno; // "dia" ou "noite"
    private double adicionalNoturno;

    public administrative(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        if (turno.equalsIgnoreCase("noite")) {
            return (salario + adicionalNoturno) * 12;
        } else {
            return salario * 12;
        }
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);
    }
}
