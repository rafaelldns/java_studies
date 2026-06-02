package listas.sincroniza_threads;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Impressora {
    private final Lock lock = new ReentrantLock();

    public void imprimir(String nomeUsuario, String nomeDocumento) {
        System.out.println("[" + nomeUsuario + "] Enviou '" + nomeDocumento + "' para a fila e está aguardando a impressora.");

        lock.lock();
        try {
            System.out.println("  -> [IMPRIMINDO] A impressora está processando '" + nomeDocumento + "' de " + nomeUsuario + "...");

            int tempoImpressao = 1000 + new Random().nextInt(2001);
            Thread.sleep(tempoImpressao);

            System.out.println("  -> [CONCLUÍDO] '" + nomeDocumento + "' impresso com sucesso em " + (tempoImpressao / 1000.0) + "s.\n");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Erro na thread: " + e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}

class Usuario implements Runnable {
    private String nome;
    private Impressora impressora;
    private int qtdDocumentos;
    private Random random = new Random();

    public Usuario(String nome, Impressora impressora, int qtdDocumentos) {
        this.nome = nome;
        this.impressora = impressora;
        this.qtdDocumentos = qtdDocumentos;
    }

    @Override
    public void run() {
        for (int i = 1; i <= qtdDocumentos; i++) {
            String documento = "Documento_" + i + ".pdf";

            impressora.imprimir(nome, documento);

            try {
                Thread.sleep(500 + random.nextInt(1501));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class SistemaImpressao {
    public static void main(String[] args) {
        Impressora impressoraCompartilhada = new Impressora();

        System.out.println("Iniciando o sistema de impressão compartilhado...\n");

        Thread t1 = new Thread(new Usuario("Alice", impressoraCompartilhada, 2));
        Thread t2 = new Thread(new Usuario("Bruno", impressoraCompartilhada, 2));
        Thread t3 = new Thread(new Usuario("Carlos", impressoraCompartilhada, 2));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Todos os documentos foram impressos. Sistema encerrado.");
    }
}
