package lists_jabur.circularlinkedlist;

public class Main {
    static void main(String[] args) {
        CircleList list = new CircleList();

        System.out.println("Lista vazia: " + list.toString());

        CircleList.Node no1 = list.new Node("A", null);
        CircleList.Node no2 = list.new Node("B", null);
        CircleList.Node no3 = list.new Node("C", null);

        System.out.println("\nAdicionando nós...");
        list.add(no1);
        list.add(no2);
        list.add(no3);

        System.out.println("Estado atual da lista" + list.toString());
        System.out.println("Tamanho da Lista: "+ list.size);

        System.out.println("\nAvançando o cursor uma vez...");
        list.advance();
        System.out.println("Nova representação: " + list.toString());
    }

}
