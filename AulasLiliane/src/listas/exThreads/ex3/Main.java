package listas.exThreads.ex3;

import java.util.Random;

class Carro extends Thread {
    private static volatile boolean vencedorDefinido = false;

    private int distanciaPercorrida = 0;
    private static final int DISTANCIA_TOTAL = 100;

    public Carro(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        Random random = new Random();

        while (distanciaPercorrida < DISTANCIA_TOTAL && !vencedorDefinido) {

            int avanco = random.nextInt(10) + 1;
            distanciaPercorrida += avanco;

            if (distanciaPercorrida > DISTANCIA_TOTAL) {
                distanciaPercorrida = DISTANCIA_TOTAL;
            }

            System.out.println(this.getName() + " avançou para a posição: " + distanciaPercorrida + " metros.");

            if (distanciaPercorrida == DISTANCIA_TOTAL) {
                synchronized (Carro.class) {
                    if (!vencedorDefinido) {
                        vencedorDefinido = true;
                        System.out.println("\n🏆 " + this.getName() + " VENCEU A CORRIDA! 🏆\n");
                    }
                }
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " quebrou o motor (interrompido).");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("🚥 A corrida vai começar! 🚥\n");

        Carro carro1 = new Carro("Carro 1");
        Carro carro2 = new Carro("Carro 2");
        Carro carro3 = new Carro("Carro 3");
        Carro carro4 = new Carro("Carro 4");
        Carro carro5 = new Carro("Carro 5");

        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
        carro5.start();
    }
}
