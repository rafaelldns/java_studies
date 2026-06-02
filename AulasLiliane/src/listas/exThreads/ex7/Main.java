package listas.exThreads.ex7;

import java.util.Random;

class TarefaDownload implements Runnable {
    private final String nomeArquivo;

    public TarefaDownload(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void run() {
        Random random = new Random();
        int progresso = 0;

        while (progresso < 100) {
            int avanco = random.nextInt(11) + 5;
            progresso += avanco;

            if (progresso > 100) {
                progresso = 100;
            }

            System.out.println("Arquivo " + nomeArquivo + " -> " + progresso + "%");

            if (progresso == 100) {
                System.out.println("Concluído: Arquivo " + nomeArquivo);
                break;
            }

            try {
                int tempoPausa = random.nextInt(401) + 200;
                Thread.sleep(tempoPausa);
            } catch (InterruptedException e) {
                System.out.println("O download do arquivo " + nomeArquivo + " foi interrompido.");
                Thread.currentThread().interrupt(); // Restaura o status de interrupção
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o gerenciador de downloads...\n");

        TarefaDownload down1 = new TarefaDownload("filme.mp4");
        TarefaDownload down2 = new TarefaDownload("musica.mp3");
        TarefaDownload down3 = new TarefaDownload("jogo.zip");
        TarefaDownload down4 = new TarefaDownload("foto_ferias.jpg");

        Thread thread1 = new Thread(down1);
        Thread thread2 = new Thread(down2);
        Thread thread3 = new Thread(down3);
        Thread thread4 = new Thread(down4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
