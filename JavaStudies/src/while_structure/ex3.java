package while_structure;

import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op, ca = 0, cg = 0, cd = 0;
        System.out.println("MENU\n1. Alcohol\n2. Gasoline\n3. Diesel\n4. Exit");

        do {
            op = sc.nextInt();
            switch (op) {
                case 1:
                    ca += 1;
                    break;
                case 2:
                    cg += 1;
                    break;
                case 3:
                    cd += 1;
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Value!");
            }
        } while(op != 4);

        System.out.printf("Alcohol: %d\nGasoline: %d\nDiesel: %d", ca, cg, cd);

    }
}
