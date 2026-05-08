package course._71;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pX, xA, xB, xC, pY, yA, yB, yC, aX, aY;
        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        pX = (xA + xB + xC)/2;
        aX = Math.sqrt(pX*(pX-xA)*(pX-xB)*(pX-xC));

        System.out.println("Enter the measures of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        pY = (yA + yB + yC)/2;
        aY = Math.sqrt(pY*(pY-yA)*(pY-yB)*(pY-yC));

        System.out.printf("Triangle X area: %.4f%nTriangle Y area: %.4f%n", aX, aY);

        if ( aX > aY ){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }
    }
}
