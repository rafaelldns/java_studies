package while_structure;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Valid Quadrants");
        System.out.println("Insert X and Y value:");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0){
            if ( x > 0){
                if ( y > 0){
                    System.out.println("First Quadrant!");
                }else System.out.println("Fourth Quadrant!");
            } else if ( y > 0) {
                System.out.println("Second Quadrant!");
            }else System.out.println("Third Quadrant!");

            System.out.println("Insert a X and Y value:");
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
