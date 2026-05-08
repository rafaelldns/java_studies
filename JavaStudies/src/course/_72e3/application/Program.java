package course._72e3.application;

import course._72e3.entities.Triangle;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double aX = x.area();
        double aY = y.area();

        System.out.printf("Triangle X area: %.4f%nTriangle Y area: %.4f%n", aX, aY);

        if ( aX > aY ){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }
    }
}
