package Ex.Ex2;

import java.util.Scanner;

public class CalcArea {

    static void main(String[] args) {

        double bt,lt1,lt2, l1,l2, l, at, ar, as;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter base of triangle: ");
        bt = input.nextFloat();
        System.out.println("Enter side 1 trangle: ");
        lt1 = input.nextFloat();
        System.out.println("Enter side 2 triangle: ");
        lt2 = input.nextFloat();

        System.out.println("Enter side 1 Retangle: ");
        l1 = input.nextFloat();
        System.out.println("Enter side 2 Retangle: ");
        l2 = input.nextFloat();

        System.out.println("Enter side of Square: ");
        l = input.nextFloat();

        Triangle myTriangle = new Triangle(bt, lt1, lt2);
        //myTriangle.triangleValid();

        Retangle myRetangle = new Retangle(l1,l2);
        System.out.println("Rectangle area: " + myRetangle.areaR);

        Square mySquare = new Square(l);
        System.out.println("Square area: " + mySquare.areaS);

    }

}
