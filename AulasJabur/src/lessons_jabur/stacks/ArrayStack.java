package lessons_jabur.stacks;

import java.util.EmptyStackException;

public class ArrayStack<E> implements interfStack<E> {
    protected int capacidade;
    public static final int CAPACIDADE = 1000;   // Capacidade padrão caso nenhuma seja informada
    protected  E S [];   // Array que guarda os elementos
    protected int topo = -1;   // Indice do topo começa em -1 para simbolizar pilha vazia
    public ArrayStack(){
        this(CAPACIDADE);
    }  //Construtor; Cria pilha com usando capacidade padrão
    public ArrayStack(int cap){  //Construtor personalizado para definir capacidade
        capacidade = cap;
        S = (E[]) new Object[capacidade]; // Crima um array de Objects e faz o cast para o tipo E
    }

    @Override
    public int size() {
        return (topo + 1);
    }

    @Override
    public boolean isEmpty() {
        return (topo<0);
    }

    @Override
    public void push (E elemento) throws FullStackException{ // Inserere elemento no topo
        if(size() == capacidade){
            throw new FullStackException("Pilha está Cheia!");
        }
        S[++topo] = elemento; // Incrementa o indice do topo e depois insere o elemento na lista
    }

    @Override
    public E top() throws EmptyStackException {  // Visualiza elemento do topo sem remover
        if (isEmpty())throw new EmptyStackException();
        return S[topo];
    }

    @Override
    public E pop() throws EmptyStackException{  // Remove e retorna o elemento do topo
        E elemento;
        if (isEmpty()) throw new EmptyStackException();
        elemento = S[topo]; // Guarda elemento do topo para retorna-lo no final
        S[topo--] = null;  // Limpa posição atual do topo
        return elemento;  // Retorna o elemento removido
    }
    public String toString(){  // Representação em texto dos elementos da pilha
        String s;
        s = " [";
        if (size() > 0)
            s+=S[0];
        if (size()>1)
            for (int i = 1; i <= size() -1; i++){
                s += ", "+S[i];
            }
        return s + "]";
    }

    public void status(String op, Object elemento){  // Auxiliar para printar o estudo atual da pilha apos uma operação
        System.out.println("------> " +op);
        System.out.println(" , retorna " + elemento);
        System.out.println("resultado: tamanho = " + size() + " , Pilha Vazia? " + isEmpty());
        System.out.println(", pilha: " + this);
    }

}
