package lessons_jabur.simplelikendlist;

    //Declara uma classe interna que representa um "Nó" da lista
    //Cada nó guarda uma informação e aponta para o próximo nó
    public class Node{

        //Atributo privado que aponta o dado deste nó (texto/String)
        private String element;

        //Atributo privado que armazena a referencia (ponteiro) para o próximo nó da lista
        private Node next;

        // Construtor da classe Node é chamado quando criamos um novo nó,
        //exigindo que passemos a próxima informação (s) e o próximo nó (n)
        public Node(String s, Node n){
            //Atribui a String recebida "s" ao atributo "element" do nó
            element = s;
            //Atribui a referência do nó "n" ao nó "next", ligando-o ao próximo elemento
            next = n;
        }

        // Metodo "getter" usado para ler o valor armazenado no nó fora da classe
        public String getElement(){
            return element;
        }

        // Metodo "getter" para descobrir o próximo nó da lista
        public Node getNext(){
            return next;
        }

        //Define o elemento do nó
        // Metodo "setter" usado para alterar a informação armazenada no nó depois de criado
        public void setElement(String newElement){
            // substitui o valor antigo armazenado do "element" pelo novo valor recebido "newElement"
            element = newElement;
        }

        // Metodo "setter" para alterar para onde este nó aponta
        public void setNext(Node newNext){
            // substitui o próximo nó antigo pelo novo recebido "newNext"
            next = newNext;
        }
    }
