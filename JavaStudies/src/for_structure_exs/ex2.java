package for_structure_exs;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q, conti = 0, conto = 0;
        System.out.println("Insert integers quantity: ");
        q = sc.nextInt();

        int[] vet = new int[q];

        for (int i = 0; i < vet.length; i++){
            System.out.printf("Insert a value for position %d: ", i+1);
            vet[i] = sc.nextInt();
        }

        for ( int i = 0; i < vet.length; i++){
            if (vet[i] >= 10 && vet[i] <= 20){
                conti += 1;
            }else {
                conto += 1;
            }
        }

        System.out.printf("\nNumbers within the range: %d", conti);
        System.out.printf("\nNumber outside the range: %d", conto);
    }
}
