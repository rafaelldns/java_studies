package listas.exThreads.ex2;

class PessoaDigitando implements Runnable {

    @Override
    public void run() {
        String nomePessoa = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + nomePessoa + ": mensagem " + i);

            try {
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                System.out.println(nomePessoa + " parou de digitar (interrompida).");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o chat...\n");

        PessoaDigitando tarefaDigitacao = new PessoaDigitando();

        Thread threadMaria = new Thread(tarefaDigitacao, "Maria");
        Thread threadJoao = new Thread(tarefaDigitacao, "João");

        threadMaria.start();
        threadJoao.start();
    }
}
