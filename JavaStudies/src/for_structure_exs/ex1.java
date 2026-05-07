package for_structure_exs;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Insert X:");
        x = sc.nextInt();

        if (1 <= x && x <= 1000) {
            for (int i = 1; i <= x; i += 2) {
                System.out.println(i);
            }
        }
    }
}
