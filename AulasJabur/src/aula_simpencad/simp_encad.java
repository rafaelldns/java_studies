package aula_simpencad;

class Node {
    private int value;
    private Node next;

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public int getValue(){
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Start {
    public static void main(String[] args) {

        Node tres = new Node(3, null);
        Node quatro = new Node(4, null);

        SimpledLinkedList teste = new SimpledLinkedList();
        teste.addFirst(tres);
        teste.addFirst(tres);
        // 4, 3, null
        //head = 3; tail = 3; size = 2;
        System.out.println(teste.getSize());
        System.out.println(teste.getHead());
        System.out.println(teste.getTail());
    }
}
