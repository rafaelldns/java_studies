package conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Determining quadrant\nInsert x and y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if ( x > 0 && y > 0){
            System.out.println("Quadrant 1!");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4!");
        } else if ( x < 0 && y > 0) {
            System.out.println("Quadrant 2!");
        } else if ( x < 0 && y < 0) {
            System.out.println("Quadrant 3!");
        } else if ( x == 0) {
            if (y == 0){
                System.out.println("Origin!");
            }else {
                System.out.println("X Axis!");
            }
        }else {
            System.out.println("Y Axis!");
        }
    }
}
