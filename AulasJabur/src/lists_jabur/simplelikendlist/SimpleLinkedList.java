package lists_jabur.simplelikendlist;

public class SimpleLinkedList {

    // Declara uma variavel para guardar o primeiro nó da lista (head)
    // 'protected' permite que classes do mesmo pacote ou subclasses acessem essa variavel
    protected Node head;

    // Declara uma variavel que guarda o ultimo nó da lista (tail)
    // Guardar o ultimo nó da lista facilita inserir elemento no final da lista rapidamente
    protected Node tail;

    //Variavel para contar quantos elementos existem na lista atualmente
    protected long size;

    //Construtor padrão que cria uma lista vazia
    // Este código é executado automaticamente sempre que voce cria uma nova lista com
    // " new SimpleLinkedList() "
    public SimpleLinkedList(){
        // Como a lista acaba de ser criada ela esta vazia logo:
        head = null;
        tail = null;
        // Por estar vazia a contagem inicia em zero
        size = 0;
    }
}
