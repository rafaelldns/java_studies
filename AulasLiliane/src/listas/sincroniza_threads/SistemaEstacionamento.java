package listas.sincroniza_threads;

import java.util.Random;
import java.util.concurrent.Semaphore;

class Estacionamento {
    private final Semaphore vagas = new Semaphore(3, true);

    public void estacionar(String nomeCarro) {
        System.out.println("-> [" + nomeCarro + "] Chegou no estacionamento e está procurando vaga.");

        try {
            vagas.acquire();

            System.out.println("  [ENTROU] " + nomeCarro + " conseguiu uma vaga! (Vagas disponíveis: " + vagas.availablePermits() + ")");

            int tempoEstacionado = 2000 + new Random().nextInt(3001);
            Thread.sleep(tempoEstacionado);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Erro na thread do carro: " + e.getMessage());
        } finally {
            System.out.println("  [SAIU] " + nomeCarro + " foi embora. Liberando a vaga.");
            vagas.release();
        }
    }
}

class Carro implements Runnable {
    private String nome;
    private Estacionamento estacionamento;

    public Carro(String nome, Estacionamento estacionamento) {
        this.nome = nome;
        this.estacionamento = estacionamento;
    }

    @Override
    public void run() {
        estacionamento.estacionar(nome);
    }
}

public class SistemaEstacionamento {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        System.out.println("Iniciando o sistema do Estacionamento...\n");

        Thread[] carros = new Thread[10];

        for (int i = 0; i < 10; i++) {
            carros[i] = new Thread(new Carro("Carro " + (i + 1), estacionamento));
            carros[i].start();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        for (int i = 0; i < 10; i++) {
            try {
                carros[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nTodos os carros já passaram pelo estacionamento. Sistema encerrado.");
    }
}
