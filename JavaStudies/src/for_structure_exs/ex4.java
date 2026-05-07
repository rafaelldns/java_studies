package for_structure_exs;

import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double n1 = 0, n2 = 0, div = 0;
        System.out.println("Insert quantity:");
        n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Insert number for division:");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            div = n1/n2;
            if ( n2 == 0 ){
                System.out.println("Impossible division!");
            }else {
                System.out.printf("The %.1f divided by %.1f is: %.1f\n", n1, n2, div);
            }
        }
    }
}
