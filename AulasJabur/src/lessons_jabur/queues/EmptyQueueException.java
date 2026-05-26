package lessons_jabur.queues;

public class EmptyQueueException extends Exception {
    public EmptyQueueException() {  // Construtor padrão sem mensagem
        super("A fila está vazia! Não é possível realizar a operação.");
    }
    public EmptyQueueException(String mensagem) { // Construtor que aceita uma mensagem customizada
        super(mensagem);
    }
}
