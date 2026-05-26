package lists_jabur.stacks;

import java.util.EmptyStackException;

public class Main {
    static void main(String[] args) {
        ArrayStack<String> pilha = new ArrayStack<>(3); // Cria pilha de String com capacidade 3 p/ teste

        System.out.println("=== INICIANDO TESTES DA PILHA ===");
        System.out.println("Estado Inicial: tamanho = " + pilha.size() + ", Pilha Vazia? " + pilha.isEmpty());
        System.out.println("Pilha atual: " + pilha);
        System.out.println("--------------------------------------------------\n");

        try {  // testa inserções
            pilha.push("A");
            pilha.status("push(\"A\")", null);

            pilha.push("B");
            pilha.status("push(\"B\")", null);

            pilha.push("C");
            pilha.status("push(\"C\")", null);

            System.out.println("\n--- Tentando forçar o estouro da capacidade ---"); // Deve retornar FullStackException
            pilha.push("D");

        } catch (FullStackException e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }

        System.out.println("\n--------------------------------------------------");

        try {  // testa ver o topo
            String elementoNoTopo = pilha.top();
            pilha.status("top()", elementoNoTopo);
        } catch (EmptyStackException e) {
            System.out.println("Erro: A pilha está vazia!");
        }

        System.out.println("\n--------------------------------------------------");

        try { // testa remoções
            String removido1 = pilha.pop();
            pilha.status("pop()", removido1);

            String removido2 = pilha.pop();
            pilha.status("pop()", removido2);

            String removido3 = pilha.pop();
            pilha.status("pop()", removido3);

            System.out.println("\n--- Tentando remover de uma pilha já vazia ---");
            pilha.pop();

        } catch (EmptyStackException e) {
            System.out.println("Exceção capturada com sucesso: EmptyStackException (Pilha vazia!)");
        }
        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
