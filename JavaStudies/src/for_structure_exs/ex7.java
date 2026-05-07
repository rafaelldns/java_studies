package for_structure_exs;

import java.util.Scanner;

public class ex7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Insert a number: ");
        n = sc.nextInt();

        for ( int i = 1; i <= n; i++){
            int i2 = (int) Math.pow(i, 2);
            int i3 = (int) Math.pow(i, 3);
            System.out.printf("Line %d: %d %d %d \n", i, i, i2, i3);
        }
    }
}
