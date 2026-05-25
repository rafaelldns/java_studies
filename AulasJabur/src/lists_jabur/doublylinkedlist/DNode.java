package lists_jabur.doublylinkedlist;

public class DNode {

    protected String element;
    protected DNode next, prev; // {Ponteiro para o próximo nó e para o antecessor}

    public DNode (String e, DNode p, DNode n){
        element = e;
        prev = p;
        next = n;
    } // {Construtor que cria um nó com os campos fornecidos}

    public String getElement(){
        return element;
    } // {Retorna o elemento do nó}

    public  DNode getPrev(){
        return prev;
    } // {Retorna o nodo anterior a esse}

    public DNode getNext(){
        return next;
    } // {Retorna o nodo posterior a esse}

    public void setElement(String newElement){
        element = newElement;
    } // {Atribui o elemento desse nó}

    public void setPrev(DNode newPrev){
        prev = newPrev;
    } // {Atribui o nodo anterior deste nodo}

    public void setNext(DNode newNext){
        next = newNext;
    } // {Atribui o nodo posterior deste nodo}

}
