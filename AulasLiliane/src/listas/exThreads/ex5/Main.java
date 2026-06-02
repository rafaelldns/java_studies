package listas.exThreads.ex5;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer> fila = new LinkedList<>();
    private final int CAPACIDADE_MAXIMA = 5;

    public synchronized void produzir(int valor) throws InterruptedException {
        while (fila.size() == CAPACIDADE_MAXIMA) {
            System.out.println("Fila CHEIA. Produtor aguardando espaço...");
            wait();
        }

        fila.add(valor);
        System.out.println("Produtor adicionou: " + valor + " | Tamanho atual: " + fila.size());

        notify();
    }

    public synchronized void consumir() throws InterruptedException {
        while (fila.isEmpty()) {
            System.out.println("Fila VAZIA. Consumidor aguardando itens...");
            wait();
        }

        int valor = fila.poll();
        System.out.println("Consumidor removeu: " + valor + " | Tamanho atual: " + fila.size());

        notify();
    }
}

class Produtor implements Runnable {
    private final Buffer buffer;

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int contador = 1;
        try {
            while (true) {
                buffer.produzir(contador++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Produtor interrompido.");
        }
    }
}

class Consumidor implements Runnable {
    private final Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consumir();
                Thread.sleep(1200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumidor interrompido.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Produtor e Consumidor...\n");

        Buffer buffer = new Buffer();

        Thread threadProdutor = new Thread(new Produtor(buffer), "Thread-Produtor");
        Thread threadConsumidor = new Thread(new Consumidor(buffer), "Thread-Consumidor");

        threadProdutor.start();
        threadConsumidor.start();
    }
}
