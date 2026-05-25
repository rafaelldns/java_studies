package lists_jabur.doublylinkedlist;

public class Main {
    static void main(String[] args) {
     DLinkedList lista = new DLinkedList(); // {instanciado lista}

        System.out.println("=== Criando e testando lista duplamente encadeada ===");
        System.out.println("Lista vazia?" + lista.isEmpty()); // Deve retornar true

        // {Criando nós indivduais}
        DNode no1 = new DNode("Java", null, null);
        DNode no2 = new DNode("Python", null, null);
        DNode no3 = new DNode("C++", null, null);
        // Construtor pede : ( String, node anterior, node próximo)

        // Inserindo elementos na lista
        System.out.println("\nAdicionando elementos");
        lista.addFirst(no1);  // Add Java no inicio
        lista.addLast(no2);  // Add Python no fim

        lista.addAfter(no1,no3); // Add C++ a seguir do Java

        System.out.println("Tamanho atual da lista: " + lista.size());
        System.out.println("Conteúdo da lista: " + lista.toString());

        System.out.println("\nNavegando pelos elementos:"); // testando navegação por nós
        DNode primeiro = lista.getFirst();
        System.out.println("Primeiro elemento real: " + primeiro.getElement());

        DNode proximo = lista.getNext(primeiro);
        System.out.println("Próximo elemento (Apos o primeiro): " + proximo.getElement());

        System.out.println("\nRemovendo o elemento 'C++'..."); // testando remoção
        lista.removeNo(no3);

        System.out.println("Tamanho após remoção: " + lista.size());
        System.out.println("Conteúdo final da lista: " + lista.toString());

    }
}
