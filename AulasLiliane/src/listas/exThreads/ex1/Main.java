package listas.exThreads.ex1;

class ThreadCrescente extends Thread {
    public ThreadCrescente(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(this.getName() + " -> Valor: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " foi interrompida.");
            }
        }
    }
}

class ThreadDecrescente extends Thread {
    public ThreadDecrescente(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 50; i >= 1; i--) {
            System.out.println(this.getName() + " -> Valor: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " foi interrompida.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando a execução das Threads...\n");

        ThreadCrescente thread1 = new ThreadCrescente("Thread-Crescente");
        ThreadDecrescente thread2 = new ThreadDecrescente("Thread-Decrescente");

        thread1.start();
        thread2.start();
    }
}
