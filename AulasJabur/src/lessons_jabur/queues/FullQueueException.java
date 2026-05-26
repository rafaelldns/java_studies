package lessons_jabur.queues;

public class FullQueueException extends Exception {
    public FullQueueException() {
        super("A fila está cheia! Não é possível adicionar mais elementos.");
    }
    public FullQueueException(String mensagem) {
        super(mensagem);
    }
}
