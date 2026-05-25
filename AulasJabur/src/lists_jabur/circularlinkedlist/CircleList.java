package lists_jabur.circularlinkedlist;

public class CircleList {

    protected Node cursor; // 'cursor' aponta para um nó de referência na lista circular
    protected int size;

    public CircleList(){
        cursor = null;
        size = 0;
    }

    class Node {
        protected String element;
        protected  Node next;

        public Node (String e, Node n){
            element = e;
            next = n;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    public void add (Node newNode){
        if (cursor == null){
            newNode.setNext(newNode);
            cursor = newNode;
        } // Se a lista estive vazia o novo nó aponta para si mesmo (circularidade), o cursor passa a apontar para ele
        else {
            newNode.setNext(cursor.getNext());
            cursor.setNext(newNode);
        } // Se não o novo nó aponta para o "primeiro" da lista, o cursor aponta para o nó inserido
        advance();
        size++;
    }

    public Node remove(){
        if (cursor == null) return null;

        Node oldNode = cursor; //  Guarda o nó a ser removido
        if (size == 1){
            cursor = null; // Se tem só 1 elemento ficará vazia
        } else {
            for (int i = 0; i < size - 1; i++){
                advance();
            } // Vai até o anterior ao cursor
            // Agora o cursor é o nó  anterior e passará a apontar para o próximo do 'oldNode',
            // excluindo o oldNode da lista.
            cursor.setNext(oldNode.getNext());
            oldNode.setNext(null);
        }
        size--;
        return oldNode;
    }

    public void advance(){
        if (cursor != null)cursor = cursor.getNext();
    }

    public Node getCursor(){
        return cursor;
    }

    public int size(){
        return size;
    }

    public String toString(){
        if(cursor == null)
            return "[]";
        String s = "[..."+ cursor.getElement();
        Node oldCursor = cursor;
        for(advance(); oldCursor != cursor; advance()) // o loop avança ao próximo nó antes de testar condição
            s += "," + cursor.getElement();  // continuará rodando e concatenando os elementos até dar a volta completa
        // e o 'cursor' se igualar ao 'oldCursor' novamente
        return s + "...]";
    }

}
