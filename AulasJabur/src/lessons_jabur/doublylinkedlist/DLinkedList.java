package lessons_jabur.doublylinkedlist;

public class DLinkedList {

    protected DNode header;   // Sentinela - cabeçalho da lista
    protected DNode trailer;  // Sentinela - nodo final
    protected int size;       // Tamanho da lista;

    // {Construtor padrão que cria uma lista vazia}
    public DLinkedList(){
        header = new DNode(null,null,null);
        trailer = new DNode(null,null,null);
        header.setNext(trailer);
        size = 0;
    }

    // {Adicionando um nó novo na lista}
    public void addFirst (DNode no){
        DNode w;
        w = header.getNext();   // {aponta para o primeiro elemento da lista}
        no.setNext(w);   // {atribui o  endereço para o primeiro elemento}
        no.setPrev(header);   // {atribui o endereço para o sentinela header}
        w.setPrev(no);   // {aponta para o nó antigo}
        header.setNext(no);
        size++;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    } // {verifica se a lista está vazia}

    public DNode getFirst()throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("Lista Vazia!");
        return header.getNext();
    } // {retorna o primeiro da lista}

    public DNode getLast()throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("Lista Vazia!");
        return header.getPrev();
    } // {retorna o ultimo da lista}

    public DNode getPrev(DNode no)throws IllegalArgumentException{
        if(no == header)
            throw  new IllegalArgumentException("Não há nó anterior");
        return no.getPrev();
    } // {retorna o nó anterior do nó dado}

    public DNode getNext(DNode no)throws IllegalArgumentException{
        if(no == trailer)
            throw new IllegalArgumentException("Não há nó posterior");
        return no.getNext();
    } // {retorna o nó posterior do nó dado}

    public void addAntes(DNode v, DNode no)throws IllegalArgumentException{
        DNode u = getPrev(v);
        no.setPrev(u);
        no.setNext(v);
        v.setPrev(no);
        u.setNext(no);
        size++;
    } // {insere um dado nó antes de um dado v}

    public void addAfter(DNode v, DNode no)throws IllegalArgumentException{
        DNode u = getNext(v);
        no.setPrev(v);
        no.setNext(u);
        v.setNext(no);
        u.setPrev(no);
        size++;
    } // {insere um dado nó depois de um nó "v"}

    public void addLast(DNode no){
        addAntes(trailer, no);
    } // {insere um nó fornecido no fim da lista}

    public void removeNo(DNode no)throws IllegalArgumentException{
        DNode u = getPrev(no);
        DNode w = getNext(no);
        u.setNext(w);
        w.setPrev(u);
        no.setNext(null);
        no.setPrev(null);
        size--;
    } // {removendo um nó "no" da lista}

    public boolean temAnt(DNode no){
        return (no != header);
    } // {indica se o nó possui antecessor}

    public boolean temSuc(DNode no){
        return (no != trailer);
    } // {indicar se o nó possui sucessor}

    public String toString(){
        DNode ponteiro = header.getNext();
        String s = "{";
        int i = 1;

        while (ponteiro.getNext()!=null){
            if(i == 1)
                s +=" [.]-> ";
            s += " <- ";
            s += ponteiro.getElement();
            s += " -> ";
            i++;
            ponteiro = ponteiro.getNext();
        }
        return s += " <-[.]}";
    }
}
