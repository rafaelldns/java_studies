package sequential_structure_exs;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, area;
        double pi = 3.14159;

        System.out.println("Enter the radius of the circle: ");
        r = sc.nextDouble();

        area = pi * Math.pow(r, 2.0);

        System.out.printf("The circle area: %.4f", area);
    }
}
