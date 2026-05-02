package aula_simpencad;

public class SimpledLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SimpledLinkedList() {
        super();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    @Override
    public String toString() {
        String toPrint = " ";
        int auxNode = head.getValue();
        toPrint = head.getValue() + " ";
        for( int i = 0; i<size; i++)
            toPrint = toPrint + auxNode + " ";
            auxNode = auxNode;
        return toPrint;
    }

    public void addFirst(Node newNode){
        // novo nó sera o head
        // o antigo head sera o proximo do head
        //size ++
        //if size == null, head = tail

        if(size == 0)
            tail = head;
        else
            newNode.setNext(head);
        head = newNode;
        size++;
    }

    public boolean getSize() {
        return size > 0;
    }

    public void removeFirst(){
        if(size == 0)
            return;
        head = head.getNext();
        size--;
        if ( size == 0)
            head = tail = null;

    }


    public void removeFromBack(){
        if (size == 0)
            return;
        Node aux = head;
        for(int i = 0; i < size-1; i++)
            aux = aux.getNext();
        tail = aux;
        tail.setNext(null);
        size--;
        if(size == 0)
            head = tail = null;
    }

    public void remove(int value){
        if (size == 0)
            return;
        Node found = search(value);
        if (found == null)
            return;
        if(found == head) {
            removeFirst();
            return;
        }
        if (found == tail) {
            removeFromBack();
            return;
        }

        Node aux = head;
        while (aux.getNext() != found)
            aux = aux.getNext();
        //aux agora é o anterior
        aux.setNext(found.getNext());
        size--;

    }




}
