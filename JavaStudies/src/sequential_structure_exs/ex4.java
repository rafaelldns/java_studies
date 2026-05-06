package sequential_structure_exs;

import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rn, wh;
        double hv, w;

        System.out.println("Insert your register number: ");
        rn = sc.nextInt();
        System.out.println("Insert your hours worked: ");
        wh = sc.nextInt();
        System.out.println("Insert you value per hour received: ");
        hv = sc.nextDouble();

        w = wh * hv;

        System.out.printf("Register number: %d%nTotal wage: U$%.2f", rn, w);
    }
}
