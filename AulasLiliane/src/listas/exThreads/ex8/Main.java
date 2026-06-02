package listas.exThreads.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Jogador extends Thread {
    private int resultadoDado = 0;

    public Jogador(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        Random random = new Random();

        try {
            Thread.sleep((long) (Math.random() * 500));
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " derrubou o dado.");
        }

        this.resultadoDado = random.nextInt(6) + 1;

        System.out.println("🎲 " + this.getName() + " rolou o dado e tirou: " + this.resultadoDado);
    }

    public int getResultadoDado() {
        return resultadoDado;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o Jogo de Dados...\n");

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alice"));
        jogadores.add(new Jogador("Bob"));
        jogadores.add(new Jogador("Carlos"));
        jogadores.add(new Jogador("Diana"));

        for (Jogador jogador : jogadores) {
            jogador.start();
        }

        for (Jogador jogador : jogadores) {
            try {
                jogador.join();
            } catch (InterruptedException e) {
                System.out.println("Erro ao aguardar o jogador " + jogador.getName());
            }
        }

        System.out.println("\n--- RESULTADO FINAL --- ");

        int maiorValor = 0;
        List<String> vencedores = new ArrayList<>();

        for (Jogador jogador : jogadores) {
            int valor = jogador.getResultadoDado();

            if (valor > maiorValor) {
                maiorValor = valor;
                vencedores.clear();
                vencedores.add(jogador.getName());
            } else if (valor == maiorValor) {
                vencedores.add(jogador.getName());
            }
        }

        if (vencedores.size() == 1) {
            System.out.println("O vencedor é " + vencedores.get(0) + " com o valor " + maiorValor + "!");
        } else {
            System.out.println("Houve um empate! Vencedores: " + String.join(", ", vencedores) + " com o valor " + maiorValor + "!");
        }
    }
}