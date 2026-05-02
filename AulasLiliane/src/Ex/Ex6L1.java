package Ex;

import java.util.Scanner;

public class Ex6L1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a number: ");
        float n1 = scanner.nextFloat();

        System.out.print("Insert another number: ");
        float n2 = scanner.nextFloat();

        float nr = n1 + n2;

        System.out.println("The sum of the number " + n1 + " and " + n2 + " is : " + nr);

    }
}
