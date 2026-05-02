package listas.lista2.ex1;

public class main {
    public static void main(String[] args) {
        employee f = new employee("João", 2000);
        assistent a = new assistent("Maria", 2500, 123);
        technical t = new technical("Carlos", 3000, 456, 500);
        administrative adm = new administrative("Ana", 2800, 789, "noite", 300);

        System.out.println("=== Funcionário ===");
        f.exibeDados();
        System.out.println("Ganho anual: " + f.ganhoAnual());

        System.out.println("\n=== Assistente ===");
        a.exibeDados();
        System.out.println("Ganho anual: " + a.ganhoAnual());

        System.out.println("\n=== Técnico ===");
        t.exibeDados();
        System.out.println("Ganho anual: " + t.ganhoAnual());

        System.out.println("\n=== Administrativo ===");
        adm.exibeDados();
        System.out.println("Ganho anual: " + adm.ganhoAnual());
    }
}
