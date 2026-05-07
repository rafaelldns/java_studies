package conditional_structure_exs;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;

        System.out.println("Insert a value: ");
        x = sc.nextDouble();

        if (x < 0) {
            System.out.println("Invalid Value!");
        } else if ( x <= 25){
            System.out.println("Interval [0, 25]");
        } else if ( x <= 50) {
            System.out.println("Interval [25, 50]");
        } else if ( x <= 75) {
            System.out.println("Interval [50, 75]");
        } else if (x <= 100) {
            System.out.println("interval [75, 100]");
        }else {
            System.out.println("Invalid value!");
        }
    }
}
