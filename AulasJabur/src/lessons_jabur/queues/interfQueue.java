package lessons_jabur.queues;

public interface interfQueue<E> {
    public int size();
    public boolean isEmpty();
    public E front() throws EmptyQueueException;
    public void enqueue(E elemento) throws FullQueueException;
    public E dequeue() throws EmptyQueueException;
}
