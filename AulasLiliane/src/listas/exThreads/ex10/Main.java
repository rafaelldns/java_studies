package listas.exThreads.ex10;

import java.util.Random;

class SomadorThread extends Thread {
    private final int[] vetor;
    private final int inicio;
    private final int fim;
    private long somaParcial = 0;

    public SomadorThread(int[] vetor, int inicio, int fim, String nome) {
        super(nome);
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fim; i++) {
            somaParcial += vetor[i];
        }
        System.out.println(this.getName() + " somou do índice " + inicio + " ao " + (fim - 1) + " -> Subtotal: " + somaParcial);
    }

    public long getSomaParcial() {
        return somaParcial;
    }
}

public class Main {
    public static void main(String[] args) {
        int TAMANHO_VETOR = 1000;
        int NUM_THREADS = 4;
        int[] vetor = new int[TAMANHO_VETOR];
        Random random = new Random();

        long somaVerificacaoSequencial = 0;

        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor[i] = random.nextInt(100) + 1;
            somaVerificacaoSequencial += vetor[i];
        }

        System.out.println("Iniciando processamento paralelo...");
        System.out.println("Soma esperada (calculada sequencialmente): " + somaVerificacaoSequencial + "\n");

        SomadorThread[] threads = new SomadorThread[NUM_THREADS];

        int tamanhoLote = TAMANHO_VETOR / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++) {
            int inicio = i * tamanhoLote;
            int fim = (i == NUM_THREADS - 1) ? TAMANHO_VETOR : (inicio + tamanhoLote);

            threads[i] = new SomadorThread(vetor, inicio, fim, "Thread-" + (i + 1));
            threads[i].start();
        }

        long somaTotalConcorrente = 0;

        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
                somaTotalConcorrente += threads[i].getSomaParcial();
            } catch (InterruptedException e) {
                System.out.println("Erro ao aguardar a " + threads[i].getName());
            }
        }

        System.out.println("\nSoma total agregada usando Threads: " + somaTotalConcorrente);
    }
}
