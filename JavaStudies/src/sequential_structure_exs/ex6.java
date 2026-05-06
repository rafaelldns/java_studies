package sequential_structure_exs;

import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("A : ");
        a = sc.nextDouble();
        System.out.print("B : ");
        b = sc.nextDouble();
        System.out.print("C : ");
        c = sc.nextDouble();

        double ta = (a * c)/2;
        double ca = 3.14159 * (Math.pow(c, 2));
        double za = ((a + b) * c)/2;
        double sa = Math.pow(b, 2);
        double ra = a * b;

        System.out.printf("Areas:\nTriangle: %.3f\nCircle: %.3f\nTrapeze: %.3f\nSquare: %.3f\nRetangle: %.3f", ta, ca, za, sa, ra);

    }
}
