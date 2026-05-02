package Ex.Ex03;

import java.util.Random;

public class Main03 {
    static void main(String[] args) {
        Random gerador = new Random();
        int vetInt[] = new int[20];
        for (int i = 0; i<20; i++) {
            vetInt[i] = gerador.nextInt(200);
        }
        for (int i = 0; i<20; i++){
            System.out.println(vetInt[i]);
        }

        NumeroInteiro numeroTeste;
        for (int i = 0; i<20; i++){
            numeroTeste = new NumeroInteiro(gerador.nextInt(10));
            if (i<300){
                System.out.println(numeroTeste);
            }
        }
    }
}
