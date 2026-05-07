package while_structure;

import java.util.Scanner;

public class ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Password:");
        x = sc.nextInt();

        while ( x != 2002){
            System.out.println("Invalid password\nTry again!");
            System.out.println("Password:");
            x = sc.nextInt();
        }

        System.out.println("Access allowed!");
    }
}
