package listas.lista3.ex1;

public class Main {
    public static void main(String[] args) {

        Motor m = new Motor(1, "Motor A", "Motor industrial", 100,
                2.5f, 10f, 3000);

        Parafuso p = new Parafuso(2, "Parafuso B", "Parafuso aço", 2,
                5f, 0.5f);

        Item item1 = new Item(m, 3);
        Item item2 = new Item(p, 10);

        System.out.println(item1);
        System.out.println(item2);
    }
}
