package lessons_jabur.stacks;

import java.util.EmptyStackException;

public interface interfStack<E>{

        public int size(); // retorna numero de elementos

        public boolean isEmpty(); // retorna verdadeiro ou falso para lista vazia

        public E top()throws EmptyStackException; // verifica elemento no topo e retorna, exception para lista vazia

        public void push (E element); // insere elemento no topo

        public E pop () throws EmptyStackException; // remove o topo e retorna o elemento, exception em lista vazia

    }

